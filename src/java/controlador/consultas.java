
package controlador;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// clase para iniciar sesion que hereda la clase conexion.
public class consultas  extends conexion{
    // creamos un metodo booleano para la validacion de usuario
    public  boolean autenticacion(String usuario, String contraseña){
        // definimos dos variables la pst de tipo perparestatement que es para preparar la consulta que haremos a la base de datos
        PreparedStatement pst = null;
        // la variable rs de tipo resulset que es para ejecutar 
        ResultSet rs = null;
        try {
            String consulta="select * from usuario where email=? and contraseña=?";
            pst=getconexion().prepareStatement(consulta);
            pst.setString(1,usuario);
            pst.setString(2, contraseña);
            rs=pst.executeQuery();           
            if (rs.absolute(1)) {
                return true;
            }
            
        } catch (SQLException e) {
            System.err.println("tenes un eror en :" +e);
        }finally{
            try {
                if (getconexion()!=null) getconexion().close();
                if(pst!=null)pst.close();
                if(rs!=null)rs.close();
                
            } catch (SQLException ex) {
               System.err.println("tenes un eror en :" +ex);
            }
        }
        
        return false;
        
    }
}
