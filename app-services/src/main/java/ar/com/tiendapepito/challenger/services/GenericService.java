package ar.com.tiendapepito.challenger.services;

import java.util.List;

import ar.com.tiendapepito.challenger.entity.Producto;
import ar.com.tiendapepito.challenger.service.exception.ServiceException;

public interface GenericService<T> {


	
	public T getByPk(Long id) throws ServiceException;
	public void delete(Long id) throws ServiceException;
public void update(T entity) throws ServiceException;
	
public List<T> findAll() throws ServiceException;



 public void create(T nuevo) throws ServiceException;


	
	
	
}
