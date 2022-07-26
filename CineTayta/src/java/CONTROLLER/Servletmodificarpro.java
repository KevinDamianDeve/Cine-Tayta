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
@WebServlet(name = "Servletmodificarpro", urlPatterns = {"/Servletmodificarpro"})
public class Servletmodificarpro extends HttpServlet {

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
            out.println("<title>Servlet Servletmodificarpro</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Servletmodificarpro at " + request.getContextPath() + "</h1>");
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
        String descripcion=request.getParameter("des");
            float precio=Float.parseFloat(request.getParameter("pr"));
            float Stock=Float.parseFloat(request.getParameter("st"));
            String fecha=request.getParameter("f");
            String presentacion=request.getParameter("pres");
            String estado=request.getParameter("est");
            String observacion=request.getParameter("obs");
            
            
            MODEL.Producto p=new MODEL.Producto();
            p.setIdproducto(codigo);
             p.setDescripcion(descripcion);
            p.setPrecio(precio);
            p.setStock(Stock);
            p.setFechav(fecha);
            p.setPresentacion(presentacion);
            p.setEstado(estado);
            p.setObservacion(observacion);
          
            
        
            if(DAO.ProductoDAO.modificarproducto(p))
            {
                request.setAttribute("mensaje", "Producto Modificado");
            }else
            {
                request.setAttribute("mensaje", "Producto no Modificado");
            }
            request.getRequestDispatcher("modificarproducto.jsp").forward(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(Servletmodificarpro.class.getName()).log(Level.SEVERE, null, ex);
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
