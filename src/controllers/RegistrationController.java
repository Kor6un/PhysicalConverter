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

@WebServlet("/jsp/reg")
public class RegistrationController extends AbstractController {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name, login, password;
        name = req.getParameter("name");
        login = req.getParameter("login");
        password = req.getParameter("password");
        try {
            User user = UserFactory.create(name, login, password);
            UserBase base = UserBase.getInstance();
            if (!base.findUser(user)) {
                base.addUser(user);
                forward("/index.jsp", req, resp);
            }
            throw new Exception("User already exist");
        } catch (Exception e) {
            forwardError("/jsp/register.jsp", e.getMessage(), req, resp);
        }
    }
}
