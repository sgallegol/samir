package desarrrollo.practica.adicional.semana.seis;

import java.util.HashMap;
import java.util.Map;

public class AccionMap {

	static Map<Integer, IAccion> accionMap = construirAcciones();

	 private static  Map<Integer, IAccion> construirAcciones() {
		// hacemos un mapa local para poder llenarlo
		// interface i=new ClaseQueImplementalaInteface
		// los metodos de las interfaces cobran sentido cuando estan implementados
		Map<Integer, IAccion> accionMap = new HashMap<>();
		accionMap.put(1, new AccionAlta());
		accionMap.put(2, new AccionBaja());
		accionMap.put(3, new AccionListar());
		accionMap.put(4, new AccionModificar());

		return accionMap;
	}
	 
	 public static IAccion getAccion(Integer opcion) {
		 IAccion accion=new AccionDefault();
		 if(accionMap.containsKey(opcion)) {
			 accion=accionMap.get(opcion);
		 }
		
		
		 return accion;
		 
		 
	 }
	
	

}
