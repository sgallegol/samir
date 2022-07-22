package ar.com.tiendapepito.challenger.serviceimpl;

import java.util.List;

import ar.com.tiendapepito.challenger.daos.ProductoDao;
import ar.com.tiendapepito.challenger.daos.impl.EntidadesDaoMysqlImpl;
import ar.com.tiendapepito.challenger.daos.impl.VendedorDaoMysqlImpl;
import ar.com.tiendapepito.challenger.entity.Producto;
import ar.com.tiendapepito.challenger.entity.Vendedor;
import ar.com.tiendapepito.challenger.exceptions.DuplicatedException;
import ar.com.tiendapepito.challenger.exceptions.GenericException;
import ar.com.tiendapepito.challenger.service.exception.ServiceException;
import ar.com.tiendapepito.challenger.services.ProductoService;
import ar.com.tiendapepito.challenger.services.VendedorService;

public class VendedorServiceImpl  extends BaseService<Vendedor> implements VendedorService{

	//traemos los daos

	public VendedorServiceImpl() {
		
		super(new VendedorDaoMysqlImpl());
		
	}

	



	

}
