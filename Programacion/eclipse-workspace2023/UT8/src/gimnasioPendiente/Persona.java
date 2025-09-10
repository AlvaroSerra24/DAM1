package gimnasioPendiente;

public class Persona {
	protected String codigo;
	protected String nombre;
	protected String apellidos;
	protected String correo;
	public Persona(String codigo, String nombre, String apellidos, String correo) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.correo = correo;
	}
	
	public Persona() {
		this.codigo = "";
		this.nombre = "";
		this.apellidos = "";
		this.correo = "";
	}
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
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
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	
}
