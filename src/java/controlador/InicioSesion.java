
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// servlet para el inicio de sesion
public class InicioSesion extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        // capturamos los parametros que tenemos en el formulario
        String usuario = request.getParameter("Identificacion");
        String contraseña = request.getParameter("Password");
        // instaciamos el objecto consultas del controlador
        consultas co = new consultas();
        /* la condicion si el objeto consulta con  el metodo autenticacion
            validan los datos que tenemos en las variables usuario y contraseña si es verdadero
        nos redirige a la pagina principal de lo contrario nos deja en el index.jsp*/ 
        if (co.autenticacion(usuario, contraseña)) {
            response.sendRedirect("administrador.jsp");
        } else {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Inicio</title>");            
            out.println("</head>");
               
            out.println("<body>");
            out.println(" <script>alert('Credenciales incorrectas');"
                     + "location.href ='index.jsp'</script>");
            out.println("</body>");
            out.println("</html>");
                
        }

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
