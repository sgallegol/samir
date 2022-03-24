package Practica.Adicional.Semana.trece.ControldeArchivos;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;

import Practica.Adicional.Semana.trece.Dominio.Articulos;
import Practica.Adicional.Semana.trece.Exceptions.ParseException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLSXFile extends BaseFile implements IParser<Collection<Articulos>> {

	public XLSXFile(String path) {
		super(path);

	}

	@Override
	public Collection<Articulos> parse() throws ParseException {

		File archivoExcel = new File(super.getPath());
		Collection<Articulos> arlista = new ArrayList<Articulos>();
		try (InputStream ExcelinputStrem = new FileInputStream(archivoExcel);
				Workbook libroArti = new XSSFWorkbook(ExcelinputStrem);) {
			Sheet hoja = libroArti.getSheetAt(1);
			Iterator<Row> filas = hoja.iterator();
			boolean fila1 = true;
			while (filas.hasNext()) {
				Row actual = filas.next();
				Articulos artvacio = new Articulos();
				if (fila1) {
					fila1 = false;
					continue;
				}
				artvacio.setTitulo(actual.getCell(0).getStringCellValue());
				artvacio.setCodigo(actual.getCell(1).getStringCellValue());
				artvacio.setPrecio(actual.getCell(2).getNumericCellValue());
				artvacio.setStock((long) actual.getCell(3).getNumericCellValue());
				artvacio.setMarcaId((long) actual.getCell(4).getNumericCellValue());
				artvacio.setCategoriaId((long) actual.getCell(5).getNumericCellValue());
				artvacio.setFechaCreacion(new Date());

				arlista.add(artvacio);

			}

		} catch (IOException e) {
			throw new ParseException("no s epudo parsear el archivo", e);
		}
		return arlista;
	}

}
