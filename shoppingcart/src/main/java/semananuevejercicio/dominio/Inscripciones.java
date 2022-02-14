package semananuevejercicio.dominio;
public class Inscripciones {
	private static int id=0;
	private  Alumno insc_alumno;
	private Materia insc_materia;
	public Inscripciones(Alumno insc_alumno, Materia insc_materia) {
	id=id +1;
		this.insc_alumno = insc_alumno;
		this.insc_materia = insc_materia;
	}
	public static int getId() {
		return id;
	}
	
	public Alumno getInsc_alumno() {
		return insc_alumno;
	}
	public void setInsc_alumno(Alumno insc_alumno) {
		this.insc_alumno = insc_alumno;
	}
	public Materia getInsc_materia() {
		return insc_materia;
	}
	public void setInsc_materia(Materia insc_materia) {
		this.insc_materia = insc_materia;
	}
	
	
	
	
	
	

}
