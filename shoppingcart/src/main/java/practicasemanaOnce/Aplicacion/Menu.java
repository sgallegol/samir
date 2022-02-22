package practicasemanaOnce.Aplicacion;

import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Set;

import javax.swing.JOptionPane;

import practicasemanaOnce.dominio.Idioma;
import practicasemanaOnce.dominio.Idiomaimpl;
import practicasemanaOnce.dominio.Persona;

public class Menu {
	// a continuacion generamos las instancias para cerar los idiomas
	boolean validador = true;
	Set<Persona> personas = new HashSet<Persona>();
	Set<String> nombres = new HashSet<String>();
	Idiomaimpl ingles = new Idiomaimpl("ingles", "hello");
	Idiomaimpl aleman = new Idiomaimpl("aleman", "hallo an alle");
	Idiomaimpl italiano = new Idiomaimpl("italiano", "ciao a tutti");
	Idiomaimpl frances = new Idiomaimpl("frances", "bonjour a tous");
	Idiomaimpl chino = new Idiomaimpl("chino", "大家好");

	public void empezar() {
		JOptionPane.showMessageDialog(null, "Empezando mi aplicacion");
		do {
			int opcion = 5;
			try {
				opcion = Integer.parseInt(JOptionPane.showInputDialog(
						"ingrese la opcion a realizar: \n 1.registrar persona \n 2.aprender idioma \n 3.saber cantidad de idiomas \n4. hablan el mismo idioma \n 5. salir"));

			}catch(InputMismatchException t) {
				throw new InputMismatchException("ingrese un valor entero");
			}

			switch (opcion) {
			case 1:
				registrarpersonas();

				break;
			case 2:
				aprenderidioma();

				break;
			case 3:
				saberidiomas();
				break;

			case 4:
				hablanmismoidioma();
				break;

			case 5:
				validador = false;
				JOptionPane.showMessageDialog(null, "Gracias por asistir");
				break;

			}
		} while (validador);

	}

	public void registrarpersonas() {
		String nombre = JOptionPane.showInputDialog("ingrese el nombre de la persona");
		String apellido = JOptionPane.showInputDialog("ingrese el apellido de la persona");
		String idioma = JOptionPane.showInputDialog("ingrese el idioma nativo");
		if (!(getIdioma(idioma) == null)) {
			Persona per = new Persona(nombre, apellido, getIdioma(idioma));
			personas.add(per);
			JOptionPane.showMessageDialog(null, "la persona se ha registrado con exito");
		} else {
			JOptionPane.showMessageDialog(null, "el idioma registrado es invalido");

		}
	}

	public void aprenderidioma() {
		String nombre = JOptionPane.showInputDialog("ingrese el nombre de la persona que aprendio el idioma");
		String apellido = JOptionPane.showInputDialog("ingrese el apellido de la persona que aprendio el idioma");
		String idioma = JOptionPane.showInputDialog("ingrese el idioma aprendido");

		if (existepersona(nombre, apellido) && getIdioma(idioma) != null) {

			Persona p1 = obtenerpersona(nombre, apellido);
			p1.aprenderidioma(getIdioma(idioma));
		} else {
			if (!(existepersona(nombre, apellido))) {
				JOptionPane.showMessageDialog(null, "la persona no existe");
			} else {
				JOptionPane.showMessageDialog(null, "el idioma registrado es invalido");

			}
		}

	}

	public Idiomaimpl getIdioma(String Idioma) {
		if (Idioma.equalsIgnoreCase("ingles")) {
			return this.ingles;

		} else if (Idioma.equalsIgnoreCase("italiano")) {
			return this.italiano;

		} else if (Idioma.equalsIgnoreCase("aleman")) {
			return this.aleman;

		} else if (Idioma.equalsIgnoreCase("frances")) {
			return this.frances;

		} else if (Idioma.equalsIgnoreCase("chino")) {
			return this.chino;

		} else {
			return null;
		}

	}

	public boolean existepersona(String nombre, String apellido) {
		boolean respuesta = false;
		for (Persona usuario : personas) {

			if (usuario.getNombre().equalsIgnoreCase(nombre) && usuario.getApellido().equalsIgnoreCase(apellido)) {
				respuesta = true;
			}

		}
		return respuesta;

	}

	public Persona obtenerpersona(String nombre, String apellido) {
		Persona respuesta = null;
		for (Persona usuario : personas) {

			if (usuario.getNombre().equalsIgnoreCase(nombre) && usuario.getApellido().equalsIgnoreCase(apellido)) {
				respuesta = usuario;
			}

		}
		return respuesta;

	}

	public void saberidiomas() {
		String nombre = JOptionPane.showInputDialog("ingrese el nombre ");
		String apellido = JOptionPane.showInputDialog("ingrese el apellido");
		if (existepersona(nombre, apellido)) {

			Persona p1 = obtenerpersona(nombre, apellido);
			System.out.println(" -------------------- ");
			System.out.println(p1.getNativo().getNombreIdioma());

			for (Idiomaimpl idioma : p1.obtenerIdiomas()) {
				System.out.println("idioma: " + idioma.getNombreIdioma());

			}
		} else {
			JOptionPane.showMessageDialog(null, "no existe persona");
		}
		System.out.println(" -------------------- ");

	}

	public void hablanmismoidioma() {

		String idioma = JOptionPane.showInputDialog("ingrese el idioma ");
		if (getIdioma(idioma) != null) {
			for (Persona usuario : personas) {

				if (usuario.getNativo().getNombreIdioma().equalsIgnoreCase(idioma)
						|| usuario.obtenerIdiomas().contains(getIdioma(idioma))) {
					nombres.add(usuario.getNombre());
				}

			}
		} else {
			JOptionPane.showMessageDialog(null, "el idioma no existe");
		}
		for (String nom : nombres) {
			System.out.println(nom);

		}
	}

}
