package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("   <head>\n");
      out.write("       \n");
      out.write("              <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <title>::.INICIO.::</title>\n");
      out.write("        \n");
      out.write("        <link href=\"css/sweetalert2.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        \n");
      out.write("        <link href=\"plugins/DATATABLE/css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"plugins/DATATABLE/css/buttons.dataTables.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"plugins/DATATABLE/css/jquery.dataTables.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"plugins/DATATABLE/css/responsive.dataTables.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"plugins/DATATABLE/css/rowReorder.dataTables.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        \n");
      out.write("        <script src=\"plugins/DATATABLE/js/buttons.html5.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"plugins/DATATABLE/js/buttons.print.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"plugins/DATATABLE/js/dataTables.buttons.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"plugins/DATATABLE/js/dataTables.responsive.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"plugins/DATATABLE/js/dataTables.rowReorder.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        \n");
      out.write("        <script src=\"plugins/DATATABLE/js/jquery-3.3.1.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"plugins/DATATABLE/js/jquery.dataTables.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"plugins/DATATABLE/js/jszip.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"plugins/DATATABLE/js/pdfmake.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"plugins/DATATABLE/js/vfs_fonts.js\" type=\"text/javascript\"></script>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("<style type=\"text/css\">\n");
      out.write("<!--\n");
      out.write("body {\n");
      out.write("background-attachment: fixed;\n");
      out.write("background-image: url(fotos/fondo.jpg);\n");
      out.write("background-repeat: no-repeat;\n");
      out.write("background-position: center center;\n");
      out.write("}\n");
      out.write("-->\n");
      out.write("</style>\n");
      out.write("       \n");
      out.write("\n");
      out.write("       <script type=\"text/javascript\" src=\"http://code.jquery.com/jquery.js\"></script>\n");
      out.write("       \n");
      out.write("            <link href=\"Css/estilosadmin.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("<script src=\"http://code.jquery.com/jquery-latest.js\" ></script>\n");
      out.write("<script src=\"Css/main.js\" type=\"text/javascript\"></script>\n");
      out.write("<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\" integrity=\"sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO\" crossorigin=\"anonymous\">\n");
      out.write("  \n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head> \n");
      out.write("\n");
      out.write("  \n");
      out.write("    <body  >\n");
      out.write("        ");

        HttpSession sesion =request.getSession();
        String usuario;
        String nivel;
        if(sesion.getAttribute("user") !=null && sesion.getAttribute("nivel")!=null )
        {
          usuario=sesion.getAttribute("user").toString();
                  nivel=sesion.getAttribute("nivel").toString();
           out.print("<a href='Index.jsp?cerrar=true'><h5> 	&#8272; Cerrar Sesion</h5> </a> ");
                  out.print("<hr>");
        } else
        {
            out.print("<script>location.replace('Index.jsp');</script> " );
        }

        
      out.write("\n");
      out.write("        <div class=\"container\" >\n");
      out.write("            <div class=\"row\" >\n");
      out.write("                <div class=\"col-lg-2\" >\n");
      out.write("                   \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"row\">\n");
      out.write("        <div class=\"col-lg-10\">\n");
      out.write("            <nav class=\"navbar navbar-expand-lg navbar-dark bg-dark\">\n");
      out.write("                <a class=\"navbar-brand\" href=\"admin.jsp\">Cine TAYTA</a>\n");
      out.write("\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("                    <ul class=\"navbar-nav mr-auto\">\n");
      out.write("                        \n");
      out.write("                        <li class=\"nav-item active\">\n");
      out.write("                          <a class=\"nav-link\" href=\"admin.jsp\">Inicio<span class=\"sr-only\">(current)</span></a>\n");
      out.write("                        </li>\n");
      out.write("                        \n");
      out.write("                        <li class=\"nav-item active dropdown\">\n");
      out.write("                            <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"barraProducto\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                            Peliculas</a>\n");
      out.write("                        <div class=\"dropdown-menu\" aria-labelledby=\"barraPeliculas\">\n");
      out.write("<!--Registrar producto <a class=\"dropdown-item \" href=\"RegistrarProducto.jsp\">Registrar Producto</a>--->\n");
      out.write("<!--Modificar producto <a class=\"dropdown-item\" href=\"ModificarProducto.jsp\">Modificar Producto</a> --->\n");
      out.write(" <!-- espacio para otros  <div class=\"dropdown-divider\"></div> -->\n");
      out.write("<!--Listar producto---><a class=\"dropdown-item\" href=\"ListarPeliculas.jsp\">Mostrar Peliculas</a>\n");
      out.write("                        <a class=\"dropdown-item\" href=\"ListarSalas.jsp\">Mostar Salas</a>\n");
      out.write("                        <a class=\"dropdown-item\" href=\"Listarbutacas.jsp\">Mostrar Butacas</a>\n");
      out.write("                        <a class=\"dropdown-item\" href=\"Listargeneros.jsp\">Mostrar Genero</a>\n");
      out.write("                        </div>\n");
      out.write("                        </li>\n");
      out.write("                        \n");
      out.write("                        <li class=\"nav-item active dropdown\">\n");
      out.write("                            <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"barraProducto\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                            Productos</a>\n");
      out.write("                        <div class=\"dropdown-menu\" aria-labelledby=\"barraProducto\">\n");
      out.write("<!--Registrar producto <a class=\"dropdown-item \" href=\"RegistrarProducto.jsp\">Registrar Producto</a>--->\n");
      out.write("<!--Modificar producto <a class=\"dropdown-item\" href=\"ModificarProducto.jsp\">Modificar Producto</a> --->\n");
      out.write(" <!-- espacio para otros  <div class=\"dropdown-divider\"></div> -->\n");
      out.write("<!--Listar producto---><a class=\"dropdown-item\" href=\"Listarproductos.jsp\">Mostrar Producto</a>\n");
      out.write("                    <a class=\"dropdown-item\" href=\"ListarCompraProduc.jsp\"> Compras</a>\n");
      out.write("                        </div>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item active dropdown\">\n");
      out.write("                            <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"barraProveedor\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                           Proveedor</a>\n");
      out.write("                        <div class=\"dropdown-menu\" aria-labelledby=\"barraProveedor\">\n");
      out.write("<!--Registrar producto <a class=\"dropdown-item\" href=\"RegistrarProveedor.jsp\">Registrar Proveedor</a>--->\n");
      out.write("<!--Modificar producto <a class=\"dropdown-item\" href=\"ModificarProveedor.jsp\">Modificar Proveedor</a>--->\n");
      out.write(" <!-- espacio para otros  <div class=\"dropdown-divider\"></div> -->\n");
      out.write("<!--Listar producto---><a class=\"dropdown-item\" href=\"Listarproveedor.jsp\">Mostrar Proveedor</a>\n");
      out.write("                        </div>\n");
      out.write("                        </li>\n");
      out.write("                        \n");
      out.write("                         <li class=\"nav-item active dropdown\">\n");
      out.write("                            <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"barraProveedor\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                            Clientes</a>\n");
      out.write("                        <div class=\"dropdown-menu\" aria-labelledby=\"barraProveedor\">\n");
      out.write("<!--Registrar producto <a class=\"dropdown-item\" href=\"RegistrarProveedor.jsp\">Registrar Proveedor</a>--->\n");
      out.write("<!--Modificar producto <a class=\"dropdown-item\" href=\"ModificarProveedor.jsp\">Modificar Proveedor</a>--->\n");
      out.write(" <!-- espacio para otros  <div class=\"dropdown-divider\"></div> -->\n");
      out.write("<!--Listar producto---><a class=\"dropdown-item\" href=\"Listarcliente.jsp\">Mostrar Clientes</a>\n");
      out.write("                        </div>\n");
      out.write("                        </li>\n");
      out.write("                         <li class=\"nav-item active dropdown\">\n");
      out.write("                            <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"barraProveedor\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                            Usuarios</a>\n");
      out.write("                        <div class=\"dropdown-menu\" aria-labelledby=\"barraProveedor\">\n");
      out.write("<!--Registrar producto <a class=\"dropdown-item\" href=\"RegistrarProveedor.jsp\">Registrar Proveedor</a>--->\n");
      out.write("<!--Modificar producto <a class=\"dropdown-item\" href=\"ModificarProveedor.jsp\">Modificar Proveedor</a>--->\n");
      out.write(" <!-- espacio para otros  <div class=\"dropdown-divider\"></div> -->\n");
      out.write("<!--Listar producto---><a class=\"dropdown-item\" href=\"ListarUsuaro.jsp\">Mostrar Usuarios</a>\n");
      out.write("                        \n");
      out.write("                        </div>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item active dropdown\">\n");
      out.write("                            <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"barraProveedor\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                            Ventas de Peliculas</a>\n");
      out.write("                        <div class=\"dropdown-menu\" aria-labelledby=\"barraProveedor\">\n");
      out.write("<!--Registrar producto <a class=\"dropdown-item\" href=\"RegistrarProveedor.jsp\">Registrar Proveedor</a>--->\n");
      out.write("<!--Modificar producto <a class=\"dropdown-item\" href=\"ModificarProveedor.jsp\">Modificar Proveedor</a>--->\n");
      out.write(" <!-- espacio para otros  <div class=\"dropdown-divider\"></div> -->\n");
      out.write("<!--Listar producto---><a class=\"dropdown-item\" href=\"Listarventapeliculas.jsp\">Registar</a>\n");
      out.write("                        <a class=\"dropdown-item\" href=\"ListarDetalleVentaPelicula.jsp\">Realizar Venta</a>\n");
      out.write("                        \n");
      out.write("                        </div>\n");
      out.write("                        </li>\n");
      out.write("                        \n");
      out.write("                        <li class=\"nav-item active dropdown\">\n");
      out.write("                            <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"barraProveedor\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                            Ventas de Productos</a>\n");
      out.write("                        <div class=\"dropdown-menu\" aria-labelledby=\"barraProveedor\">\n");
      out.write("<!--Registrar producto <a class=\"dropdown-item\" href=\"RegistrarProveedor.jsp\">Registrar Proveedor</a>--->\n");
      out.write("<!--Modificar producto <a class=\"dropdown-item\" href=\"ModificarProveedor.jsp\">Modificar Proveedor</a>--->\n");
      out.write(" <!-- espacio para otros  <div class=\"dropdown-divider\"></div> -->\n");
      out.write("<!--Listar producto---><a class=\"dropdown-item\" href=\"ListarVentaProductos.jsp\">Registar </a>\n");
      out.write("                        <a class=\"dropdown-item\" href=\"ListarDetalleVentaProducto.jsp\">Venta Producto</a>\n");
      out.write("                        \n");
      out.write("                        </div>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>                     \n");
      out.write("\n");
      out.write("                </div>                    \n");
      out.write("            </nav>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div class=\"container\" >\n");
      out.write("        <div class=\"row\" >\n");
      out.write("            <div class=\"col-lg-8\" >\n");
      out.write("                <table border=\"1\" width=\"920\"> <!-- Lo cambiaremos por CSS -->\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            <table width=\"100%\"  border=\"0\" bgcolor=\"firebrick\" >\n");
      out.write("                                <td width=\"200\"  > <img src=\"fotos/imageninicio.jpg\" width=\"250\" height=\"100\"/></td>\n");
      out.write("                                <td><h1 ><font color=\"black\" face=\"Comic Sans MS,arial,verdana\" >Sistema de Cine Tayta</font></h1></td> \n");
      out.write("                          \n");
      out.write("                            </table>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>                \n");
      out.write("                </div>                \n");
      out.write("            </div>\n");
      out.write("            <div class=\"row\" >\n");
      out.write("                <div class=\"col-lg-4\" >\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("   \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <br><br><br>\n");
      out.write("        \n");
      out.write("        <div class=\"container\">\n");
      out.write("        <div class=\"row\" >\n");
      out.write("                <div class=\"col-lg-3\" >\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("                       \n");
      out.write("                        \n");
      out.write("                            <div class=\"col-lg-8\">\n");
      out.write("                         <div id=\"carouselExampleControls\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("                <div class=\"carousel-inner\">\n");
      out.write("                  <div class=\"carousel-item active\">\n");
      out.write("                    <img class=\"d-block w-50\" src=\"fotos/cine.jpg\" alt=\"First slide\">\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"carousel-item\">\n");
      out.write("                    <img class=\"d-block w-50\" src=\"fotos/cine1.jpg\" alt=\"Second slide\">\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"carousel-item\">\n");
      out.write("                    <img class=\"d-block w-50\" src=\"fotos/imagen1.jpg\" alt=\"Third slide\">\n");
      out.write("                  </div>\n");
      out.write("                    <div class=\"carousel-item\">\n");
      out.write("                    <img class=\"d-block w-50\" src=\"fotos/cinea.jpg\" alt=\"Third slide\">\n");
      out.write("                  </div>\n");
      out.write("                   \n");
      out.write("                </div>\n");
      out.write("                <a class=\"carousel-control-prev\" href=\"#carouselExampleControls\" role=\"button\" data-slide=\"prev\">\n");
      out.write("                  <span class=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span>\n");
      out.write("                  <span class=\"sr-only\">Previous</span>\n");
      out.write("                </a>\n");
      out.write("                <a class=\"carousel-control-next\" href=\"#carouselExampleControls\" role=\"button\" data-slide=\"next\">\n");
      out.write("                  <span class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span>\n");
      out.write("                  <span class=\"sr-only\">Next</span>\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("                  \n");
      out.write("        \n");
      out.write("    \n");
      out.write("        \n");
      out.write("        <script src=\"plugins/DATATABLE/js/jquery-3.3.1.js\" type=\"text/javascript\"></script>    \n");
      out.write("      <script src=\"plugins/BOOTSTRAP/js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("      <script src=\"plugins/BOOTSTRAP/js/popper.min.js\" type=\"text/javascript\"></script>                        \n");
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
