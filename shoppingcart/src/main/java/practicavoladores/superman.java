package practicavoladores;

public class superman extends voladores {
protected int velocidad;





public superman(String nombre, String color, String marca,int velocidad) {
	super(nombre, color, marca);
	this.velocidad=velocidad;
}

public int getVelocidad() {
	return velocidad;
}

public void setVelocidad(int velocidad) {
	this.velocidad = velocidad;
}


}
