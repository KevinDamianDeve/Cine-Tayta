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
@WebServlet(name = "Servletmodificarpelicula", urlPatterns = {"/Servletmodificarpelicula"})
public class Servletmodificarpelicula extends HttpServlet {

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
            out.println("<title>Servlet Servletmodificarpelicula</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Servletmodificarpelicula at " + request.getContextPath() + "</h1>");
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
        String codigo=request.getParameter("cod");
        String nombre=request.getParameter("nom");
        String duracion=request.getParameter("dur");
        String pais=request.getParameter("pai");
        String año=request.getParameter("an");
        String director=request.getParameter("direc");
        String prota=request.getParameter("prot");
        String genero=request.getParameter("idg");
        String hora=request.getParameter("hc");
        float precio=Float.parseFloat(request.getParameter("pre"));
        String sala=request.getParameter("sal");
     
            
            
            MODEL.Pelicula p=new MODEL.Pelicula();
            p.setIdpelicula(codigo);
            p.setNombre(nombre);
            p.setDuracion(duracion);
            p.setPais(pais);
            p.setAño(año);
             p.setDirector(director);
          p.setProtagonistas(prota);
            p.setIdgenero(genero);
            p.setHora_c(hora);
            p.setPrecio(precio);
            p.setNsala(sala);
        
            if(DAO.PeliculaDAO.modificarpelicula(p))
            {
                request.setAttribute("mensaje", "<h4> Pelicula Modificada</h4>");
            }else
            {
                request.setAttribute("mensaje", "Pelicula no Modificado");
            }
            request.getRequestDispatcher("modificarpelicula.jsp").forward(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(Servletmodificarpelicula.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
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
