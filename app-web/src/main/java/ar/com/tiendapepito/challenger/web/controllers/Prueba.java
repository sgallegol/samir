package ar.com.tiendapepito.challenger.web.controllers;

import java.util.List;

import ar.com.tiendapepito.challenger.entity.Producto;
import ar.com.tiendapepito.challenger.service.exception.ServiceException;
import ar.com.tiendapepito.challenger.serviceimpl.ProductoServiceImpl;

public class Prueba {
	
	public static void main(String[] args) {
		
		ProductoServiceImpl service=new ProductoServiceImpl();
		
		List<Producto> list;
		try {
			list = service.obtenerTodosProductosTienda();
			System.out.println("todos los productos son:/n" + list);
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}
	
	

}
