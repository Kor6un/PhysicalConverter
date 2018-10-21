package controllers;

import utils.file_managers.DataReader2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/conv")
public class ConversionController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       // String result = req.getParameter("field");

       /* HttpSession session = req.getSession();
        session.setAttribute("result", result);*/

        // List<domain.Speed> speed = Arrays.asList(new domain.Speed(153, "ms"));

       // List<String> read = new utils.file_managers.DataReader2("d:\\1.txt").read();

        req.setAttribute("result", new DataReader2("d:\\JAVA\\src\\resources\\1.txt").read());

        getServletContext().getRequestDispatcher("/index.jsp").forward(req, resp);

    }
}
