package ar.com.tiendapepito.challenger.entity;

public class Producto {
	
	private Long id_producto;
	private Long codigo;
	private Long stock;
	private Long id_categoria;
	private String nombre;
	private Double precio;
	
	
	
	public Producto(Long id_producto, Long codigo, Long stock, Long id_categoria, String nombre, Double precio) {
		super();
		this.id_producto = id_producto;
		this.codigo = codigo;
		this.stock = stock;
		this.id_categoria = id_categoria;
		this.nombre = nombre;
		this.precio = precio;
	}
	
	public Producto( Long codigo, Long stock, Long id_categoria, String nombre, Double precio) {
		super();
		
		this.codigo = codigo;
		this.stock = stock;
		this.id_categoria = id_categoria;
		this.nombre = nombre;
		this.precio = precio;
	}

	public Long getId_producto() {
		return id_producto;
	}

	public void setId_producto(Long id_producto) {
		this.id_producto = id_producto;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public Long getStock() {
		return stock;
	}

	public void setStock(Long stock) {
		this.stock = stock;
	}

	public Long getId_categoria() {
		return id_categoria;
	}

	public void setId_categoria(Long id_categoria) {
		this.id_categoria = id_categoria;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Producto [id_producto=" + id_producto + ", codigo=" + codigo + ", stock=" + stock + ", id_categoria="
				+ id_categoria + ", nombre=" + nombre + ", precio=" + precio + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
