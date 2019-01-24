package main.java.myServlets;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class LoginServlet extends HttpServlet {

    private static final String LOGIN = "Vera";
    private static final String PASSWORD = "123qwe";

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String login = request.getParameter("login");
        String password = request.getParameter("password");
        String resultMessage;
        if (login.equals(LOGIN) && password.equals(PASSWORD)) {
            resultMessage = "Welcome " + login + "! :-)";
        } else {
            resultMessage = "Such login or password does not exist.";
        }

        request.setAttribute("resultMessage", resultMessage);
        request.getRequestDispatcher("/auth.jsp").forward(request, response);
    }
}
