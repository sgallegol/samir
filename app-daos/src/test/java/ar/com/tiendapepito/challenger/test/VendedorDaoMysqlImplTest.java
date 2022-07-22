package ar.com.tiendapepito.challenger.test;

import java.util.List;

import ar.com.tiendapepito.challenger.daos.VendedorDao;
import ar.com.tiendapepito.challenger.daos.impl.VendedorDaoMysqlImpl;
import ar.com.tiendapepito.challenger.entity.Vendedor;
import ar.com.tiendapepito.challenger.exceptions.GenericException;

public class VendedorDaoMysqlImplTest {
	
	public static void main(String[] args) throws GenericException {
		
		//hacemos un test de fin_All 
		
		//faltan libreria spara ejecutar pruebas unitarias
		VendedorDao dao=new VendedorDaoMysqlImpl();
		
		List<Vendedor> list=dao.findAll();
		
		System.out.println(list.size()>0);
	}
	
	
	
	
	

}
