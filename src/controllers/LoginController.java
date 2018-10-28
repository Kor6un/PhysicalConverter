package controllers;

import dao.UserBase;
import domain.dao_models.User;
import domain.dao_models.UserFactory;
import utils.exception.Exception;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

@WebServlet("/jsp/log")
public class LoginController extends AbstractController {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login, password;
        login = req.getParameter("login");
        password = req.getParameter("password");
        try {
            User user = UserFactory.create(login, password);
            if (UserBase.getInstance().findUser(user)) {
                req.setAttribute("user", user);
                forward("/index.jsp", req, resp);
            }
            forwardError("/jsp/login.jsp", "User is not exist", req, resp);
        } catch (Exception e) {
            forwardError("/jsp/login.jsp", e.getMessage(), req, resp);
        }
    }
}
