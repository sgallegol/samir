package ar.com.tiendapepito.challenger.entity;

import java.util.Date;

public class Vendedor {
	
	private Long id;
	private String nombre;
	private Long  telefono;
	private Date fecha_ingreso;
	
	
	
	public Vendedor(Long id, String nombre, Long telefono, Date fecha_ingreso) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.telefono = telefono;
		this.fecha_ingreso = fecha_ingreso;
	}
	
	
	public Vendedor( String nombre, Long telefono, Date fecha_ingreso) {
		
		this.nombre = nombre;
		this.telefono = telefono;
		this.fecha_ingreso = fecha_ingreso;
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


	public Long getTelefono() {
		return telefono;
	}


	public void setTelefono(Long telefono) {
		this.telefono = telefono;
	}


	public Date getFecha_ingreso() {
		return fecha_ingreso;
	}


	public void setFecha_ingreso(Date fecha_ingreso) {
		this.fecha_ingreso = fecha_ingreso;
	}


	@Override
	public String toString() {
		return "Vendedor [id=" + id + ", nombre=" + nombre + ", telefono=" + telefono + ", fecha_ingreso="
				+ fecha_ingreso + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
