/*
In the name of Allah, the Gracious, the Merciful
 */
package primenumbers;

/**
 *
 * @author ibrahim
 */
public class PrimeNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for(int i=2;i<10000;i++){
            isPrime(i);
            IsPrime(i);
        }
    }
    static boolean isPrime(int n){
        for(int i=2;i<=n/2;i++){
            if(n%i==0)
                return false;
        }
        System.out.printf("%-5d",n);
        return true;
    }
    static boolean IsPrime(int n){
        for(int i=2;i<=(int)Math.sqrt(n);i++){
            if(n%i==0)
                return false;
        }
        System.out.println(" "+n);
        return true;
    }
    
}
