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
//import javax.servlet.an

/**
 *
 * @author Kevin Damian
 */
@WebServlet(name = "Servletcliente", urlPatterns = {"/Servletcliente"})
public class Servletcliente extends HttpServlet {

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
            out.println("<title>Servlet Servletcliente</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Servletcliente at " + request.getContextPath() + "</h1>");
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
            String direccion=request.getParameter("dir");
            String telefono=request.getParameter("tel");
           String dni=request.getParameter("dn");

            
              MODEL.Cliente us=new MODEL.Cliente();
            
            us.setNombre(nombre);
            us.setDireccion(direccion);
            us.setTelefono(telefono);
            us.setDni(dni);

            if(DAO.ClienteDAO.registrar(us))
            {
                request.setAttribute("mensaje","Cliente registrado");
            }
            else{
                request.setAttribute("mensaje","No se produjo el registro");
            }
        } catch (SQLException ex) 
        {
            Logger.getLogger(Servletcliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        request.getRequestDispatcher("RegistrarCliente.jsp").forward(request, response);
        
        
        
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
