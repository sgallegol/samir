package ar.com.tiendapepito.challenger.web.controllers;

import ar.com.tiendapepito.challenger.daos.ProductoDao;
import ar.com.tiendapepito.challenger.daos.impl.EntidadesDaoMysqlImpl;
import ar.com.tiendapepito.challenger.entity.Producto;
import ar.com.tiendapepito.challenger.service.exception.ServiceException;
import ar.com.tiendapepito.challenger.serviceimpl.ProductoServiceImpl;
import ar.com.tiendapepito.challenger.services.ProductoService;

public class CrearProductoController {
	
	public static void main(String[] args) {
		
		
		Long codigo=1234434l;
		Long stock=2l; 
		String nombre="zapatos5";
		Long id_categoria=null;
		
		Producto nuevo=new Producto(nombre, codigo, stock, id_categoria);
		ProductoService productoService=new ProductoServiceImpl();
		try {
			
			productoService.CrearProducto(nuevo);
			
			
			//insertar en la db??
			
			
			
			
			
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage()+", "+e.getCause());
		}
		
		
		
		
		
		
	}
	 
	 
	
	
	

}
