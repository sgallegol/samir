package ar.com.tiendapepito.challenger.web.controllers;

import java.util.List;
import java.util.Scanner;

import ar.com.tiendapepito.challenger.entity.Producto;
import ar.com.tiendapepito.challenger.service.exception.ServiceException;
import ar.com.tiendapepito.challenger.serviceimpl.ProductoServiceImpl;
import ar.com.tiendapepito.challenger.services.ProductoService;

public class DeleteProducto{

	public static void main(String[] args) throws ServiceException {
		
		ProductoService service=new ProductoServiceImpl();
		System.out.println("articulos existentes");
		List<Producto> list=service.findAll();
		System.out.println(list);
		System.out.println("--------------------");
		
		try(Scanner tc=new Scanner(System.in)){
			
			
			
			System.out.println("ingrese id articulo");
			
			Long id=tc.nextLong();
			
			service.delete(id);
			
		}
		
				
		
	}
	
	
}
