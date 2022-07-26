package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Listardocumento_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("<link rel=\"https:https://cdn.datatables.net/1.10.19/css/jquery.dataTables.min.css\">\n");
      out.write("<link rel=\"https:https://cdn.datatables.net/buttons/1.5.2/css/buttons.dataTables.min.css\">\n");
      out.write("\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.3.1.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"https://cdn.datatables.net/1.10.19/js/jquery.dataTables.min.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"https://cdn.datatables.net/rowreorder/1.2.3/js/dataTables.rowReorder.min.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"https://cdn.datatables.net/responsive/2.2.1/js/dataTables.responsive.min.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"https://cdn.datatables.net/buttons/1.5.2/js/buttons.print.min.js\"></script>\n");
      out.write("\n");
      out.write("<script src=\"https://cdn.datatables.net/buttons/1.5.2/js/dataTables.buttons.min.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/jszip/3.1.3/jszip.min.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/pdfmake/0.1.36/pdfmake.min.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/pdfmake/0.1.36/vfs_fonts.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"https://cdn.datatables.net/buttons/1.5.2/js/buttons.html5.min.js\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdn.datatables.net/1.10.19/css/jquery.dataTables.min.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdn.datatables.net/rowreorder/1.2.3/css/rowReorder.dataTables.min.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdn.datatables.net/responsive/2.2.1/css/responsive.dataTables.min.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css\">\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdn.datatables.net/buttons/1.5.2/css/buttons.dataTables.min.css\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        \n");
      out.write("         <script>\n");
      out.write("$(document).ready(function() {\n");
      out.write("    var table = $('#tabla').DataTable( {\n");
      out.write("        rowReorder: {\n");
      out.write("            selector: 'td:nth-child(2)'\n");
      out.write("        },\n");
      out.write("        fixedHeader: true,\n");
      out.write("        responsive: true,\n");
      out.write("        autoFill: true,\n");
      out.write("        paging: true,\n");
      out.write("        ordering: true,\n");
      out.write("        searching: true,\n");
      out.write("        info: true,\n");
      out.write("        scrollY:        200,\n");
      out.write("        deferRender:    true,\n");
      out.write("        scroller:       true,\n");
      out.write("        \n");
      out.write("        language:{\n");
      out.write("            url: \"//cdn.datatables.net/plug-ins/1.10.19/i18n/Spanish.json\"\n");
      out.write("        },\n");
      out.write("        lengthMenu: [\n");
      out.write("            [ 10, 25, 50, -1 ],\n");
      out.write("            [ '10 Filas', '25 Filas', '50 Filas', 'Todos' ]\n");
      out.write("        ],\n");
      out.write("        dom: 'Bfrtip',\n");
      out.write("        buttons: [\n");
      out.write("            'copyHtml5',\n");
      out.write("            'excelHtml5',\n");
      out.write("            'csvHtml5',\n");
      out.write("            'print',\n");
      out.write("            'pageLength',\n");
      out.write("            {\n");
      out.write("                extend: 'pdfHtml5',\n");
      out.write("                download: 'open'\n");
      out.write("            }\n");
      out.write("        ]\n");
      out.write("     \n");
      out.write("    } );\n");
      out.write("    \n");
      out.write("    \n");
      out.write("\n");
      out.write("} );\n");
      out.write("</script>\n");
      out.write("        <title>Listar Usuarios</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("     <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-8\">\n");
      out.write("                    \n");
      out.write("                    <table class=\"table-striped display\" id=\"tabla\">\n");
      out.write("                        <thead>\n");
      out.write("                            <tr class=\"bg-warning\" border=\"1\" >\n");
      out.write("                                <th>Codigo</th>\n");
      out.write("                                <th>Tipo</th>                               \n");
      out.write("                                \n");
      out.write("                                \n");
      out.write("                            </tr>\n");
      out.write("                            \n");
      out.write("                        </thead>\n");
      out.write("                        <tbody>\n");
      out.write("                            ");
 for(MODEL.TipoDocumento p:DAO.TipoDocumentoDAO.listar()) { 
      out.write("\n");
      out.write("                            <tr>\n");
      out.write("                            <td width='5' > ");
      out.print( p.getIdtipo_documento());
      out.write("</td>\n");
      out.write("                            <td width='5'> ");
      out.print( p.getTipo());
      out.write(" </td>\n");
      out.write("                       \n");
      out.write("                            </tr>\n");
      out.write("                             ");
 } 
      out.write("\n");
      out.write("                        </tbody>\n");
      out.write("                    </table>\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("         <div class=\"row\">\n");
      out.write("                 <div class=\"col-lg-4\">\n");
      out.write("              <!-- Button trigger modal -->\n");
      out.write("                <button type=\"button\" class=\"btn btn-outline-primary\" data-toggle=\"modal\" data-target=\"#exampleModal\">\n");
      out.write("                  Registrar Nuevo Tipo\n");
      out.write("                </button>\n");
      out.write("                 </div>\n");
      out.write("             </div>\n");
      out.write("                        <br>\n");
      out.write("                      ");
      out.write("    \n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("                      \n");
      out.write("                      <div class=\"modal fade\" id=\"exampleModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\n");
      out.write("  <div class=\"modal-dialog\" role=\"document\">\n");
      out.write("    <div class=\"modal-content\">\n");
      out.write("      <div class=\"modal-header\">\n");
      out.write("        <h5 class=\"modal-title\" id=\"exampleModalLabel\">Registrar Tipo</h5>\n");
      out.write("         </div>\n");
      out.write("      <div class=\"modal-body\">\n");
      out.write("        <!-- 4:3 aspect ratio -->\n");
      out.write("                <div class=\"embed-responsive embed-responsive-4by3\">\n");
      out.write("                  <iframe class=\"embed-responsive-item\" src=\"RegistrarTipodocumento.jsp\"></iframe>\n");
      out.write("                </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"modal-footer\">\n");
      out.write("        <button type=\"button\" class=\"btn btn-info\" data-dismiss=\"modal\" onclick= \"self.location.href = 'Listardocumento.jsp'\">Salir </button>\n");
      out.write("        <!--<button type=\"button\" class=\"btn btn-primary\">Save changes</button>-->\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>  \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("             <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js\" integrity=\"sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js\" integrity=\"sha384-smHYKdLADwkXOn1EmN1qk/HfnUcbVRZyYmZ4qpPea6sjB/pTJ0euyQp0Mk8ck+5T\" crossorigin=\"anonymous\"></script>\n");
      out.write("  \n");
      out.write("        \n");
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
