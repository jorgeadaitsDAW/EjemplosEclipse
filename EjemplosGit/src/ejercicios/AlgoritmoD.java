package ejercicios;

public class AlgoritmoD {
	
	public static void main(String[] args) {

	}
	
	public static void algoritmoD(double xyz) {
		
      

        for(int i=0;i<xs.length;i++)

        {
            if(xyz>=xs[i])

            {

               xd[i]=Math.floor(xyz/xs[i]);
                xyz=xyz-(xd[i]*xs[i]);

            }

        }

        for(int i=0;i<xs.length;i++)

        {

            if(xd[i]>0)

            {

                if(xs[i]>2)

                {

                   System.out.println("... "+xd[i]+" ..... de: "+xs[i]+" ----");

                }else{

                   System.out.println("... "+xd[i]+" ..... de: "+xs[i]+" ----");

                }

            }

        }

    }
	
	
																																																	double [] xs={500, 200, 100, 50, 20, 10, 5, 2, 1, 0.5, 0.20, 0.10, 0.05, 0.02, 0.01};

																																																	double [] xd={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};

}
