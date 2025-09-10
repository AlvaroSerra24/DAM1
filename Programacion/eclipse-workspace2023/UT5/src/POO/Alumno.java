package POO;

public class Alumno {
	//Atributos
	private String dni;
	private String nombre;
	private String apellido1;
	private String apellido2;
	private int edad;
	private String direccion;
	private String telefono;
	//private Nota[] notas;
	
	
	
	//Métodos
	//Crear el objeto->Constructores
	//Inicializar variables o atributos y reservar memoria
	//Constructor por defecto
	public Alumno() {
		this.dni="";
		this.nombre="";
		this.apellido1="";
		this.apellido2="";
		this.edad=0;
		this.direccion="";
		this.telefono="";
	}
	
	public Alumno(String dni, String nombre, String apellido1, String apellido2, int edad, String direccion,
			String telefono) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.edad = edad;
		this.direccion = direccion;
		this.telefono = telefono;
	}
	
	//Getters y setters
	
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
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

	//toString
	
	@Override
	public String toString() {
		return "Alumno [dni=" + dni + ", nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2
				+ ", edad=" + edad + ", direccion=" + direccion + ", telefono=" + telefono + "]";
	}
	
}
