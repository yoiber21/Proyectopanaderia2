package modelo;

public class empleados {
   private  int id;
   private  String nombre;
   private  String apellidos;
   private  String email;
   private  String direccion;
   private  String tel1;
   private  String tel2;
   private  String contraseña;
   private  String    level;

    public empleados() {
    }

    public int getId() {
	return id;
    }

    public void setId(int id) {
        this.id = id;
    }
 
    public String getNombre() {
	return nombre;
    }

    public void setNombre(String nombre) {
	this.nombre = nombre;
    }

    public String getApellidos() {
	return apellidos;
    }

    public void setApellidos(String apellidos) {
	this.apellidos = apellidos;
    }

    public String getEmail() {
	return email;
    }

    public void setEmail(String email) {
	this.email = email;
    }

    public String getDireccion() {
	return direccion;
    }

    public void setDireccion(String direccion) {
	this.direccion = direccion;
    }

    public String getTel1() {
	return tel1;
    }

    public void setTel1(String tel1) {
	this.tel1 = tel1;
    }

    public String getTel2() {
	return tel2;
    }

    public void setTel2(String tel2) {
	this.tel2 = tel2;
    }

    public String getContraseña() {
	return contraseña;
    }

    public void setContraseña(String contraseña) {
	this.contraseña = contraseña;
    }

    public int getLevel() {
	return Integer.parseInt(level);
    }

    public void setLevel(String level) {
	this.level = level;
    }

    
}
