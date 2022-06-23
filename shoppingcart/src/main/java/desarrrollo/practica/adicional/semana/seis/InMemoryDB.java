package desarrrollo.practica.adicional.semana.seis;

import java.util.HashMap;
import java.util.Map;

public class InMemoryDB {

	/*
	 * Crear un branch con el nombre practica-adicional-semana6 - Tomar como base la
	 * clase19, donde creamos una clase InMemoryDB - crear una exception por cada
	 * operación que realiza la base de datos. - modificar la interface IAction para
	 * poder lanzar dichas exceptions - modificar la clase MainMap para controlar e
	 * informar los errores.
	 * 
	 * 
	 * 
	 */
	private static Map<Integer, Articulo> db = new HashMap<>();

	// creamos el metodo para guardar algo dentro del mapa
	public static void save(Integer key,Articulo valor) {
		Articulo agregar=InMemoryDB.db.put(key, valor);
		if(agregar !=null) {
			throw new IllegalArgumentException("los valores ingresados son incorrectos");
		}
	}

	// actulizamo..
	public static  void update(Integer key, Articulo  newValue) {
		Articulo actualizar =InMemoryDB.db.replace(key, newValue);
		if(actualizar !=null) {
			throw new IllegalArgumentException("el articulo no se puede actualizar ya que no existe");
			
		}
	}

	public static void delete(Integer key) {
		Articulo eliminar=InMemoryDB.db.remove(key);
		if(eliminar !=null) {
			throw new IllegalArgumentException("el articulo no se puede eliminar... "+ "el articulo no existe para ser eeliminado");
		}
	}
	
	public static  Articulo getById(Integer key) {
		Articulo value=null;
		if(InMemoryDB.db.containsKey(key)) {
			value=InMemoryDB.db.get(key);
		}else {
			throw new IllegalArgumentException("la clave para la lectura esta erronea");
		}
		return value;
	}

	public static void listAll() {
		
		
		if(InMemoryDB.db.values() !=null) {
			
			System.out.println(InMemoryDB.db.values());
		}else {
			throw new IllegalArgumentException("no se puede listar valor equivocado");
		}
	}
}
