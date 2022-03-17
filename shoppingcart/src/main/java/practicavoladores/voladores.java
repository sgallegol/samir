package practicavoladores;

public class voladores {
	
private String nombre;
protected String color;
public String marca;
//generamos el constructor voladores. hacemos que voladores nasca
public voladores(String nombre,String color,String marca) {
	super();
	this.nombre=nombre;
	this.color=color;
	this.marca=marca;
}
public void aterrizar() {
	int velocidad = 0;
	if(velocidad<100) {
		System.out.println(this.toString());
	}else {
		System.out.println(this.toString());
	}
}


public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public String getMarca() {
	return marca;
}
public void setMarca(String marca) {
	this.marca = marca;
}
@Override
public String toString() {
	return "voladores [nombre=" + nombre + ", color=" + color + ", marca=" + marca + "]";
}



}
