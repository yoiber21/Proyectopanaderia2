package Servlets;
/*estos son los servlets para insertar todos estan es la carpeta "serlvelts"* ahi como ves esta el codigo comentado
solo en esta */
import controlador.Reusuario;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ReEmpleado extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        // capturamos los datos de los input en ReEmpleado.jsp
        try (PrintWriter out = response.getWriter()) {
        String identificacion = String.valueOf(request.getParameter("ide"));
        String nombre = request.getParameter("nom");
        String apellido = request.getParameter("ape");
        String correo= request.getParameter("corr");
        String direccion = request.getParameter("dir");
        String tel1 = request.getParameter("tel1");
        String tel2 = request.getParameter("tel2");
        String contraseña = request.getParameter("cont");
        
        // enviamos los datos a la base de datos
        Reusuario em=new Reusuario();
        if (em.registrar(identificacion, nombre, apellido,correo, tel1, tel2, direccion, contraseña)) {
          
        }
        } catch (Exception e) {
            System.out.println("Servlets.ReEmpleado.processRequest()");
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
