package practicavoladores;

public class voladores_main {

	public static void main(String[] args) {
		voladores volar=new voladores("nombre","color","marca");
		superman hombredeacero=new superman("superman","azul","S",3000000);
		avion avi=new avion("avion","blanco","boy447",2000,333);
		helicoptero helicop= new helicoptero("helicoptero","negro","rxt",323232,600,7);
		
		avioneta avio=new avioneta("avioneta","roja","MRT45",2000,32,8);
	
	voladores[] voladores=new voladores[5];
	voladores[0] =hombredeacero;
	voladores[1]=helicop;
	voladores[2]=avi;
	voladores[3]=avio;
	
	for(voladores aux;velocidad<100;aux++) {
		
		aux.aterrizar();
		
		
		if(aux instanceof voladores) {
			voladores a=(voladores)aux;
		System.out.println("puede o no aterrizar");
		
			
		}else {
			System.out.println("no puede aterrizar");
		}
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	}
	

}
