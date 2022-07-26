package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import DAO.ConsultasDAO;
import DAO.Conexion;
import javax.swing.table.DefaultTableModel;

public final class ticket_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("       <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\" integrity=\"sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("   <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <form action=\"index.jsp\" name=\"form1\" class=\"table table-responsive\">\n");
      out.write("                    <div class=\"form-group col-md-12\">\n");
      out.write("                        <div class=\"form-row\">\n");
      out.write("                        <div class=\"col-md-4\">\n");
      out.write("                            <label for=\"\">Nro de Factura</label>\n");
      out.write("                            <input type=\"text\" id=\"fact\" name=\"fact\" class=\"form-control\">\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                        <div class=\"col-md-4\">\n");
      out.write("                            <label for=\"\">Fecha Inicial</label>\n");
      out.write("                            <input type=\"text\" id=\"f1\" name=\"f1\" class=\"form-control\">\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                        <div class=\"col-md-4\">\n");
      out.write("                            <label for=\"\">Fecha Final</label>\n");
      out.write("                            <input type=\"text\" id=\"f2\" name=\"f2\" class=\"form-control\">\n");
      out.write("                        </div>\n");
      out.write("                                                  \n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                        <div class=\"form-row mt-2\">\n");
      out.write("                            <input type=\"submit\" value=\"Buscar\" class=\"btn btn-danger\" href=\"index.jsp\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-12\">\n");
      out.write("                    <input type=\"text\" id=\"Cod\" name=\"Cod\" class=\"form-control\" hidden>\n");
      out.write("                    <form action=\"post\" name=\"form1\">\n");
      out.write("                        <table id=\"tabla\" class=\"table table-striped table-bordered table-responsive-md\">\n");
      out.write("                            <thead>\n");
      out.write("                                <tr class=\"bg-primary\">\n");
      out.write("                                    <th></th>\n");
      out.write("                                    <th>Nombre</th>\n");
      out.write("                                    <th>Duracion</th>\n");
      out.write("                                    <th>Hora</th>\n");
      out.write("                                    <th>Cantidad</th>\n");
      out.write("                                    <th>Sala</th>\n");
      out.write("                                    <th>Butaca</th>\n");
      out.write("                                    <th>Precio</th>\n");
      out.write("                                      <th>Total</th>\n");
      out.write("                                        <th>Cliente</th>\n");
      out.write("                                          <th>Usuario</th>\n");
      out.write("                                </tr>\n");
      out.write("                            </thead>\n");
      out.write("                            <tbody>\n");
      out.write("                                ");

                                    ConsultasDAO v=new ConsultasDAO();
                                    Conexion cn=new Conexion();
                                    DefaultTableModel t=new DefaultTableModel();
                                    String fact=request.getParameter("id");
                                    t=v.ListaVentasxTipo(fact, cn.conectar());
                                    for(int i=0;i<t.getRowCount();i++)
                                    {
                                    
      out.write("\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>");
      out.print( t.getValueAt(i, 0) );
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print( t.getValueAt(i, 1) );
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print( t.getValueAt(i, 2) );
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print( t.getValueAt(i, 3) );
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print( t.getValueAt(i, 4) );
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print( t.getValueAt(i, 5) );
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print( t.getValueAt(i, 6) );
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print( t.getValueAt(i, 7) );
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print( t.getValueAt(i, 8) );
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print( t.getValueAt(i, 9) );
      out.write("</td>\n");
      out.write("                                       \n");
      out.write("                                    </tr>\n");
      out.write("                                    ");
 } 
      out.write("\n");
      out.write("                            </tbody>\n");
      out.write("                        </table>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("               <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js\" integrity=\"sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js\" integrity=\"sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy\" crossorigin=\"anonymous\"></script>\n");
      out.write("  \n");
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
