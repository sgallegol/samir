package semananuevejercicio.dominio;
public class Materia {
	
	private int id;
	private String nom_curso;
	private String turno;
	public Materia(int id, String nom_curso, String turno) {
		
		this.id = id;
		this.nom_curso = nom_curso;
		this.turno = turno;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom_curso() {
		return nom_curso;
	}
	public void setNom_curso(String nom_curso) {
		this.nom_curso = nom_curso;
	}
	public String getTurno() {
		return turno;
	}
	public void setTurno(String turno) {
		this.turno = turno;
	}
	@Override
	public String toString() {
		return "Materia [id=" + id + ", nom_curso=" + nom_curso + ", turno=" + turno + "]";
	}
	//a continuacion alt +s para llamar al hashCode que me permite no tener datos repetidos en el set
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
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
		Materia other = (Materia) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	
	

}
