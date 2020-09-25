package ModeloDAO;

import controlador.conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelo.empleados;

public class EmpleadoDAO {
    public int RegisterEmolye(empleados Empleados)throws  ClassNotFoundException{
	conexion c=new conexion();
	 String consulta = "insert into usuario(id_usuario,nom_usuario,apellido_usuario,email,"
                    + "direccion,telefono_1,telefono_2,contraseña,nivel)values(?,?,?,?,?,?,?,?,?)";
	 int result=0;
	 Class.forName("com.mysql.jdbc.Driver");
	 try {
             PreparedStatement PreparedStatement = c.getconexion().prepareStatement(consulta);
	     PreparedStatement.setInt(1, Empleados.getId());
	     PreparedStatement.setString(2, Empleados.getNombre());
	     PreparedStatement.setString(3, Empleados.getApellidos());
	     PreparedStatement.setString(4, Empleados.getEmail());
	     PreparedStatement.setString(5, Empleados.getDireccion());
	     PreparedStatement.setString(6, Empleados.getTel1());
	     PreparedStatement.setString(7, Empleados.getTel2());
	     PreparedStatement.setString(8, Empleados.getContraseña());
	     PreparedStatement.setInt(9, Empleados.getLevel());
	     System.out.println(PreparedStatement);
	     result=PreparedStatement.executeUpdate();
	    
	} catch (SQLException e) {
	    
	}
	 return result;
    } 
}
