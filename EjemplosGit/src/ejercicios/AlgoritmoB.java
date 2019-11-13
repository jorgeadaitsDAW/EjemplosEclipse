package ejercicios;

public class AlgoritmoB {

public static void main(String[] args) {
}

public static void algoritmoB(int a) {
	
for(int x = 1;x <=a;x++) {
int b=(int)Math.sqrt(x);
int c=0;

for (int j=b;j>1;j--){
if (x%j==0){
c++;
}
}

if (c<1){
System.out.println(x);
}
}
}
}
