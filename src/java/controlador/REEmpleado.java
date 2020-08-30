
package controlador;

import ModeloDAO.empleadosDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.empleados;
/* aqui en este era que estaba intentando hcer el actualizra  al empleado**/
public class REEmpleado extends HttpServlet {
    String listar="empleados/ReEmpleado.jsp";
    String add="empleados/ReEmpleado.jsp";
    String edit="empleados/eit.jsp";
    empleados em=new empleados();
    empleadosDAO dao=new empleadosDAO();
    int id;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
       try (PrintWriter out = response.getWriter()) {
              String acceso="";
        String action=request.getParameter("accion");
            if (action.equalsIgnoreCase("editar")) {
            request.setAttribute("idper", request.getParameter("ide"));
            acceso=edit;
            }else if(action.equalsIgnoreCase("Actualizar")){
            int id=Integer.parseInt(request.getParameter("ide"));
            String nombre=request.getParameter("nombre");
            String apellido=request.getParameter("apellido");
            String correo=request.getParameter("correo");
            String direccion=request.getParameter("direccion");
            String tel1=request.getParameter("tel1");
            String tel2=request.getParameter("tel2");
            String pass=request.getParameter("pass");
            em.setId(id);
            em.setNombre(nombre);
            em.setApellidos(apellido);
            em.setEmail(correo);
            em.setDireccion(direccion);
            em.setTel1(tel1);
            em.setTel2(tel2);
            em.setContraseña(pass);
            dao.edit(em);
            acceso=listar;
        }
        response.sendRedirect(acceso);
        }
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
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
