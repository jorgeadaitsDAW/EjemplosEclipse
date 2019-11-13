package ejemplosClase;

public class AlgoritmoARefactorizado {

	/*	En este caso la funcionalidad ser� la misma que en Algoritmo A, pero 
	 * 	cambiaremos el c�digo para que se entienda mucho mejor.
	 * /
	
	
	/*	Para entender mejor las pruebas que vamos haciendo es aconsejable
	*	guardar el resultado en una variable y acto seguido imprimir por consola
	*	el valor, junto un texto descriptivo que ayude a identificar dicha prueba.
	*/
	public static void main(String[] args) {
		System.out.println("HOLA MUNDO");
		int resultadoPrueba1 = (obtenerPuntosPorNumeroDivisiones(12,2));
		System.out.println("El reusltado de la prueba 1 es: "+ resultadoPrueba1);
		
		int resultadoPrueba2 = (obtenerPuntosPorNumeroDivisiones(8,2));
		System.out.println("El reusltado de la prueba 2 es: "+ resultadoPrueba2);
		
		int resultadoPrueba3 = (obtenerPuntosPorNumeroDivisiones(0,2));
		System.out.println("El reusltado de la prueba 3 es: "+ resultadoPrueba3);
		
		int resultadoPrueba4 = (obtenerPuntosPorNumeroDivisiones(16,2));
		System.out.println("El reusltado de la prueba 4 es: "+ resultadoPrueba4);
	}
	
	
	/*
	 * Para las funciones siempre es importante definir al principio que hace
	 * Esta funci�n devuelve una serie de puntos dependiendo de las 
	 * veces que un n�mero(numeroADividir) se puede dividir por otro(divisor).
	 * 
	 * Ahora debemos explicar los argumentos de la funci�n:		
	 * 		
	 * 	-numeroADividir : Es el n�mero que va a dividirse.
	 * 	-divisor : Es el n�mero que va a dividir
	 * 
	 * Tambi�n es importante explicar el valor que se devuelve(return) e indicar el tipo:
	 * Se devuelve un tipo entero:
	 * 	- El n�mero de veces que se ha dividido por 100
	 * 	- Si no se dividie ninguna vez, devuelve 1 punto nada m�s 	
	 * */
	
	
	/*Una vez explicado el algoritmo debemos cambiar el nombre y los parametros de la funci�n a uno que se adapte a lo que hace
	 * */
	public static int obtenerPuntosPorNumeroDivisiones(int numeroADividir, int divisor) { 
	/*Ahora debemos formatear el c�digo, para ello usamos las funciones en Source
	*Por ejemplo Format o el atajo de teclado 	Crtl+Shift+F
	*	
	*El c�digo siempre tiene que estar bien indentado, cada bloque dentro de otro
	*debe estar indentado por espacio o tabulador	
	*/
		
	/*Ahora que el c�digo esta mejor indentado vamos a cambiar el valor de las variables
	 * para que se entienda mejor
	 * */	
		
		/*PAra cambiar el nombre de una variable en todos los sitios del c�digo a la vez usamos la siguiente
		 * funcionalidad de Eclipse. Pinchamos en la variable, pulsamos bot�n derecho y buscamos la funci�n
		 * REFACTOR, pulsamos despu�s en RENAME, y damos el nuevo nombre, y se modificar�n todas las variables.
		 * */
		
		int resultado = 0; //Siempre es bueno guardar el resultado de la funci�n de una variable,
						   //para tener siempre claro qui�n guarda el resultado a devolver	
		int contadorDivisiones = 0; //Cuenta el n�mero de divisiones que se llevan a cabo
		
		/*Tenemos que comprobar que el divisor sea mayor que 1 por:
		*	- En caso de 1: Cualquier n�mero se puede dividir entre 1 varias veces,
		*		por lo tanto si no lo controlamos entraremos en bucle infinito
		*
		*	- En caso de 0 : Si se divide entre 0 un n�mero dara error por lo tanto no podemos permitir que y sea 0
		*
		*Tenemos que comprobar que el numero a dividir sea mayor que 0, porque si su valor es cero,
		*el bucle siempre ser� infinito, porque el resto siempre ser� 0
		*/
		if(divisor > 1 && numeroADividir > 0) {
			/*Aqui cambiaremos el doWhile por un while normal, que es m�s f�cil de entender
			*poque sigue el flujo normal de ejecuci�n
			*/
			
			/* Cuando queremos saber si un n�mero es divisible por otro
			 * debemos comprobarlo con la operaci�n modulo(%), si el resto es 0, 
			 * significa que el n�mero de la izquierda es divisible por el de la derecha
			 */
			
			while(numeroADividir % divisor == 0) {
				//Incrementamos el contador de divisiones
				contadorDivisiones++;
				
				//Ahora actualizamos el numeroADvidir, con el resultado de dividirlo por el divisor
				numeroADividir = numeroADividir / divisor;
			}
			
		}
		 	
		//Calculamos el n�mero de puntos en base al n�mero de divisiones realizadas
		if(contadorDivisiones == 0) {
			resultado = 1;
		}else {
			resultado = contadorDivisiones *100;
		}

		
		//Devolvemos el resultado
		return resultado;
}
	
	
	
	
}
