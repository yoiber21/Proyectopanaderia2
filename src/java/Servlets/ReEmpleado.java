package Servlets;

/*estos son los servlets para insertar todos estan es la carpeta "serlvelts"* ahi como ves esta el codigo comentado
solo en esta */
import ModeloDAO.EmpleadoDAO;
import ModeloDAO.empleadosDAO;
import controlador.Reusuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.empleados;

public class ReEmpleado extends HttpServlet {
    String add="empleados/ReEmpleado.jsp";
    private empleadosDAO dao = new empleadosDAO();
    private empleados e=new empleados();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	response.setContentType("text/html;charset=UTF-8");
	// capturamos los datos de los input en ReEmpleado.jsp
	try (PrintWriter out = response.getWriter()) {
	}

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	String acceso="";
	String accion=request.getParameter("accion");
  
            if (accion.equalsIgnoreCase("agregar")) {
                
	    int identi = Integer.parseInt(request.getParameter("usuarios"));
	    String nom = request.getParameter("nombres");
	    String apell = request.getParameter("apellidos");
	    String correo = request.getParameter("correo");
	    String direcc = request.getParameter("direccion");
	    String tel1 = request.getParameter("tel1");
	    String tel2 = request.getParameter("tel2");
	    String contra = request.getParameter("pass");
	    String level = request.getParameter("nivel");
	    e.setId(identi);
	    e.setNombre(nom);
	    e.setApellidos(apell);
	    e.setEmail(correo);
	    e.setDireccion(direcc);
	    e.setTel1(tel1);
	    e.setTel2(tel2);
	    e.setContraseña(contra);
	    e.setLevel(level);
	    dao.add(e);
            response.sendRedirect("empleados/ReEmpleado.jsp");
	    
	    
	}
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
    }

    @Override
    public String getServletInfo() {
	return "Short description";
    }// </editor-fold>
}
