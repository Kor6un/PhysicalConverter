package controllers;

import dao.UserBase;
import services.Converter;
import utils.identifires.SpeedUnit;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static utils.constants.Constants.SPACE;

@WebServlet("/conv")
public class ConversionController extends AbstractController {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       // String result = req.getParameter("field");

       /* HttpSession session = req.getSession();
        session.setAttribute("result", result);*/

        // List<domain.service_models.Speed> speed = Arrays.asList(new domain.service_models.Speed(153, "ms"));

       // List<String> read = new utils.file_managers.DataReader2("d:\\1.txt").read();



      //  req.setAttribute("result", new DataReader2("d:\\JAVA\\src\\resources\\1.txt").read());

        String value = req.getParameter("field");
        String from = req.getParameter("from");
        String to = req.getParameter("to");

       // Speed speed = new Speed(Double.parseDouble(value), unit);

        SpeedUnit speedUnit = SpeedUnit.getExemplar(to);
        System.out.println(to);

        req.setAttribute("field", value);
        req.setAttribute("result", Converter.convert(value + SPACE + from, speedUnit));
        req.setAttribute("user", UserBase.getInstance().getUser());

        forward("/index.jsp", req, resp);

    }
}
