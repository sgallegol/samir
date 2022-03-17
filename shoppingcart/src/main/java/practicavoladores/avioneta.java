package practicavoladores;

public class avioneta extends helicoptero{
private int alturaMaxima;
	public avioneta(String nombre, String color, String marca, int velocidad, Integer cantAsientos,int alturaMaxima) {
		super(nombre, color, marca, velocidad, cantAsientos, alturaMaxima);
		this.alturaMaxima=alturaMaxima;
	}
	public int getAlturaMaxima() {
		return alturaMaxima;
	}
	public void setAlturaMaxima(int alturaMaxima) {
		this.alturaMaxima = alturaMaxima;
	}

}
