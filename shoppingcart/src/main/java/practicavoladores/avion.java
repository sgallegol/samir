package practicavoladores;

public class avion extends  superman {
private Integer cantAsientos;

public avion(String nombre, String color, String marca, int velocidad,Integer cantAsientos) {
	super(nombre, color, marca, velocidad);
	this.cantAsientos=cantAsientos;
	
	
}

public Integer getCantAsientos() {
	return cantAsientos;
}

public void setCantAsientos(Integer cantAsientos) {
	this.cantAsientos = cantAsientos;
}

 

 
 
 
  
}
