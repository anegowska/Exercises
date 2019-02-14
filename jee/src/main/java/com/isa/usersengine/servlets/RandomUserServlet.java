package com.isa.usersengine.servlets;

import com.isa.usersengine.cdi.RandomUserCDIApplicationDao;
import com.isa.usersengine.cdi.RandomUserCDIRequestDao;
import com.isa.usersengine.cdi.RandomUserCDISessionDao;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/random-user")
public class RandomUserServlet extends HttpServlet {

    @Inject
    RandomUserCDIApplicationDao randomUserCDIApplicationDao;

    @Inject
    RandomUserCDIRequestDao randomUserCDIRequestDao;

    @Inject
    RandomUserCDISessionDao randomUserCDISessionDao;


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PrintWriter writer = resp.getWriter();

        writer.println("Application scoped: " + randomUserCDIApplicationDao.getRandomUser());
        writer.println("Request scoped: " + randomUserCDIRequestDao.getRandomUser());
        writer.println("Session scoped: " + randomUserCDISessionDao.getRandomUser());

    }
}
