package Practica.Adicional.Semana.trece.ControldeArchivos;

import Practica.Adicional.Semana.trece.Exceptions.ParseException;

public class BaseFile {

	protected String path;

	public BaseFile(String path) {
		if (path == null) {
			throw new IllegalArgumentException("Debe indicar un path de archivo");
		}
		this.path = path;
	}

	public String getPath() throws ParseException {
		if (this.path != null) {
			return path;
		} else {
			throw new ParseException("No existe un path asociado");
		}
	}

}
