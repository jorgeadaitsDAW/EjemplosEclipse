package ejemplosClase;

import java.util.Random;

public class AlgoritmoBRefactorizado {
	
	public static void main(String[] args) {
		System.out.println("Prueba 1:");
		crearArrayEnterosAleatoriosOrdenado(10);
		
		System.out.println("Prueba 2:");
		crearArrayEnterosAleatoriosOrdenado(20);
		
		System.out.println("Prueba 3:");
		crearArrayEnterosAleatoriosOrdenado(30);
		
		System.out.println("Prueba 4:");
		crearArrayEnterosAleatoriosOrdenado(40);
	}
	
	/*Funci�n que crea un array de n�meros aleatorios y los ordena de menor a mayor
	 * 	-tamanyoArray: Es el tama�o del array que vamos a crear. En Java siempre hay que definirlo.
	 * 		la letra �, siempre deber�amos sustituirla por ny
	 * 
	 * Esta funci�n no devuelve nada
	 */
	
	public static void crearArrayEnterosAleatoriosOrdenado(int tamanyoArray) { 
		
		/*Hemos cambiado el bloque para crear un array con n�meros aleatorios
		 * por la llamada a una funci�n que realiace esa tarea.
		 * */
		
		int[] numerosAleatorios = crearArrayEneterosAletaroios(tamanyoArray);

		/*
		 * Otro truco para autocompletar el c�digo, es cada vez que escribimos algo, pulsamos CRTL+ESPACIO,
		 * el propio elcipse te sacar� una lista de posibilidades a escribir;
		 * */
		
		/*
		 * Creamos una funci�n para imprimir arrays
		 * De esta forma podemos usarlo ahora, para ver como es el array con n�mero aleatorios creado
		 * y para ver como queda despu�s de que lo ordenemos 
		 * */
		System.out.println("Array Con n�meros aleatorios desordenado:");
		imprimirArray(numerosAleatorios);
		
		/*
		 * Por �ltimo nos quedas incluir este bloque en otra funci�n
		 * Para que pueda usarse tanto en este algorimo como en cualquier otro
		 * */
		
		numerosAleatorios = ordenarArrayPorIntercambio(numerosAleatorios);
		
		System.out.println("Array Con n�meros aleatorios ordenador:");
		imprimirArray(numerosAleatorios);
	}
	
	
	/*
	 * Funci�n que crea un array con n�meros aleatorios
	 * 	-tamanyoArray => Indica el n�mero de enteros que tendr� el array.
	 * 	
	 * 	- Devuelve el array que hemos creado.
	 * */
	public static int[] crearArrayEneterosAletaroios(int tamanyoArray) {
		int[] arrayEnterosAleatorios = new int[tamanyoArray];
		for(int posArray = 0;posArray< arrayEnterosAleatorios.length;posArray++) {
			Random r = new Random();//Creamos el objeto Random que se encargar� de crear los n�mero aleatorios
			arrayEnterosAleatorios[posArray] = r.nextInt(100) ;//Crea n�meros aleatorios en el rango de 1 a 100;
		}
		return arrayEnterosAleatorios;
	}
	
	/*
	* En este caso he cambiado el nombre del parametro, respecto a la variable,
	* porque esta funci�n puede usarse en futuras funciones que implementemos
	* 
	* 	-listaNueros => Array de numeros que queremos imprirmir 
	* 
	* No devuelve nada
	*/
	public static void imprimirArray(int[] listaNumeros) {
		/*Cuando queremos mostrar algo por pantalla es m�s aconsejable acumular todo lo que vamos a mostrar
		 * en una sola variable y despu�s imprimir esa variable por consola.
		 * */
		
		String arrayEnFormatoCadena = "[";
		for(int posArray = 0;posArray< listaNumeros.length;posArray++) {
			//Este caso es una excepci�n para usar ternarios, porque es f�cil de entender
			//y nos sirve en este caso para indicar si incluimos una coma o no, para separar
			// el n�mero que incluimos en el array. El �nico n�mero que no tiene coma delante,
			// es el primero que se coloca.
			String coma = posArray==0?"":","; 
			arrayEnFormatoCadena +=coma;
			
			arrayEnFormatoCadena +=listaNumeros[posArray];//Concatenamos el numero
		}
		arrayEnFormatoCadena +="]";
		System.out.println(arrayEnFormatoCadena);
	}
	
	/*Para ordenar un array existen varias formas de hacerlo,
	*En este caso lo hacemos por intercambio, por eso es bueno incluir el tipo de ordenaci�n 
	*en el nombre de la funci�n.
	*
	*/
	/*
	 * Esta funci�n recibe por param�tro un array de enteros y lo devuelve ordenado.
	 * Va reccoriendo el array, comparando cada valor con los que tiene en las siguientes posiciones, 
	 * si el valor es mayor realiza el intercambio, sino es menor, se queda en la misma posici�n.
	 * 
	 * 		-listaNumeros => Array de numeros desordenados
	 * 
	 * 		-Devuelve la listaNumeros ordenados
	 * 
	 * */
	public static int[] ordenarArrayPorIntercambio(int[] listaNumeros) {
		
		/*Recorremos el array desde la primera posici�n*/
		for(int i=0;i<(listaNumeros.length-1);i++){
			/*Recorremos el array desde la siguiente la posici�n al n�mero anterior
			 * porque los anteriores ya son menores, porque han sido ya procesados,
			 * en interacciones anteriores.
			 * */
            for(int j=i+1;j<listaNumeros.length;j++){
                if(listaNumeros[i]>listaNumeros[j]){
                	/*Cuando se realiza un intercambio entre dos valores,
                	 * siempre debemos usar una variable auxiliar que almacene
                	 * el valor de una de las variables antes de cambiarle el valor,
                	 * para despu�s intercambiarlo
                	 * */
                    int numeroAuxiliar=listaNumeros[i];
                    listaNumeros[i]=listaNumeros[j];
                    listaNumeros[j]=numeroAuxiliar;
                }
            }
        }
		return listaNumeros;
	}
	
}
