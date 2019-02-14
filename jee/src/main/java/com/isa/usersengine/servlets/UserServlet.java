package com.isa.usersengine.servlets;

import com.isa.usersengine.cdi.FileUploadProcessor;
import com.isa.usersengine.dao.UsersRepositoryDao;
import com.isa.usersengine.domain.User;
import com.isa.usersengine.exeptions.UserImageNotFound;
import com.isa.usersengine.freemarker.TemplateProvider;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@WebServlet("/user")
public class UserServlet extends HttpServlet {

    private static final Logger LOG = LoggerFactory.getLogger(UserServlet.class);

    private static final String TEMPLATE_NAME = "add-user";

    @Inject
    private UsersRepositoryDao usersRepositoryDao;

    @Inject
    private TemplateProvider templateProvider;

    @Inject
    private FileUploadProcessor fileUploadProcessor;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Map<String, Object> model = new HashMap<>();

        Template template = templateProvider.getTemplate(
                getServletContext(), TEMPLATE_NAME
        );

        try {
            template.process(model, resp.getWriter());
        } catch (TemplateException e) {
            LOG.error("Error while processing template: ", e);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        User user = new User();
        PrintWriter writer = resp.getWriter();

        writer.println("Users count before adding: " + usersRepositoryDao.getUserList().size());

        user.setId(Integer.valueOf(req.getParameter("id")));
        user.setName(req.getParameter("name"));
        user.setLogin(req.getParameter("login"));
        user.setPassword(req.getParameter("password"));
        user.setAge(Integer.valueOf(req.getParameter("age")));

        usersRepositoryDao.addUser(user);

        Part part = req.getPart("image");

        try {
            File image = fileUploadProcessor.uploadImageFile(part);
            String imageName = image.getName();
            user.setImageURL("/images/" + imageName);
        } catch (UserImageNotFound userImageNotFound) {
            LOG.warn("Image not found");
        }

        writer.println("Users count after adding: " + usersRepositoryDao.getUserList().size());

    }

}



