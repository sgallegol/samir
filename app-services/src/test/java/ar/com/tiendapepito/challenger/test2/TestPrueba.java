package ar.com.tiendapepito.challenger.test2;

import java.util.List;

import ar.com.tiendapepito.challenger.entity.Producto;
import ar.com.tiendapepito.challenger.service.exception.ServiceException;
import ar.com.tiendapepito.challenger.serviceimpl.ProductoServiceImpl;
import ar.com.tiendapepito.challenger.services.ProductoService;

public class TestPrueba {
	
	public static void main(String[] args) throws ServiceException {
		
		ProductoService service=new ProductoServiceImpl();
		
		List<Producto> list =service.findAll();
		System.out.println(list);
	}
	
	

}
