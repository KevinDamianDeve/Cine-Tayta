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
@WebServlet(name = "Servletdetallepeli", urlPatterns = {"/Servletdetallepeli"})
public class Servletdetallepeli extends HttpServlet {

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
            out.println("<title>Servlet Servletdetallepeli</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Servletdetallepeli at " + request.getContextPath() + "</h1>");
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

         
            float Cantidad=Float.parseFloat(request.getParameter("ct"));
            String venta=request.getParameter("ven");
            String pelicula=request.getParameter("peli");
            String butaca=request.getParameter("but");
            MODEL.DetalleVentaPe p=new MODEL.DetalleVentaPe();

            p.setCantidad(Cantidad);
            p.setIdventa(venta);
            p.setIdpelicula(pelicula);
            p.setNbutaca(butaca);

            if(DAO.DetalleVentaPeDAO.registrar(p))
            {
                request.setAttribute("mensaje","Venta registrada");
            }
            else{
                request.setAttribute("mensaje","No se produjo el registro");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Servletdetallepeli.class.getName()).log(Level.SEVERE, null, ex);
        }
        request.getRequestDispatcher("RegistrarNuevodetallepeli.jsp").forward(request, response);
        
        
        
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
