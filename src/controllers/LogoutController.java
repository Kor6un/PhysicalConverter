package controllers;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/jsp/logout")
public class LogoutController extends AbstractController {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logout(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logout(req, resp);
    }

    private void logout(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        req.getSession().invalidate();
        resp.sendRedirect("/index.jsp");
    }
}
