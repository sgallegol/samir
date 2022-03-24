package Practica.Adicional.Semana.trece.ControldeArchivos;

import Practica.Adicional.Semana.trece.Exceptions.ParseException;

public interface IParser<T> {

	public T parse() throws ParseException;
	
	
	

}
