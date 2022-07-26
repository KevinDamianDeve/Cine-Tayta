package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import DAO.Operaciones;

public final class Index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html> \n");
      out.write("    <head>\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("<!--\n");
      out.write(" body{\n");
      out.write("background-attachment: fixed;\n");
      out.write("background-image: url(fotos/fondo3.png);\n");
      out.write("background-repeat: no-repeat;\n");
      out.write("background-position: center center;\n");
      out.write("}\n");
      out.write("-->\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\"content=\"widht=device-widht, user-scalable=no; initial-scale=1,maximum-\n");
      out.write("             scale=1,minimun-scale=1\"   >\n");
      out.write("        <link href=\"Css/estilos.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <title>::.LOGUIN.::</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("   \n");
      out.write("    \n");
      out.write("        \n");
      out.write("                                     <form action=\"Index.jsp\" method=\"post\" >\n");
      out.write("                                         <h2><font color=\"green\"  >Sistema de Cine Tayta '-'</font></h2>\n");
      out.write("                      \n");
      out.write("                         <input type=\"text\" name=\"txtusuario\" placeholder=\"&#128273;  Ingrese Usuario\"\n");
      out.write("                                > <br><br>\n");
      out.write("                  \n");
      out.write("                         <input type=\"password\" name=\"txtcontra\" placeholder=\" &#128273; Contraseña\" >\n");
      out.write("                         <br><br>\n");
      out.write("                         \n");
      out.write("                         <input type=\"submit\" name=\"btnIniciar\" value=\"Iniciar Sesion\"  >\n");
      out.write("                    \n");
      out.write("                \n");
      out.write("                        </form>\n");
      out.write("   \n");
      out.write("                     \n");
      out.write("\n");
      out.write("                     \n");
      out.write("                 \n");
      out.write("              \n");
      out.write("            \n");
      out.write("            ");

           Operaciones op =new Operaciones();
           if(request.getParameter("btnIniciar")!=null )
           {
               String nombre=request.getParameter("txtusuario");
               String contra=request.getParameter("txtcontra");
               HttpSession sesion=request.getSession();
               switch(op.loguear(nombre, contra))
               {
                   case 1:
                       
                       sesion.setAttribute("user", nombre);
                       sesion.setAttribute("nivel", "1");
                       response.sendRedirect("admin.jsp");
                       break;
                   case 2:
                        sesion.setAttribute("user", nombre);
                       sesion.setAttribute("nivel", "2");
                       response.sendRedirect("Vendedor.jsp");
                         break;
                         
                         case 3:
                        sesion.setAttribute("user", nombre);
                       sesion.setAttribute("nivel", "3");
                       response.sendRedirect("Vendedor2.jsp");
                         break;
                         
                         default:
                             out.write(" Usuario no existe, o contraseña invalida ");
                             
                         break;
                   
               }  
           }
           
            if(request.getParameter("cerrar")!=null)
            {
                session.invalidate();
            }



            
            
      out.write("\n");
      out.write("            \n");
      out.write("\n");
      out.write("      \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
