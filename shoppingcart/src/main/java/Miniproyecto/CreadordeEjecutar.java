package Miniproyecto;

import java.util.HashMap;
import java.util.Map;

public class CreadordeEjecutar {

	
	private static Map<Integer,Ejecutar> opcionesMap=new crearOpciones();
	private static Map<Integer,Ejecutar> crearOpciones(){
		
		Map<Integer,Ejecutar> opciones=new HashMap<>(); 
		
		opciones.put(1,new Alta());
		opciones.put(2, new Baja());
		opciones.put(3, new Modificar());
		opciones.put(4, new Eliminar());
		
		return opciones;
	}

	
	public static Ejecutar obtenerEjecutable(Integer opcionBuscada) {
		if(opcionesMap.containsKey(opcionBuscada)) {
			return opcionesMap.get(opcionBuscada);
		}
		throw new RuntimeException("no existe ejecutable asociado a la clave: " + opcionBuscada);
		
		
		
		
		
	}
	
	
}
