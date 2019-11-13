package ejercicios;

public class AlgoritmoC {

	public static void main(String[] args) {
	
	}

	public static void algoritmoC(int x) {for(int i = 0;i< x; i++) {if(i > 10) {int aux, l = 0, cifra;aux = i;while (aux!=0){cifra = aux % 10;l = l * 10 + cifra;aux = aux / 10;}if(i == l){System.out.println(i);}}}
	}
	
}
