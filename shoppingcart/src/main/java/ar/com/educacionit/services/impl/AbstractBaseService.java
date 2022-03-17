package ar.com.educacionit.services.impl;


import a.com.educacion.dao.GaenericDao;
import ar.com.educacionit.services.GenericService;


public class AbstractBaseService<T> implements GenericService<T> {
	
	//se crea un atributo de tipo interfaz

		protected GaenericDao<T> genericDao;
//se crea un metodo con una variable de tipo  interfaz GaenericDao
		public AbstractBaseService(GaenericDao<T> daoDelHijo) {
			this.genericDao = daoDelHijo;
		}
		
		public T getOne(Long id) {
			return genericDao.getOne(id);
		}

		public void delete(Long id) {
			genericDao.delete(id);
		}

		public T save(T entity) {
			return genericDao.save(entity);
		}

		public void update(T entity) {
			genericDao.update(entity);		
		}

		public T[] findAll() {
			return genericDao.findAll();
		}
	}


