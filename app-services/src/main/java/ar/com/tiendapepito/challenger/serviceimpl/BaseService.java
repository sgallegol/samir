package ar.com.tiendapepito.challenger.serviceimpl;

import java.util.List;

import ar.com.tiendapepito.challenger.daos.GenericDao;
import ar.com.tiendapepito.challenger.entity.Producto;
import ar.com.tiendapepito.challenger.exceptions.DuplicatedException;
import ar.com.tiendapepito.challenger.exceptions.GenericException;
import ar.com.tiendapepito.challenger.service.exception.ServiceException;
import ar.com.tiendapepito.challenger.services.GenericService;

public abstract  class BaseService<T> implements GenericService<T> {
	
protected GenericDao<T> dao;
	
	public BaseService(GenericDao<T> dao) {
		this.dao = dao;
	}
	
	@Override
	public T getByPk(Long id) throws ServiceException {
		try {
			return dao.getByPk(id);
		} catch (GenericException e) {			
			throw new ServiceException("Error al consutlar T",e);
		}
	}
	

	@Override
	public void delete(Long id) throws ServiceException {
		try {
			dao.delete(id);
		} catch (GenericException e) {			
			throw new ServiceException("Error al eliminar el T",e);
		}				
	}

	@Override
	public void update(T entity) throws ServiceException {
		try {
			dao.update(entity);
		} catch (GenericException e) {			
			throw new ServiceException("Error al eliminar el T",e);
		}		
	}
	
	@Override
	public List<T> findAll() throws ServiceException {
		try {
			return dao.findAll();
		} catch (GenericException e) {			
			throw new ServiceException("Error consutlando Ts",e);
		}
	}

	@Override
	public void create(T nuevo) throws ServiceException {
		try {
			dao.save(nuevo);
		} catch (GenericException | DuplicatedException e) {			
			throw new ServiceException("Error creando Ts",e);
		}
	}

	



	


	
	

}
