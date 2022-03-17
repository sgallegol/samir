package ar.com.educacionit.dominio;

import ar.com.educacionit.services.CategoriaService;
import ar.com.educacionit.services.SociosService;
import ar.com.educacionit.services.impl.CategoriaServiceImpl;
import ar.com.educacionit.services.impl.SociosServiceImpl;

public class SociosDaoTest {

	public static void main(String[] args) {
		SociosService service = new SociosServiceImpl();		
		Socios socios=service.getOne(1l);
		//socios va a tener todos los atributos nulos por el momento
		System.out.println(socios);
		
		CategoriaService cservice=new CategoriaServiceImpl();
		Categoria categoria=cservice.getOne(2l);
		System.out.println(categoria);

	}

}
