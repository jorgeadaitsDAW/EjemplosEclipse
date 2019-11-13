package ejercicios;

public class AlgoritmoE {

	public static void main(String[] args) {
	
	}
	
	public static void funcionE(String s) {
		
		int a1 = 0;
		int a2 = 0;
		
	    for(int x=0;x<s.length();x++) {
	        if ((s.charAt(x)=='a') || (s.charAt(x)=='e') || (s.charAt(x)=='i') || (s.charAt(x)=='o') || (s.charAt(x)=='u')){
	          a1++;
	        }else if (s.charAt(x)!=' ')
	        	a2++;
	    }
	    System.out.println(a1);
	    System.out.println(a2);
	 }	
}

