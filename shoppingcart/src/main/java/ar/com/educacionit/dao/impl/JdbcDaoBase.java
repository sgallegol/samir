package ar.com.educacionit.dao.impl;
import java.lang.reflect.AnnotatedParameterizedType;
import a.com.educacion.dao.GaenericDao;
import ar.com.educacionit.dominio.Entity;

import java.lang.reflect.ParameterizedType;
//las T son entidades que representan tablas,por ende van a heredar de Entity


//a continuacion vemos que necesitamos implemnetar obligatoriamnete los metoddos de entity por eso creamos una clase abstract
// mas no una interfas ya que dentro de los mayor menor<> no puedo colocar implments si no solo extends y para que la T este obligada a tener los metodos
//debe de ser un clase abstract la que lo proporcione, obligue a los hijos a implentar los metodos
//luego cambiamosel entity por una interfaz y quedo mejor

public class JdbcDaoBase<T extends Entity> implements GaenericDao<T>{
	
	//se crea un atributo private de tipo stringco con el nombre
	//"tabla"
	protected String tabla;
	protected Class<T> clazz;//el class me condiciona los campos que van a manjear el generic
	//Class nos va aservir para detectar cuales son los atributos(descripcion de como esta la clase) que va a teer una clase determinada
	//getname()
	//filds nombre, id etc;
	
	
	//luego creamos el metodo constructor, el cual nos sirve para hacer las instanciasde los objetos, y se hace el 
	//llamado delo objeto creado tabla para utilizar los respectivos metodos que se tienen para el
	public JdbcDaoBase(String tabladelhijo){
		
		
		this.tabla=tabladelhijo;
		//api de reflaction de java, resuelve cual es la clase de una clasd generica
		this.clazz=(Class<T>)((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
		
		
	


	
	}
	public T getOne(Long id) {
		
		String sql  = "SELECT * FROM " +this.tabla+" WHERE ID = " + id;
		System.out.println("ejecutando sql"+sql);
		//lo siguiente no se explica para que exactamente
		T entity;
		//a continuacion se estaria generando una nueva instancia a partir del class
		//y el try cath nos sirve como forma de acceder a una instancia nueva del objeto
		try {
			 entity =this.clazz.getDeclaredConstructor().newInstance();
			entity.setId(id);
			 //falta una clase utilitaria que va a saber como tomar la instancia y como armar 
			 //los seteos de los atributos
		}  catch (Exception e) {
			// TODO Auto-generated catch block
			entity=null;
		}
		return entity;
	}
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}
	public T save(T Socios) {
		// TODO Auto-generated method stub
		return null;
	}
	public void update(T Socios) {
		// TODO Auto-generated method stub
		
	}
	
	public T[] findAll() {
		// TODO Auto-generated method stub
		return null;
	}
}
	