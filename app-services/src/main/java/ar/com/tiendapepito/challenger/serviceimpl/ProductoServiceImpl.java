package ar.com.tiendapepito.challenger.serviceimpl;

import java.sql.SQLException;
import java.util.List;

import ar.com.tiendapepito.challenger.daos.ProductoDao;
import ar.com.tiendapepito.challenger.daos.impl.EntidadesDaoMysqlImpl;

import ar.com.tiendapepito.challenger.entity.Producto;
import ar.com.tiendapepito.challenger.exceptions.DuplicatedException;
import ar.com.tiendapepito.challenger.exceptions.GenericException;
import ar.com.tiendapepito.challenger.service.exception.ServiceException;
import ar.com.tiendapepito.challenger.services.ProductoService;

public class ProductoServiceImpl extends BaseService<Producto> implements ProductoService {

	public ProductoServiceImpl() {
		
		super(new EntidadesDaoMysqlImpl());
		
	}


	



	

}
