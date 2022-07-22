package ar.com.tiendapepito.challenger.entity;

public class Cliente {

	private Long id;
	private String nombre;
	private String apellido;
	private String direccion;
	private String fecha_nacimiento;
	private String correo;
	private Long telefono;
	private Long id_vendedor;
	
	
	public Cliente(Long id, String nombre, String apellido, String direccion, String fecha_nacimiento, String correo,
			Long telefono, Long id_vendedor) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.fecha_nacimiento = fecha_nacimiento;
		this.correo = correo;
		this.telefono = telefono;
		this.id_vendedor = id_vendedor;
	}
	
	public Cliente( String nombre, String apellido, String direccion, String fecha_nacimiento, String correo,
			Long telefono, Long id_vendedor) {
		
	
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.fecha_nacimiento = fecha_nacimiento;
		this.correo = correo;
		this.telefono = telefono;
		this.id_vendedor = id_vendedor;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public void setFecha_nacimiento(String fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public Long getTelefono() {
		return telefono;
	}

	public void setTelefono(Long telefono) {
		this.telefono = telefono;
	}

	public Long getId_vendedor() {
		return id_vendedor;
	}

	public void setId_vendedor(Long id_vendedor) {
		this.id_vendedor = id_vendedor;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion
				+ ", fecha_nacimiento=" + fecha_nacimiento + ", correo=" + correo + ", telefono=" + telefono
				+ ", id_vendedor=" + id_vendedor + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
