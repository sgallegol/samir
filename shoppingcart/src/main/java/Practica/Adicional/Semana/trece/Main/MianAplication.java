package Practica.Adicional.Semana.trece.Main;

import java.util.Collection;

import com.itextpdf.text.DocumentException;

import Practica.Adicional.Semana.trece.ControldeArchivos.IParser;
import Practica.Adicional.Semana.trece.ControldeArchivos.XLSXFile;
import Practica.Adicional.Semana.trece.Creador.PDF.PDF_Creador_Refletion;
import Practica.Adicional.Semana.trece.Dominio.Articulos;
import Practica.Adicional.Semana.trece.Exceptions.ExceptionsPDF;
import Practica.Adicional.Semana.trece.Exceptions.ParseException;

public class MianAplication {

	public static void main(String[] args) throws DocumentException, ExceptionsPDF {
		
		String ruta1="src/main/java/Practica/Adicional/Semana/trece/CarpetaArchivos/Articulos.xlsx";
		String rutaPDF="src/main/java/Practica/Adicional/Semana/trece/CarpetaArchivos/Articulo.pdf";
		IParser<Collection<Articulos>> par=new XLSXFile(ruta1);
		
		try {
			Collection<Articulos> lsArticulos=par.parse();
			PDF_Creador_Refletion pdf =new PDF_Creador_Refletion(rutaPDF,lsArticulos);
			pdf.crearPDF();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
