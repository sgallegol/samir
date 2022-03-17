package ar.com.educacionit.dominio;

public class Categoria implements  Entity{
	
	
	//caracteristicas
	private Long identificacion;
	private String descripcion;
	private String codigo;
	
public Categoria() {
		
	}
	
	
	
	public Categoria(Long identifcacion, String descripcion, String codigo) {
		
		this.identificacion = identifcacion;
		this.descripcion = descripcion;
		this.codigo = codigo;
	}
	

	
	
	public Categoria(String descripcion, String codigo) {
	
		this.descripcion = descripcion;
		this.codigo = codigo;
	}


	


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	@Override
	public String toString() {
		return "Categoria [identifcacion=" + identificacion + ", descripcion=" + descripcion + ", codigo=" + codigo
				+ "]";
	}



	public Long getId() {
		// TODO Auto-generated method stub
		return identificacion;
	}



	public void setId(Long id) {
this.identificacion=id;	
	}
	
	
	
	
	
	
	

}
