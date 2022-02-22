package practicasemanaOnce.dominio;

import java.util.HashSet;
import java.util.Set;

public class Persona {
	private String nombre;
	private String apellido;
	//el siguiente es un atributo de tipo interfaz
	private Idiomaimpl nativo;
	private Set<Idiomaimpl> aprendidos=new HashSet<Idiomaimpl>();
	
	
	//creamos el constrcutor y get and seters
	public Persona(String nombre, String apellido, Idiomaimpl nativo) {
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.nativo = nativo;
		
	}
	
	public boolean hablaidioma(Idiomaimpl idioma) {
       boolean val=false;
		if(idioma.getNombreIdioma().equals(nativo.getNombreIdioma())) {
    	 val=true;
    	 
     }	else if(aprendidos.contains(idioma)) {
    	 val=true;
     }	
		return val;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Idiomaimpl getNativo() {
		return nativo;
	}
	public void setNativo(Idiomaimpl nativo) {
		this.nativo = nativo;
	}
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + "]";
	}
	public void aprenderidioma(Idiomaimpl idioma) {
		if(!(idioma.getNombreIdioma().equals(nativo.getNombreIdioma()))) {
		
		
			aprendidos.add(idioma);
		
		}
			
	}
	
	public Set<Idiomaimpl> obtenerIdiomas(){
		return aprendidos;
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((apellido == null) ? 0 : apellido.hashCode());
		result = prime * result + ((aprendidos == null) ? 0 : aprendidos.hashCode());
		result = prime * result + ((nativo == null) ? 0 : nativo.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (apellido == null) {
			if (other.apellido != null)
				return false;
		} else if (!apellido.equals(other.apellido))
			return false;
		if (aprendidos == null) {
			if (other.aprendidos != null)
				return false;
		} else if (!aprendidos.equals(other.aprendidos))
			return false;
		if (nativo == null) {
			if (other.nativo != null)
				return false;
		} else if (!nativo.equals(other.nativo))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	
	
	
	

}
