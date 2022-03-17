package ar.com.educacionit.services.impl;


import ar.com.educacionit.dao.impl.CategoriaDaoImpl;
import ar.com.educacionit.dominio.Categoria;
import ar.com.educacionit.services.CategoriaService;

public class CategoriaServiceImpl extends AbstractBaseService<Categoria> implements CategoriaService {

	//AbstractBaseService ya tiene implemnetados los metodos que implemneta de generic services por lo tanto no hay que escrinirlos
	//y ademas al implemnentar categoria services se pueden crear metodos en categoriaService que solo estan en categoria service sin tocar a 
	//AbstractBaseService

	

	
		
		public CategoriaServiceImpl() {
			super(new CategoriaDaoImpl());
		}
	
	
	}

	


