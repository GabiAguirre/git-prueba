package swimPrueba;

public class Usuario {
	private String nombre;
	private String apellido;
	private String usuario;
	private String contraseņa;
	
	public Usuario(String nombre, String apellido, String usuario, String contraseņa) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.usuario = usuario;
		this.contraseņa = contraseņa;
	};
	public boolean validarUsuario(String user,String pass) {
		return (this.usuario.equals(user) && this.contraseņa.equals(pass));
		
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
}
