package ar.com.example.proyectocodoacodo2022.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/*HERENCIA*/
//Create Controller es hijo de :
@WebServlet("/CreateController")
public class CreateController extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        int idPersona = Integer.parseInt(req.getParameter("idPersona"));
        String nombre = req.getParameter("nombre");
        String apellido = req.getParameter("apellido");
        int edad = Integer.parseInt(req.getParameter("edad"));



    }
}