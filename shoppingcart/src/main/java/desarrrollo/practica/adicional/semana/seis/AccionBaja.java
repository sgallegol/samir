package desarrrollo.practica.adicional.semana.seis;

public class AccionBaja implements IAccion{

	@Override
	public void execute(Articulo algo) {
		
		InMemoryDB.delete(algo.getId());
		System.out.println("se ha eliminado el articulo del id:" + algo.getId());
		
	}
	
	

}
