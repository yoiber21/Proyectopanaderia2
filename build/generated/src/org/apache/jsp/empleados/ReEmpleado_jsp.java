package org.apache.jsp.empleados;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Iterator;
import java.util.List;
import modelo.empleados;
import ModeloDAO.empleadosDAO;

public final class ReEmpleado_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"../css/bootstrap.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"../css/login.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"../css/miestilo.css\" type=\"text/css\">\r\n");
      out.write("        <link href=\"https://unpkg.com/ionicons@4.5.5/dist/css/ionicons.min.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Titillium+Web:ital,wght@0,300;0,600;1,400&display=swap\"\r\n");
      out.write("              rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"../css/default.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        <link href=\"../css/alertify.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        <title>Document</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <nav class=\"navbar navbar-expand-lg fixed-top\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <a class=\"navbar-brand\" href=\"#\" id=\"panaderia\"><img src=\"../css/img/baguette.png\" class=\"logo-brand\"\r\n");
      out.write("                                                                     alt=\"logo\"></a>\r\n");
      out.write("                <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\"\r\n");
      out.write("                        aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("                    <i class=\"icon ion-md-menu\"></i>\r\n");
      out.write("                </button>\r\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n");
      out.write("                    <ul class=\"navbar-nav ml-auto\">\r\n");
      out.write("                        <li class=\"nav-item\">\r\n");
      out.write("                            <a class=\"nav-link\" href=\"../administrador.jsp\">Inicio</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"nav-item\">\r\n");
      out.write("                            <a class=\"nav-link\" href=\"../proveedor/proveedor.jsp\">Proveedor</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"nav-item\">\r\n");
      out.write("                            <a class=\"nav-link\" href=\"../factura/factura.jsp\">Factura</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"nav-item\">\r\n");
      out.write("                            <a class=\"nav-link\" href=\"../venta/venta.jsp\">Ventas</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"nav-item \">\r\n");
      out.write("                            <a class=\"nav-link\" href=\"../productos/producto.jsp\">Productos</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"nav-item\">\r\n");
      out.write("                            <a class=\"nav-link\" href=\"../inventario/inventario.jsp\">Inventario</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </nav>\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"col-md-12\">\r\n");
      out.write("                <section id=\"contacto\">\r\n");
      out.write("                    <div class=\"container-fluid\">\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <div class=\"col-md-12\">\r\n");
      out.write("                                <div class=\"card bg-secondary\">\r\n");
      out.write("                                    <div class=\"card-body\">\r\n");
      out.write("                                        <legend class=\"text-center text-white header\">Modulo para registrar</legend>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-md-8 mt-5\">\r\n");
      out.write("                                <table border=\"1\" class=\"table table1 table-sm table-hover table-dark\">\r\n");
      out.write("                                    <thead>\r\n");
      out.write("                                    <th scope=\"col\" class=\"table1\" style=\"font-size: 10px\">#</th>\r\n");
      out.write("                                    <th scope=\"col\" style=\"font-size: 10px\">Nombres</th>\r\n");
      out.write("                                    <th scope=\"col\" style=\"font-size: 10px\">Apellidos</th>\r\n");
      out.write("                                    <th scope=\"col\" style=\"font-size: 10px\">Correo</th>\r\n");
      out.write("                                    <th scope=\"col\" style=\"font-size: 10px\">Direccion</th>\r\n");
      out.write("                                    <th scope=\"col\" style=\"font-size: 10px\">Telefono 1</th>\r\n");
      out.write("                                    <th scope=\"col\" style=\"font-size: 10px\">Telefono 2</th>\r\n");
      out.write("                                    <th scope=\"col\" style=\"font-size: 10px\">Contraseña</th>\r\n");
      out.write("                                    <th scope=\"col\" style=\"font-size: 10px\">Rol</th>\r\n");
      out.write("                                    <th scope=\"col\" class=\"text-center\" colspan=\"2\" style=\"font-size: 10px\">Acciones</th>\r\n");
      out.write("                                    </tr>\r\n");
      out.write("                                    </thead>\r\n");
      out.write("                                    ");

                                        empleadosDAO dao = new empleadosDAO();
                                        List<empleados> list = dao.listar();
                                        Iterator<empleados> iter = list.iterator();
                                        empleados emp = null;
                                        while (iter.hasNext()) {
                                            emp = iter.next();


                                    
      out.write("\r\n");
      out.write("                                    <tbody>\r\n");
      out.write("                                        <tr class=\"text-white\" style=\"font-size: 10px\">\r\n");
      out.write("                                            <td >");
      out.print( emp.getId());
      out.write("</td>\r\n");
      out.write("                                            <td>");
      out.print( emp.getNombre());
      out.write("</td>\r\n");
      out.write("                                            <td>");
      out.print( emp.getApellidos());
      out.write("</td>\r\n");
      out.write("                                            <td>");
      out.print( emp.getEmail());
      out.write("</td>\r\n");
      out.write("                                            <td>");
      out.print( emp.getDireccion());
      out.write("</td>\r\n");
      out.write("                                            <td>");
      out.print( emp.getTel1());
      out.write("</td>\r\n");
      out.write("                                            <td>");
      out.print( emp.getTel2());
      out.write("</td>\r\n");
      out.write("                                            <td>");
      out.print( emp.getContraseña());
      out.write("</td>\r\n");
      out.write("                                            <td>");
      out.print( emp.getLevel());
      out.write("</td>\r\n");
      out.write("                                            <td> <a  href=\"edit.jsp?accion=editar&id_empleado=");
      out.print( emp.getId());
      out.write("\" class=\"align-bottom\"><i class=\"fa fa-pencil\">Editar</i></a></td>\r\n");
      out.write("                                            <td><a  href=\"delete.jsp?accion=eliminar&id_empleado=");
      out.print( emp.getId());
      out.write("\" class=\"text-center\"><i class=\"fas fa-trash-alt red\">Eliminar</i></ion-icon></a></td>\r\n");
      out.write("\r\n");
      out.write("                                        </tr>\r\n");
      out.write("                                        ");
}
      out.write("\r\n");
      out.write("                                    </tbody>\r\n");
      out.write("                                </table>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-md-4 mt-5\">\r\n");
      out.write("                                <div class=\"row\">\r\n");
      out.write("                                    <form action=\"../RegistreEmpleado\">\r\n");
      out.write("                                        <div class=\"row\">\r\n");
      out.write("                                            <legend class=\"text-center header\">Registrar usuarios</legend>\r\n");
      out.write("                                            <div class=\"col-md-6\">\r\n");
      out.write("                                                <div class=\"form-group\">\r\n");
      out.write("                                                    <input type=\"number\" class=\"form-control\" \r\n");
      out.write("                                                           placeholder=\"Identificacion\" name=\"usuarios\">\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"col-md-6\">\r\n");
      out.write("                                                <div class=\"form-group\">\r\n");
      out.write("                                                    <input type=\"text\" class=\"form-control\" placeholder=\"Nombres\" name=\"nombres\" >\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"col-md-6\">\r\n");
      out.write("                                                <div class=\"form-group\">\r\n");
      out.write("                                                    <input type=\"text\" class=\"form-control\" placeholder=\"Apellidos\" name=\"apellidos\" >\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"col-md-6\">\r\n");
      out.write("                                                <div class=\"form-group\">\r\n");
      out.write("                                                    <input type=\"email\" class=\"form-control\" placeholder=\"Correo\" name=\"correo\" >\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"col-md-6\">\r\n");
      out.write("                                                <div class=\"form-group\">\r\n");
      out.write("                                                    <input type=\"text\" class=\"form-control\"  placeholder=\"direccion\"\r\n");
      out.write("                                                           name=\"direccion\" >\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"col-md-6\">\r\n");
      out.write("                                                <div class=\"form-group\">\r\n");
      out.write("                                                    <input type=\"number\" class=\"form-control\"  placeholder=\"Telefono 1\"\r\n");
      out.write("                                                           name=\"tel1\"  >\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"col-md-6\">\r\n");
      out.write("                                                <div class=\"form-group\">\r\n");
      out.write("                                                    <input type=\"number\" class=\"form-control\"\r\n");
      out.write("                                                           name=\"tel2\"  placeholder=\"Telefono 2\" >\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"col-md-6\">\r\n");
      out.write("                                                <div class=\"form-group\">\r\n");
      out.write("                                                    <input type=\"password\" class=\"form-control\"\r\n");
      out.write("                                                           name=\"pass\"  >\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"col-md-6\">\r\n");
      out.write("                                                <div class=\"form-group\">\r\n");
      out.write("                                                    <input type=\"number\" class=\"form-control\" name=\"nivel\" placeholder=\"Ingrese nivel\">\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"col-md-12\">\r\n");
      out.write("                                                <input type=\"submit\" class=\"btn btn-negro full-width\" name=\"accion\" value=\"agregar\">\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"col-md-12\" id=\"respuesta\"></div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </form>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </section>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <section id=\"pie\" class=\"btn-negro footer\">\r\n");
      out.write("            <div class=\"container\"><img src=\"../css/img/baguette.png\" alt=\"logo\" class=\"logo-brand\">\r\n");
      out.write("                <ul class=\"list-inline\">\r\n");
      out.write("                    <li class=\"list-inline-item footer-menu\"><a href=\"#\">Inicio</a></li>\r\n");
      out.write("                    <li class=\"list-inline-item footer-menu\"><a href=\"#\">Acerca de nosotros</a></li>\r\n");
      out.write("                    <li class=\"list-inline-item footer-menu\"><a href=\"#\">precios</a></li>\r\n");
      out.write("                    <li class=\"list-inline-item footer-menu\"><a href=\"#\">contacto</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("                <ul class=\"list-inline\">\r\n");
      out.write("                    <li class=\"list-inline-item\"><a href=\"\">\r\n");
      out.write("                            <ion-icon class=\"icon\" name=\"logo-instagram\"></ion-icon>\r\n");
      out.write("                        </a></li>\r\n");
      out.write("                    <li class=\"list-inline-item\"><a href=\"\">\r\n");
      out.write("                            <ion-icon class=\"icon\" name=\"logo-twitter\"></ion-icon>\r\n");
      out.write("                        </a></li>\r\n");
      out.write("                    <li class=\"list-inline-item\"><a href=\"\">\r\n");
      out.write("                            <ion-icon class=\"icon\" name=\"logo-youtube\"></ion-icon>\r\n");
      out.write("                        </a></li>\r\n");
      out.write("                    <li class=\"list-inline-item\"><a href=\"\">\r\n");
      out.write("                            <ion-icon class=\"icon\" name=\"logo-dribbble\"></ion-icon>\r\n");
      out.write("                        </a></li>\r\n");
      out.write("                    <li class=\"list-inline-item\"><a href=\"\">\r\n");
      out.write("                            <ion-icon class=\"icon\" name=\"logo-facebook\"></ion-icon>\r\n");
      out.write("                        </a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("                <small> A&ntildeo© 2020 Todos los derechos reservados. Creado por Yoiber beitar</small>\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("    </body>\r\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.5.1.js\" integrity=\"sha256-QWo7LDvxbWT2tbbQ97B53yJnYU3WhH/C8ycbRAkjPDc=\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\"\r\n");
      out.write("            integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\"\r\n");
      out.write("    crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\"\r\n");
      out.write("            integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\"\r\n");
      out.write("    crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <script src=\"https://unpkg.com/ionicons@5.0.0/dist/ionicons.js\"></script>\r\n");
      out.write("    <script src=\"https://kit.fontawesome.com/3ba937e77e.js\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("\r\n");
      out.write("     <script src=\"https://unpkg.com/sweetalert/dist/sweetalert.min.js\"></script>\r\n");
      out.write("</html>");
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
