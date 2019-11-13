package ejemplosClase;

import java.util.Random;

public class AlgoritmoB {

	/*Este es otro ejemplo de un algoritmo que no esta refactorizado
	 * En este caso usamos arrays de enteros, pero la complejidad reside
	 * en los nombres de las variables usadas 
	 * 
	 * Aqui nos encontramos con otros problemas que debemos evitar:
	 * 
	 * 	- Una funci�n debe hacer lo que se le pide, si hace algo m�s que no es su funci�n,
	 * 		significa que debemos refactorizar dicho c�digo, puede que se entienda mejor,
	 * 		si cada bloque de c�digo lo dividimos en peque�as funciones.
	 * 
	 * 	- La repetici�n del c�digo: si vemos que hemos repetido el mismo c�digo en la misma funci�n
	 * 		debemos refactorizar ese c�digo de la siguiente forma:
	 * 			- Creamos una funci�n que haga ese c�digo y hacemos llamadas a esa funci�n	
	 * 		
	 * 
	 * */
	
	public static void main(String[] args) {
		algoritmoB(10);
		algoritmoB(20);
		algoritmoB(30);
		algoritmoB(40);
	}
	
	public static void algoritmoB(int x) { 
		
		int[] w = new int[x];
		for(int i = 0;i< w.length;i++) {
			Random r = new Random();
			w[i] = r.nextInt(100) ;
		}

		/*Este c�digo se repite exactamente igual m�s adelante*/
		System.out.print("[");
		for(int i = 0;i< w.length;i++) {
			if(i != 0) {
				System.out.print(",");
			}
			System.out.print(w[i]);
			
		}
		System.out.println("]");
		
		for(int i=0;i<(w.length-1);i++){
            for(int j=i+1;j<w.length;j++){
                if(w[i]>w[j]){
                    int z=w[i];
                    w[i]=w[j];
                    w[j]=z;
                }
            }
        }
		
		System.out.print("[");
		for(int i = 0;i< w.length;i++) {
			if(i != 0) {
				System.out.print(",");
			}
			System.out.print(w[i]);
			
		}
		System.out.println("]");
	}
	
	
	
}
