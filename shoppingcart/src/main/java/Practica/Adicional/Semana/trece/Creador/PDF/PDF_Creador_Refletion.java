package Practica.Adicional.Semana.trece.Creador.PDF;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.lang.reflect.Field;
import java.util.Collection;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import Practica.Adicional.Semana.trece.Dominio.Entidad;
import Practica.Adicional.Semana.trece.Exceptions.ExceptionsPDF;

public class PDF_Creador_Refletion<T extends Entidad> {
	private String direccionCarpeta;
	private Collection<Entidad> listadeArticulos;

	public PDF_Creador_Refletion(String direccion, Collection<Entidad> lista) {

		SetdireccionCarpeta(direccion);
		SetlistadeArticulos(lista);
	}

	private void SetlistadeArticulos(Collection<Entidad> lista) {
		this.listadeArticulos = lista;

	}

	public void SetdireccionCarpeta(String direccion) {
		this.direccionCarpeta = direccion;

	}

	public void crearPDF() throws DocumentException, ExceptionsPDF {
		System.out.println("escribiendo en el documento");
		Document pdfSamir = new Document();
		//lo sigueinte es un fichero para el pdf
		FileOutputStream pdfFichero;
		Object pdfObjeto=null;
		for(Object obj:this.listadeArticulos) {
			pdfObjeto=obj;
			break;
			
		}
		Class<? extends Object> clasePrueba=pdfObjeto.getClass();
		Field[] campos=clasePrueba.getDeclaredFields();
		int cantCampos=campos.length;
		try {
			pdfFichero=new FileOutputStream(this.direccionCarpeta);
			PdfWriter.getInstance(pdfSamir, pdfFichero);
			pdfSamir.open();
			Paragraph tituloarticulos = new Paragraph("articulos a la ventas: \n\n",
					FontFactory.getFont("arial", 19, Font.BOLD,BaseColor.BLACK));
			pdfSamir.add(tituloarticulos);
			PdfPTable table = new PdfPTable(cantCampos);
			for(Field camp:campos) {
				table.addCell(camp.getName());
			}
			for(Object obj:this.listadeArticulos) {
				clasePrueba=obj.getClass();
				campos=clasePrueba.getDeclaredFields();
				for(Field camp:campos) {
					camp.setAccessible(true);
					try {
						table.addCell(camp.get(obj).toString());
					} catch (IllegalArgumentException | IllegalAccessException e) {
						throw new ExceptionsPDF("no se puede ingresar el dato");
						
					}
					camp.setAccessible(false);
				}
				
			}
			pdfSamir.add(table);
			pdfSamir.close();
			System.out.println("documento creado  exitosamente");
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
