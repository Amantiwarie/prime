import java.util.Scanner;
public class isprime{

    public static boolean issprime(int n){
        if (n<=1)
            return false;

        for (int i =2;i<=Math.sqrt(n);i++){
            if (n%i==0)
                return false ;
        }
            
                return true;

        }
        public static void printprimes(int a,int b){

            while(a<b){
                if  (issprime(a))
                  System.out.println(+a  );
                  a++;
                
              }
            }

        public static int sd(int x){
        int abc =0;
        while (x>0){
             abc +=x%10;
             x = x/10;

        }
        return abc;
        }
        
      

public static void main (String[] args) {
    int a=2;
    int b =10;
    int sumo=0;
    System.out.println("primes in the range are ");
    printprimes(a, b);
    for (int i =a;i<b;i++){
        if (issprime(i)){
            sumo += sd(i);
           
        }
    }


   
        System.out.println("sum of the digits of primes in range are " +sumo );
    

   
}
}