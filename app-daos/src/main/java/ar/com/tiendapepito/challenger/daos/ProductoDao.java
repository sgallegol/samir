package ar.com.tiendapepito.challenger.daos;

import java.sql.SQLException;
import java.util.List;

import ar.com.tiendapepito.challenger.entity.Producto;
import ar.com.tiendapepito.challenger.exceptions.DuplicatedException;
import ar.com.tiendapepito.challenger.exceptions.GenericException;

//A continuación utilizamos transitividad para traer  a la clase producto dentro el modulo de daos
public interface ProductoDao  extends GenericDao<Producto> {
	
	
	public Producto getByCode(Long codigo) throws GenericException;
	
	
	

}
