package Servlets;
/*estos son los servlets para insertar todos estan es la carpeta "serlvelts"* ahi como ves esta el codigo comentado
solo en esta */
import controlador.Reusuario;
import java.io.IOException;
import java.io.PrintWriter;
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
        String identi = String.valueOf(request.getParameter("usuario"));
        String nom = request.getParameter("nombres");
        String apell= request.getParameter("apellidos");
        String correo= request.getParameter("correo");
        String direcc = request.getParameter("direccion");
        String teluno = request.getParameter("tel1");
        String teldos = request.getParameter("tel2");
        String contra = request.getParameter("pass");
        String level=String.valueOf(request.getParameter("nivel"));
        // enviamos los datos a la base de datos
        Reusuario em=new Reusuario();
        if (em.registrar(identi, nom, apell, correo, direcc, teluno, teldos, contra, level)) {
           System.out.print("Registrado");
        } else {
            System.out.print("Error");
            }
        }
           
    }
   // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
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
