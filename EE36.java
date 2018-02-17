
public class EE36 {
	public static int DVCount(int N) {

        int testDivisor;
        int divisorCount=0;

        for (testDivisor = 1; testDivisor <= N; testDivisor++) {
            if ( N % testDivisor == 0 )
                divisorCount++;
        }
        return divisorCount;

    }


    public static void main (String[] args) {

         int N, divCountmax=1, divCount=1, index=0;

         int[] t;

         for(N=1;N<=10000;N++){

              divCount=DVCount(N);

              if (divCount>divCountmax){

                   divCountmax=divCount;

                   t[0]=N;

                   index=1;

              }

              else{

                    if (divCount==divCountmax){

                         t[index]=N;

                         index++;

             }

         }

         for(N=0;N<index;N++){

              System.out.println(t[N]);

         }

    }

    }
}
