package practicavoladores;

public class helicoptero extends avion{
private int alturaMaxima;
	public helicoptero(String nombre, String color, String marca, int velocidad, Integer cantAsientos,int alturaMaxima) {
		super(nombre, color, marca, velocidad, cantAsientos);
		this.alturaMaxima=alturaMaxima;
	}
	public int getAlturaMaxima() {
		return alturaMaxima;
	}
	public void setAlturaMaxima(int alturaMaxima) {
		this.alturaMaxima = alturaMaxima;
	}

}
