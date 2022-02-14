package semananuevejercicio.dominio;
import java.util.ArrayList;
import java.util.List;

public class DatosBDMemoria {
	// el tipo de dato es array y va a ser de tipo inscripciones
	// public int alex=4;
	private List<Inscripciones> datosMemoria;

	public DatosBDMemoria() {

		this.datosMemoria = new ArrayList<Inscripciones>();
	}// fin del constructor

	public void recorrerdatos() {
		// for(i=0;i<10;i++)
		if(datosMemoria.isEmpty()) {
			System.out.println("no hay datos en la memoria");
		}else {
			for (Inscripciones dato : datosMemoria) {
				System.out.println("----------------------------------------");
				System.out.println("codigo inscripcion: "+dato.getId());
				System.out.println("nombre: "+ dato.getInsc_alumno().getNombre());
				
				System.out.println("materia: "+ dato.getInsc_materia().getNom_curso());
				System.out.println("turno: "+ dato.getInsc_materia().getTurno());
				System.out.println("----------------------------------------");

			}
			
		}
	}// fin del método recorrer datos

	public void agregardato(Inscripciones inscri) {
		datosMemoria.add(inscri);

	}

	public void eliminardatos(int id) {
		boolean existe=false;
		if(datosMemoria.isEmpty()) {
			System.out.println("no hay datos en memoria");
		}else {
			int id_aux=0;
			for (int x=0;x< datosMemoria.size();x++) {
				if(datosMemoria.get(x).getId()==id) {
					id_aux=x;
					existe=true;
					break;
				}
				
				
			}
			if(existe) {
				
				datosMemoria.remove(id_aux);
				
				System.out.println(" el elemento o la isncripcion a sido eliminada de la base de datos");
			}
			else {
				System.out.println("el dato no existe en la memnoria");
			}
			
		}
	}

}
