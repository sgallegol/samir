package practicasemanaOnce.dominio;

public class Idiomaimpl implements Idioma{

	
	private String nombreIdioma;
	private String mensaje;
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((mensaje == null) ? 0 : mensaje.hashCode());
		result = prime * result + ((nombreIdioma == null) ? 0 : nombreIdioma.hashCode());
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
		Idiomaimpl other = (Idiomaimpl) obj;
		if (mensaje == null) {
			if (other.mensaje != null)
				return false;
		} else if (!mensaje.equals(other.mensaje))
			return false;
		if (nombreIdioma == null) {
			if (other.nombreIdioma != null)
				return false;
		} else if (!nombreIdioma.equals(other.nombreIdioma))
			return false;
		return true;
	}



	public Idiomaimpl(String nombreIdioma, String mensaje) {
	
		this.nombreIdioma = nombreIdioma;
		this.mensaje = mensaje;
	}



	public String saludar() {
		return getMensaje();
	}



	public String getNombreIdioma() {
		return nombreIdioma;
	}



	public void setNombreIdioma(String nombreIdioma) {
		this.nombreIdioma = nombreIdioma;
	}



	public String getMensaje() {
		return mensaje;
	}



	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}



	@Override
	public String toString() {
		return "Idiomaimpl [nombreIdioma=" + nombreIdioma + ", mensaje=" + mensaje + "]";
	}
	
	

}
