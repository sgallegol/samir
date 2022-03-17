package semananuevejercicio.dominio;


public class Alumno {

	private String nombre;
	private String apellido;
	private int matricula;
	
	public Alumno(String nombre, String apellido, int matricula) {
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.matricula = matricul;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public int getMatricula() {
		return matricula;
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellido=" + apellido + ", matricula=" + matricula + "]";
	}
//lo siguiente sirve para que no se repitan las  clases
	//id 1 juan 12 años
	//y si volvemos a colocar un id 1 

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + matricula;
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
		Alumno other = (Alumno) obj;
		if (matricula != other.matricula)
			return false;
		return true;
	}
	
	
	
	
	 
	
	
}
