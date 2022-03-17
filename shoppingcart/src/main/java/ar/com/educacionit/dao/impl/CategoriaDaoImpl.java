package ar.com.educacionit.dao.impl;

import a.com.educacion.dao.CategoriaDao;
import ar.com.educacionit.dominio.Categoria;

public class CategoriaDaoImpl extends JdbcDaoBase<Categoria> implements CategoriaDao {
	
	public CategoriaDaoImpl() {
		super("CATEGORIAS");
		
	}	
	
	
}

		
	






	
	

	
	

	/*	public Categoria getOne(Long id) {
			String sql  = "SELECT * FROM CATEGORIA WHERE ID = " + id;
			System.out.println("ejecutando sql"+sql);
			return new Categoria("categoria","abc0000");
		}

		public void delete(Long id) {
			// TODO Auto-generated method stub

		}

		public Categoria save(Categoria entity) {
			String sql = "INSERT INTO Categorias(descripcion,codigo)VALUES('"+entity.getDescripcion()+"', '"+entity.getCodigo()+"')";
			System.out.println("Ejecutando sql:" + sql);
			
			entity.setIdentifcacion(null);
			
			return entity; 
		}

		public void update(Categoria entity) {
			// TODO Auto-generated method stub

		}

		public Categoria[] findAll() {
			// TODO Auto-generated method stub
			return null;
		}*/

	
	

	
	
	
	
	

