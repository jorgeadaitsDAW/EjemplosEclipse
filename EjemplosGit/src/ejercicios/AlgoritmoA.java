package ejercicios;

public class AlgoritmoA {

	public static void main(String[] args) {
	
	}
	
	public static int algoritmoA(int x, int y, int z) {
int a=1;
			int b=0;
																									int c=0;
		
		while(a <= z){
									if(a%x == 0) {
				b = b + 1;
}else {
					if(a%y == 0) {
			c = c + 1;
										}
		}
a = a +1;}
		
		return b ==0?c:c==0?b:c*b;
	}}
