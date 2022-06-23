package desarrrollo.practica.adicional.semana.seis;

public class AccionAlta implements IAccion {

	@Override
	public void execute(Articulo algo) {
		//usamos la base de datos en memoria
		
		
		InMemoryDB.save(algo.getId(), algo);
		
	}

	
	

	
	

	
	
}
