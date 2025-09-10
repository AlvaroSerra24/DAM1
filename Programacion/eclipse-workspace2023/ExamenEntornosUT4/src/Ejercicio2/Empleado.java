package Ejercicio2;

public class Empleado {
	
	/**
	 * @author Alvaro Serradilla Otero
	 */
	
	 private String nombre;
	 private String apellido;
	 private int edad;
	 private double salario;
	 private String departamento;
	 private int id;
	 private String direccion;
	 private String telefono;
	 private String email;
	 
	 /**
	  * 
	  * @param nombre
	  * @param apellido
	  * @param edad
	  * @param salario
	  * @param departamento
	  * @param id
	  * @param direccion
	  * @param telefono
	  * @param email
	  */
	 
	public Empleado(String nombre, String apellido, int edad, double salario, String departamento, int id,
			String direccion, String telefono, String email) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.salario = salario;
		this.departamento = departamento;
		this.id = id;
		this.direccion = direccion;
		this.telefono = telefono;
		this.email = email;
	}
	
	public Empleado() {
		this.nombre = "";
		this.apellido = "";
		this.edad = 0;
		this.salario = 0;
		this.departamento = "";
		this.id = 0;
		this.direccion = "";
		this.telefono = "";
		this.email = "";
	}
	
	/**
	 * Se utiliza para obtener el nombre
	 * @return
	 */
	
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Se utiliza par dar el nombre
	 * @param nombre
	 */
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", salario=" + salario
				+ ", departamento=" + departamento + ", id=" + id + ", direccion=" + direccion + ", telefono="
				+ telefono + ", email=" + email + "]";
	}
	 
	 
}
