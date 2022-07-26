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
@WebServlet(name = "Servletmodificarusu", urlPatterns = {"/Servletmodificarusu"})
public class Servletmodificarusu extends HttpServlet {

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
            out.println("<title>Servlet Servletmodificarusu</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Servletmodificarusu at " + request.getContextPath() + "</h1>");
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
        String telefono=request.getParameter("tel");
        String dni=request.getParameter("dn");
        String cargo=request.getParameter("car");
        String usuario=request.getParameter("usu");
        String contraseña=request.getParameter("con");
        int nivel=Integer.parseInt(request.getParameter("niv"));
   
            
            
            MODEL.Usuario p=new MODEL.Usuario();
            p.setIdusuario(codigo);
            p.setNombre(nombre);
            p.setTelefono(telefono);
            p.setDni(dni);
            p.setCargo(cargo);
            p.setUsuario(usuario);
            p.setContraseña(contraseña);
            p.setNivel(nivel);
          
          
            
        
            if(DAO.UsuarioDAO.modificarusuario(p))
            {
                request.setAttribute("mensaje", "Usuario Modificado");
            }else
            {
                request.setAttribute("mensaje", "Usuario no Modificado");
            }
            request.getRequestDispatcher("modificarusuario.jsp").forward(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(Servletmodificarusu.class.getName()).log(Level.SEVERE, null, ex);
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
