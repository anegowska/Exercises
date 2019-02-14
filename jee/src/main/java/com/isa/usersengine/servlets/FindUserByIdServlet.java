package com.isa.usersengine.servlets;

import com.isa.usersengine.cdi.MaxPulseBean;
import com.isa.usersengine.dao.UsersRepositoryDao;
import com.isa.usersengine.domain.Gender;
import com.isa.usersengine.domain.User;

import javax.ejb.EJB;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/find-user-by-id")
public class FindUserByIdServlet extends HttpServlet {

    @EJB
    private UsersRepositoryDao usersRepositoryDao;

    @Inject
    private MaxPulseBean maxPulseBean;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String idParam = req.getParameter("id");
        PrintWriter writer = resp.getWriter();


        if(idParam == null || idParam.isEmpty()){
            resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            return;
        }

        Integer id = Integer.parseInt(idParam);

        User userById = usersRepositoryDao.getUserById(id);


        if (userById != null) {
            writer.println("Name: " + userById.getName());
            writer.println("Login: " + userById.getLogin());
        }
        if (userById.getGender().equals(Gender.MAN)) {
            writer.println("Max pulse for man: " + maxPulseBean.getManMaxPulse(userById.getAge()));
        }else if (userById.getGender().equals(Gender.WOMAN)) {
            writer.println("Max pulse for woman: " + maxPulseBean.getWomanMaxPulse(userById.getAge()));

        }else {
            writer.println("User has not been found.");
            resp.setStatus(HttpServletResponse.SC_NOT_FOUND);
            return;
        }

    }
}
