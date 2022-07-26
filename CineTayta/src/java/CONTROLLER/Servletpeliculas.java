/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLLER;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Kevin Damian
 */
@WebServlet(name = "Servletpeliculas", urlPatterns = {"/Servletpeliculas"})
public class Servletpeliculas extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Servletpeliculas</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Servletpeliculas at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         
        try {
            String nombre=request.getParameter("nom");        
            String duracion=request.getParameter("dur");
            String pais=request.getParameter("pai");
            String año=request.getParameter("an");
            String director=request.getParameter("dire");
            String protagonistas=request.getParameter("prot");
            String genero=request.getParameter("gen");
            String hora=request.getParameter("hc");
            float precio=Float.parseFloat(request.getParameter("pre"));
            String sala=request.getParameter("nsa");
            
            
            MODEL.Pelicula p=new MODEL.Pelicula();
            
            p.setNombre(nombre);
            p.setDuracion(duracion);
            p.setPais(pais);
            p.setAño(año);
            p.setDirector(director);
            p.setProtagonistas(protagonistas);
            p.setIdgenero(genero);
            p.setHora_c(hora);
           p.setPrecio(precio);
           p.setNsala(sala);
           
            
            if(DAO.PeliculaDAO.registrar(p))
            {
                request.setAttribute("mensaje","Pelicula registrada");
            }
            else{
                request.setAttribute("mensaje","No se produjo el registro");
            }
        } catch (SQLException ex) 
        {
            Logger.getLogger(Servletpeliculas.class.getName()).log(Level.SEVERE, null, ex);
        }
        request.getRequestDispatcher("RegistrarPeliculas.jsp").forward(request, response);
        
        
        
        
        
        
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
