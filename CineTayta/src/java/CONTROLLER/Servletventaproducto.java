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
@WebServlet(name = "Servletventaproducto", urlPatterns = {"/Servletventaproducto"})
public class Servletventaproducto extends HttpServlet {

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
            out.println("<title>Servlet Servletventaproducto</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Servletventaproducto at " + request.getContextPath() + "</h1>");
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
         
        String serie=request.getParameter("ser");
        String fecha=request.getParameter("fec");
        String estado=request.getParameter("est");
float subtotal=Float.parseFloat(request.getParameter("st"));
float igv=Float.parseFloat(request.getParameter("ig"));
float total=Float.parseFloat(request.getParameter("tot"));
            String cliente=request.getParameter("codc");
            String usuario=request.getParameter("codu");


            MODEL.Ventapro ge=new MODEL.Ventapro();
            
         ge.setSerie(serie);
         ge.setFecha(fecha);
         ge.setEstado(estado);
         ge.setSub_total(subtotal);
         ge.setIgv(igv);
       ge.setTotal(total);
       ge.setIdcliente(cliente);
         ge.setIdusuario(usuario);
            
            
            if(DAO.VentaproDAO.registrar(ge))
            {
                request.setAttribute("mensaje","Venta registrada");
            }
            else{
                request.setAttribute("mensaje","No se produjo el registro");
            }
        } catch (SQLException ex) 
        {
            Logger.getLogger(Servletventaproducto.class.getName()).log(Level.SEVERE, null, ex);
        }
        request.getRequestDispatcher("Registrarventaproducto.jsp").forward(request, response);
        
        
        
        
        
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
