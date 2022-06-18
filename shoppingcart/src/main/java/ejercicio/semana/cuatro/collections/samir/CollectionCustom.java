package ejercicio.semana.cuatro.collections.samir;

import java.util.ArrayList;
import java.util.Arrays;



/*Crear un clase CollectionCustom<T>
La clase tiene un atributo T[] “un array2 de T” en el cual se deben guardar los tipos una vez creada la implementación.

- debe tener los métodos
size():int
addFirst(T): void
addLast(T):void
add(T):void
remove(T): T remueve el primer elemento indicado y lo retorna
removeAll(T): void remueve todos los elementos.
boolean empty(): indica si la colección está vacía

Crear la clase Main para probar cada método.
No usar collection vistas en clase, deben trabajar con array2 de T, uds deben implementar la logica.
 * */

public abstract class CollectionCustom<T> {
	
	private T[] array;
	
		public void CollectionCustom(T[] lista) {
			this.array=lista;
			
		}
		
		//necesitamos crear cada uno de los metodos
		//comenzamos por el método size()
		
		//el método size devuelve el numero de elemntos  almacenados en el objeto ArryList
		
		public int size() {
			int size=array.length;
			return size;
		}
		
		//a continuación creamos el método AddFirst() el cual añade un elemento a alista en la primer posicion
	
		public void AddFirst(T variable) {
			int x=-1;
			T array2[]=Arrays.copyOf(array,(array.length +1));
			for(T i:array2) {
				if(x==-1) {
					array2[x+1]=variable;
				}else {
					array2[x+1]=array2[x];
				}
				x++;
			}
			array=array2;
			System.out.println("el nuevo tamaño del array2 es"+ size() + "\n");
			imprimir();
			System.out.println("el primer termino es");
			
		}
		public void AddLast(T variable) {
			
			T array2[]=Arrays.copyOf(array,(array.length +1));
			array2[array2.length-1]=variable;
			array=array2;
			imprimir();
			System.out.println("\n" +"añadir el termino dos");
			
			
		}
		
		public boolean Add(T variable) {
			boolean retu=false;
			AddLast(variable);
			if(array[array.length -1]==variable){
				retu=true;
			}
			System.out.println("\n"+"añadir el termino 3");
			
			return retu;
		}
		
		public T Remove(int localizacion) {
			int x=0;
			int y=0;
			T retu=array[localizacion];
			
			T array2[]=Arrays.copyOf(array,array.length-1);
			System.out.println(array2.length);
			System.out.println(array2.length);
			for(T i:array) {
				if(x<=array2.length) {
					if(x !=localizacion) {
						array2[x]=array[x];
						System.out.println("lol");
						y++;
					}
					x++;
				}
			}
			array=array2;
			System.out.println("\n"+"el termino 4 es:");
			imprimir();
			return retu;
			
			
		}
		
		public void RemoveAll() {
			T array2[]=Arrays.copyOf(array,0);
			array=array2;
		}
		
		
		
		public boolean Empty() {
			boolean verificar=false;
			if(array.length>0) {
				verificar=false;
			}
			else {
				verificar=true;
			}
			return verificar;		}
		
		
		public void imprimir() {
			for(T i: array) {
				System.out.println(i);
			}
		}
		
		
		
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


