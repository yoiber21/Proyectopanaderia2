package org.apache.jsp.empleados;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Iterator;
import modelo.empleados;
import java.util.List;
import ModeloDAO.empleadosDAO;
import java.sql.*;
import controlador.conexion;

public final class edit_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"es\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"../css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"../css/login.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"../css/miestilo.css\" type=\"text/css\">\n");
      out.write("        <link href=\"https://unpkg.com/ionicons@4.5.5/dist/css/ionicons.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Titillium+Web:ital,wght@0,300;0,600;1,400&display=swap\"\n");
      out.write("              rel=\"stylesheet\">\n");
      out.write("        <title>Actualizar</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         <nav class=\"navbar navbar-expand-lg fixed-top\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <a class=\"navbar-brand\" href=\"#\" id=\"panaderia\"><img src=\"../css/img/baguette.png\" class=\"logo-brand\"\n");
      out.write("                                                                     alt=\"logo\"></a>\n");
      out.write("                <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\"\n");
      out.write("                        aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                    <i class=\"icon ion-md-menu\"></i>\n");
      out.write("                </button>\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("                    <ul class=\"navbar-nav ml-auto\">\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link\" href=\"..administrador.jsp\">Inicio</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link\" href=\"../proveedor/proveedor.jsp\">Proveedor</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link\" href=\"../factura/factura.jsp\">Factura</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link\" href=\"../venta/venta.jsp\">Ventas</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item \">\n");
      out.write("                            <a class=\"nav-link\" href=\"../productos/producto.jsp\">Productos</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link\" href=\"../inventario/inventario.jsp\">Inventario</a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        <section id=\"contacto\" class=\"divisor\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-12\">\n");
      out.write("                        <div class=\"card bg-secondary\">\n");
      out.write("                            <div class=\"card-body\">\n");
      out.write("                                <legend class=\"text-center text-white header\">Modulo para registrar</legend>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-8 topmargin-sm table-responsive-sm \">\n");
      out.write("                        <div class=\"container \">\n");
      out.write("                            <table border=\"1\" class=\"table table1 table-sm table-hover table-dark\">\n");
      out.write("                                <thead>\n");
      out.write("                                <th scope=\"col\" class=\"table1\" style=\"font-size: 10px\">#</th>\n");
      out.write("                                <th scope=\"col\" style=\"font-size: 10px\">Nombres</th>\n");
      out.write("                                <th scope=\"col\" style=\"font-size: 10px\">Apellidos</th>\n");
      out.write("                                <th scope=\"col\" style=\"font-size: 10px\">Correo</th>\n");
      out.write("                                <th scope=\"col\" style=\"font-size: 10px\">Direccion</th>\n");
      out.write("                                <th scope=\"col\" style=\"font-size: 10px\">Telefono 1</th>\n");
      out.write("                                <th scope=\"col\" style=\"font-size: 10px\">Telefono 2</th>\n");
      out.write("                                <th scope=\"col\" style=\"font-size: 10px\">Contraseña</th>\n");
      out.write("\t\t\t\t<th scope=\"col\" style=\"font-size: 10px\">Nivel</th>\n");
      out.write("                                <th scope=\"col\" class=\"text-center\" colspan=\"2\" style=\"font-size: 10px\">Acciones</th>\n");
      out.write("                                </tr>\n");
      out.write("                                </thead>\n");
      out.write("                                ");

                                    empleadosDAO dao = new empleadosDAO();
                                    List<empleados> list = dao.listar();
                                    Iterator<empleados> iter = list.iterator();
                                    empleados emp = null;
                                    while (iter.hasNext()) {
                                        emp = iter.next();


                                
      out.write("\n");
      out.write("                                <tbody>\n");
      out.write("                                    \n");
      out.write("                                        <td >");
      out.print( emp.getId());
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print( emp.getNombre());
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print( emp.getApellidos());
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print( emp.getEmail());
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print( emp.getDireccion());
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print( emp.getTel1());
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print( emp.getTel2());
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print( emp.getContraseña());
      out.write("</td> \n");
      out.write("\t\t\t\t\t<td>");
      out.print(emp.getLevel());
      out.write("</td>\n");
      out.write("                                        <td> <a  href=\"edit.jsp?accion=editar&id_empleado=");
      out.print( emp.getId());
      out.write("\" class=\"align-bottom\"><i class=\"fa fa-pencil\">Editar</i></a></td>\n");
      out.write("                                        <td><a href=\"delete.jsp?accion=eliminar&id_empleado=");
      out.print( emp.getId());
      out.write("\" class=\"text-center\"><i class=\"fas fa-trash-alt red\">Eliminar</i></ion-icon></a></td>\n");
      out.write("\n");
      out.write("                                    \n");
      out.write("                                    ");
}
      out.write("\n");
      out.write("                                </tbody>\n");
      out.write("                            </table>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!--en este codigo se hace la conexion a la base de datos ademas de ejecutar el codigo para buscar los datos en mysql--> \n");
      out.write("                    ");

                        //conexion a la base de datos 
                        conexion con = new conexion();
                        //variables para hacer la consulta
                        PreparedStatement ps;
                        ResultSet rs;
                        //variable que toma el valor insertado en el espacio para el id del proveedor 
                        String id = (request.getParameter("id_empleado"));
                        // se escribe el codigo necesario para interactuar con la base de datos y realizar la consulta segun el id ingresado
                        ps = con.getconexion().prepareStatement("select * from Usuario where id_usuario = '" + id + "'");
                        //con el codigo execute se ejecuta el codigo escrito arriba
                        rs = ps.executeQuery();
                        //esto es neceario para visualizar los datos de la base de datos si se quita no se podra ver ningun dato
                        while (rs.next()) {
                    
      out.write("\n");
      out.write("                    <div class=\"col-md-4 topmargin-sm \">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <form class=\"form-control\"  method=\"POST\">\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <legend class=\"text-center header\">Actualize Datos</legend>\n");
      out.write("                                    <div class=\"col-md-6\">\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <input type=\"number\" class=\"form-control\" \n");
      out.write("                                                   placeholder=\"Identificacion\" name=\"id\"  value=\"");
      out.print(rs.getInt("id_usuario"));
      out.write("\" required>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-md-6\">\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <input type=\"text\" class=\"form-control\"  name=\"nom_usuario\" placeholder=\"Nombres\" value=\"");
      out.print(rs.getString("nom_usuario"));
      out.write("\" required>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-md-6\">\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <input type=\"text\" class=\"form-control\" name=\"apellido_usuario\" placeholder=\"Apellidos\" value=\"");
      out.print(rs.getString("apellido_usuario"));
      out.write("\" required>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-md-6\">\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <input type=\"email\" class=\"form-control\" name=\"email\" placeholder=\"Correo\" value=\"");
      out.print(rs.getString("email"));
      out.write("\" required>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-md-6\">\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <input type=\"text\" class=\"form-control\" name=\"direccion\" placeholder=\"Direccion\"\n");
      out.write("                                                   value=\"");
      out.print(rs.getString("direccion"));
      out.write("\" required>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-md-6\">\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <input type=\"number\" class=\"form-control\" name=\"telefono_1\" placeholder=\"Telefono 1\"\n");
      out.write("                                                   value=\"");
      out.print(rs.getString("telefono_1"));
      out.write("\" required>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-md-6\">\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <input type=\"number\" class=\"form-control\" name=\"telefono_2\"\n");
      out.write("                                                   value=\"");
      out.print(rs.getString("telefono_2"));
      out.write("\" placeholder=\"Telefono 2\" required>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-md-6\">\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <input type=\"password\" class=\"form-control\" name=\"pass\"\n");
      out.write("                                                   value=\"");
      out.print(rs.getString("contraseña"));
      out.write("\" placeholder=\"Contraseña\" >\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("\t\t\t\t\t <div class=\"col-md-6\">\n");
      out.write("                                                <div class=\"form-group\">\n");
      out.write("                                                    <input type=\"number\" class=\"form-control\" name=\"par9\" value=\"");
      out.print(rs.getString("nivel"));
      out.write("\" placeholder=\"Ingrese nivel\">\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                    <div class=\"col-md-6\">\n");
      out.write("                                        <input type=\"Submit\" id=\"proveedorid\" value=\"Actualizar\" class=\"btn btn-negro full-width\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-md-6\">\n");
      out.write("                                        <a type=\"Submit\"  class=\"btn btn-negro full-width nav-link\" href=\"ReEmpleado.jsp\">Regresar</a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </form>\n");
      out.write("                                       \n");
      out.write("                        </div>\n");
      out.write("                                        ");
}
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("             \n");
      out.write("        </section>\n");
      out.write("        <section id=\"pie\" class=\"btn-negro footer\">\n");
      out.write("            <div class=\"container\"><img src=\"css/img/baguette.png\" alt=\"logo\" class=\"logo-brand\">\n");
      out.write("                <ul class=\"list-inline\">\n");
      out.write("                    <li class=\"list-inline-item footer-menu\"><a href=\"#\">Inicio</a></li>\n");
      out.write("                    <li class=\"list-inline-item footer-menu\"><a href=\"#\">Acerca de nosotros</a></li>\n");
      out.write("                    <li class=\"list-inline-item footer-menu\"><a href=\"#\">precios</a></li>\n");
      out.write("                    <li class=\"list-inline-item footer-menu\"><a href=\"#\">contacto</a></li>\n");
      out.write("                </ul>\n");
      out.write("                <ul class=\"list-inline\">\n");
      out.write("                    <li class=\"list-inline-item\"><a href=\"\">\n");
      out.write("                            <ion-icon class=\"icon\" name=\"logo-instagram\"></ion-icon>\n");
      out.write("                        </a></li>\n");
      out.write("                    <li class=\"list-inline-item\"><a href=\"\">\n");
      out.write("                            <ion-icon class=\"icon\" name=\"logo-twitter\"></ion-icon>\n");
      out.write("                        </a></li>\n");
      out.write("                    <li class=\"list-inline-item\"><a href=\"\">\n");
      out.write("                            <ion-icon class=\"icon\" name=\"logo-youtube\"></ion-icon>\n");
      out.write("                        </a></li>\n");
      out.write("                    <li class=\"list-inline-item\"><a href=\"\">\n");
      out.write("                            <ion-icon class=\"icon\" name=\"logo-dribbble\"></ion-icon>\n");
      out.write("                        </a></li>\n");
      out.write("                    <li class=\"list-inline-item\"><a href=\"\">\n");
      out.write("                            <ion-icon class=\"icon\" name=\"logo-facebook\"></ion-icon>\n");
      out.write("                        </a></li>\n");
      out.write("                </ul>\n");
      out.write("                <small> A&ntildeo© 2020 Todos los derechos reservados. Creado por Yoiber beitar</small>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\"\n");
      out.write("        integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\"\n");
      out.write("crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\"\n");
      out.write("        integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\"\n");
      out.write("crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\"\n");
      out.write("        integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\"\n");
      out.write("crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://unpkg.com/ionicons@5.0.0/dist/ionicons.js\"></script>\n");
      out.write("<script src=\"https://kit.fontawesome.com/3ba937e77e.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("<!--este fragmento de codigo es necesario colocarlo afuera del html--> \n");

    //se toman los valores de los espacion donde estabn los datos del proveedor

    String id_administrador = request.getParameter("id_administrador");
    String nom_usuario = request.getParameter("nom_usuario");
    String apellido_usuario = request.getParameter("apellido_usuario");
    String email = request.getParameter("email");
    String direccion = request.getParameter("direccion");
    String telefono_1 = request.getParameter("telefono_1");
    String telefono_2 = request.getParameter("telefono_2");
    String contraseña = request.getParameter("contrasena");
    String nivel=request.getParameter("par9");

//si alguno de los datos tiene al menos un valor se ejecutara el update
    if (id_administrador != null || nom_usuario != null || apellido_usuario != null || email != null || direccion != null || telefono_1 != null || telefono_2 != null || contraseña != null || nivel!=null) {

        //se esrcibe el codigo update y los valores que se le ponen son los mismos que estaban en los input donde aparecian los datos del proveedor 
        ps = con.getconexion().prepareStatement("update Usuario set nom_usuario='" + nom_usuario + "',"
                + " apellido_usuario='" + apellido_usuario + "', email='" + email + "', telefono_1='" + telefono_1 + "',"
                + "telefono_2='" + telefono_2 + "', contraseña='" + contraseña + "', nivel='" + nivel + "' where id_usuario='" + id + "'");

        //se ejecuta el update y se redirecciona la pagina esto con el fin de que se detecten los datos escritos en los input
        ps.executeUpdate();
        response.sendRedirect("ReEmpleado.jsp");
    }

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
