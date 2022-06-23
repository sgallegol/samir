package desarrrollo.practica.adicional.semana.seis;

public class AccionModificar implements IAccion {

	@Override
	public void execute(Articulo  algo) {
		
		Articulo art=InMemoryDB.getById(algo.getId());
		if(art !=null) {
			InMemoryDB.update(algo.getId(), algo);
		}
		
	}

}
