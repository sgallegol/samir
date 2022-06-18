package ejercicio.semana.cuatro.collections.samir;

public class MainCollection2 {
	public static void main(String[] args) {
		
		Integer[] array1= {1,2,3,4,5};
		
		
		CollectionCustom<Integer> array= new CollectionCustom<Integer>(array);
		
		System.out.println("la dimension del array es:"+ array.size());
		array.AddFirst(7);
		array.AddLast(23);
		if(array.Add(40)) {
			System.out.println("es verdadero");
		}
		System.out.println("valor ratirado"+ array.Remove(4));
		array.RemoveAll();
		System.out.println("no hay nada ene l array"+ array.Empty());
		
		
	}
	
	

	
	

}
