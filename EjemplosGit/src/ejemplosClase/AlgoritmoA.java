	package ejemplosClase;

public class AlgoritmoA {

	public static void main(String[] args) {
		System.out.println(algoritmoA(12,2));
		System.out.println(algoritmoA(8,2));
		System.out.println(algoritmoA(0,2));
		System.out.println(algoritmoA(16,2));
	}
	
	/*Este es un ejemplo de una funci�n que hace lo que tiene que hacer, pero
	 * el c�digo es dificil de entender, por varias razones:
	 * 		-El c�dgio esta mal formateado
	 * 		-El nombre de las variables no ayudan a entender el agoritmo
	 * 		-Se ha usado do while y expresi�n ternarias complejas que dificultan el entendimiento del algoritmo
	 * 		-No hay comentarios que expliquen los parametros de entrada ni de salida
	 * 		-El nombre de la funci�n es gen�rico y no ayuda a entender dicho c�digo.
	 * 		-Es importante que el c�digo siempre ocupe la pantalla que vemos,si debemos usar la barra de abajo para
	 * 			desplazarnos, debemos estructurar de nuevo el c�digo.
	 * 
	 * Para deducir como funciona debemos ir utilizando el debugger, con diferentes 
	 * llamadas al m�todo algoritmoA con diferentes valores en los parametros,
	 * y vamos viendo como se comporta la funci�n y que nos devuelve en cada caso.
	 * 
	 * */
	
	public static int algoritmoA(int x, int y) { 
		int c = 0;if(x != 0 && y != 0 && y != 1) {do {
	int z = x % y;
		if(z == 0 ) {
		c++;}
	x = x /y;
	}while(x % y == 0);
}else {
	if(y == 1) {
		c = 1;
	}
}
																									return c == 0?1:c == 1?c*100:c > 2?c*100:200; 
}
	
	
	
	
}
