package ar.com.tiendapepito.challenger.web.controllers;

import java.util.List;

import ar.com.tiendapepito.challenger.entity.Producto;
import ar.com.tiendapepito.challenger.service.exception.ServiceException;
import ar.com.tiendapepito.challenger.serviceimpl.ProductoServiceImpl;
import ar.com.tiendapepito.challenger.services.ProductoService;

public class ProductoController {

	public static void main(String[] args) {

		ProductoService service = new ProductoServiceImpl();
		
		try {
			//obtengo todos los articulos
			List<Producto> list = service.obtenerTodosProductosTienda();
			System.out.println("la lista de productos es:/n" + list);
			if(!list.isEmpty()) {
				
				Producto producto =  service.getByPk(list.get(0).getCodigo());
				
				System.out.println(producto);
				
				//QUIERO ELIMINAR 
				//service.deleteArticulo(articulo.getId());//ctrl+t
				
				//System.out.println("se ha eliminado" + articulo.getId());
				
				producto.setStock(35l);
				
				
				service.updateProducto(producto);
			}
			
		} catch (ServiceException e) {
			e.printStackTrace();
		}
		
		
	}
}

/*
 * Long codigo=1234434l; Long stock=43l; String nombre="zapatos5"; Long
 * id_categoria=1l;
 * 
 * Producto nuevo=new Producto(nombre, codigo, stock, id_categoria);
 * 
 * //insertar en la db??
 * 
 * //ProductoDao proDao=new ProductoDaoMysqlImpl();
 * 
 * ProductoService articuloService=new ProductoServiceImpl();
 * 
 * articuloService.CrearProducto(nuevo);
 */