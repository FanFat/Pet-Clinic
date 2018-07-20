package app.servlets;

import app.model.Clinic;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class ListServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Clinic clinic = Clinic.getInstance();
        List<String> names = clinic.list();
        List<String> petName = clinic.listPet();
        List<String> kindPet = clinic.listKindPet();
        req.setAttribute("userNames", names);
        req.setAttribute("petName", petName);
        req.setAttribute("kindPet", kindPet);


        RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/list.jsp");
        requestDispatcher.forward(req, resp);

    }
}
