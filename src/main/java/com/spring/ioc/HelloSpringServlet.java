package com.spring.ioc;

import com.spring.ioc.normal.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author ccQi
 * @Package com.spring.ioc
 * @Description: TODO
 * @date
 */
@WebServlet("/hello")
public class HelloSpringServlet extends HttpServlet {

    private UserServiceImpl userService = new UserServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println("hello spring");
        resp.getWriter().println(userService.findAll());
    }
}
