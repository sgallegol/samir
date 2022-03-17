package practicavoladores;

public class aterrizable extends avioneta {

	public aterrizable(String nombre, String color, String marca, int velocidad, Integer cantAsientos,
			int alturaMaxima) {
		super(nombre, color, marca, velocidad, cantAsientos, alturaMaxima);
		
		
		
	}
	//hacemos el metodo aterrizar
	public void aterrizar() {
		if(velocidad<100) {
			System.out.println("puede aterrizar");
		}else {
			System.out.println("sobrepasa la velocidad de aterrizaje para la pista");
		}
	}

	
		
		
		
	}
	

	
	
	

