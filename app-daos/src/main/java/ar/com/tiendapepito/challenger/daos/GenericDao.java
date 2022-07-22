package ar.com.tiendapepito.challenger.daos;

import java.util.List;

import ar.com.tiendapepito.challenger.exceptions.DuplicatedException;
import ar.com.tiendapepito.challenger.exceptions.GenericException;

public interface GenericDao<T>  {
	
	public List<T> findAll() throws GenericException;
public void save(T entity) throws DuplicatedException,GenericException;
	
public T getByPk(Long id) throws GenericException;
	public void update(T ordenToUpdate) throws GenericException;
	
	public void delete(Long pk) throws GenericException;
	
	
	//el siguiente método no forma parte del crud
	
	//public Producto getByCode(Long codigo) throws GenericException;
	

}
