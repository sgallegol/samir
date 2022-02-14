package semananuevejercicio.dominio.it;

import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

import semananuevejercicio.dominio.Alumno;
import semananuevejercicio.dominio.DatosBDMemoria;
import semananuevejercicio.dominio.Inscripciones;
import semananuevejercicio.dominio.Materia;



public class Menu {

	public static void empezar() {
		// set es la interfaz y hasSet es la clase
		
		Set<Alumno> conjuntoAlum = new HashSet<Alumno>();
		Set<Materia> conjuntoMater = new HashSet<Materia>();

		// set de id_alumnos y set de id_materias
		Set<Integer> id_alumno = new HashSet<Integer>();
		Set<Integer> id_mater = new HashSet<Integer>();
		
		//instanciando la base de datos
		DatosBDMemoria memoria= new DatosBDMemoria();
		
		// registro de alumnos
		Scanner entrada = new Scanner(System.in);
		System.out.println("comenzo el programa genios");
		boolean controlador = true;
		while (controlador) {
			System.out.println("escoja la opcion que desea realizar");

			System.out.println("1. registro de alumnos");
			System.out.println("2.registro de materias");

			System.out.println("3.realizar inscripcion");
			System.out.println("4. consultar las inscripciones");
			System.out.println("5. eliminar una inscripcion");
			System.out.println("6.salir");
			int opcion=0;
			try {
				
				opcion = entrada.nextInt();
				entrada.nextLine();
			}catch(InputMismatchException e) {
				throw new InputMismatchException("ingrese un valor entero");
			}
			switch (opcion) {
			case 1:
				System.out.println("estoy haciendo un registro de alumnos");

				System.out.println("ingrese el nombre del alumno");
				String nombre = entrada.nextLine();

				try {
					System.out.println("ingrese la matricula");
					
					
					int matricula = entrada.nextInt();
					entrada.nextLine();
					System.out.println("ingrese el apellido");
					String apellido = entrada.nextLine();
					// a continuacionhacemos una instacia en alumnos para usuario
					Alumno usuario = new Alumno(nombre, apellido, matricula);
					conjuntoAlum.add(usuario);
					System.out.println(conjuntoAlum);
					
					id_alumno.add(matricula);
					
					
				}catch(InputMismatchException e) {
					throw new InputMismatchException("ingrese un valor entero");
				}

				break;

			case 2:
				System.out.println("estoy haciendo un  registro de materias");
				
				int id_materia=0;
				try {
					System.out.println("ingrese el id de la materia");
					 id_materia = entrada.nextInt();
					entrada.nextLine();
					
					
				}catch(InputMismatchException e) {
					throw new InputMismatchException("ingrese un valor entero");
				}
				System.out.println("ingrese el nombre d ela materia");

				String nombre_materia = entrada.nextLine();
				boolean validador;
				String turno;
				do {
					System.out.println("ingrese el turno de la materia Am(mañana) o Pm(tarde");
					turno = entrada.nextLine();
					if (turno.equalsIgnoreCase("Am") || turno.equalsIgnoreCase("Pm")) {
						validador = false;
					} else {
						validador = true;
					}

				} while (validador);
				Materia mater = new Materia(id_materia, nombre_materia, turno);
				conjuntoMater.add(mater);

				id_mater.add(id_materia);

				break;
			case 3:
				System.out.println("estoy realizando la inscripcion de alumnos");
				if (conjuntoMater.isEmpty() || conjuntoAlum.isEmpty()) {
					if (conjuntoMater.isEmpty()) {
						System.out.println("no existen materias materias en la base de datos");
					}
					if (conjuntoAlum.isEmpty()) {
						System.out.println("no existe alumnos en la base de datos");

					}

				} else {
					int id_alumno1=0;
					
					try {
						System.out.println("ingrese el id del alumno que desea registrar");
						 id_alumno1 = entrada.nextInt();
						entrada.nextLine();
						
						
					}catch(InputMismatchException e) {
						throw new InputMismatchException("ingrese un valor entero para alumno");
					}
					
					try {
						System.out.println("ingrese le id de la materia para inscripcion ");
						
						id_materia = entrada.nextInt();
						entrada.nextLine();
						
						
					}catch(InputMismatchException e) {
						throw new InputMismatchException("ingrese un valor entero para materia ");
					}
					
					
					
					if(id_alumno.contains(id_alumno1) && id_mater.contains(id_materia)) {
						System.out.println("estamos haciendo la inscripción");
						Alumno p= obtener_alumno(id_alumno1,conjuntoAlum);
						Materia m=obtener_materia(id_materia,conjuntoMater);
						Inscripciones nuevaInscripcion=new Inscripciones(p,m);
						memoria.agregardato(nuevaInscripcion);
						
						
					}
					else {
						System.out.println("alguno de los dos id no existe");
						
					}

				}

				break;
			case 4:
				System.out.println("estoy impimiendo todas las inscripciones");
				memoria.recorrerdatos();
				
				
				break;
			case 5:
				try {
					System.out.println("estoy eliminando una inscripcion");
					System.out.println("ingrese el codigo de inscrpcion a eliminar");
					int codigo=entrada.nextInt();
					entrada.nextLine();
					memoria.eliminardatos(codigo);
					
					
				}catch(InputMismatchException e) {
					throw new InputMismatchException("ingrese un valor entero");
				}
				
				break;
				
			case 6:
				
				System.out.println("estoy saliendo");
				controlador = false;
				
				break;
				

			}

		}

	}
	
	public static Alumno obtener_alumno(int id,Set<Alumno>conjunto){
	
		Alumno aux = null;
		for(Alumno alum:conjunto) {
			if(alum.getMatricula()==id) {
				aux=alum;
				break;
				
			}
		}
		return aux;
		
		
		
	}
	
	
	public static Materia obtener_materia(int id,Set<Materia>conjunto) {
		
		Materia aux = null;
		for(Materia mater:conjunto) {
			if(mater.getId()==id) {
				aux=mater;
				break;
				
			}
		}
		return aux;
		
	}
	
	
	
	

}
