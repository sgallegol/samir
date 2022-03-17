package Miniproyecto;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Repaso {

	public static void main(String[] args) {

		
		
		
		Scanner teclado=new Scanner(System.in);
		System.out.println("ingrese la opcion ");
		System.out.println("1 -alta");
		System.out.println("2-baja");
		System.out.println("3 modificar");
		System.out.println("4-eliminar");
		System.out.println("0-salir");
		
		int opcion=teclado.nextInt();
		
	try {	
		Ejecutar ej=CreadordeEjecutar.obtenerEjecutable(opcion);
		
		
	    ej.ejecu();
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			teclado.close();
	
		}
	System.out.println("fin");
	
		
		
		
		
	}
}
