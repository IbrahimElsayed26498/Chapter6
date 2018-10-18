/*
In the name o fAllah, the Gracious, the Merciful
 */
package perfectnumbers;

/**
 *
 * @author ibrahim
 */
public class PerfectNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean n;
        for(int i=1;i<=1000000;i++){
            n = isPerfect(i);
            if(n)
                System.out.println(i);
        }
    }
    static boolean isPerfect(int n){
        int sum = 0;
        for(int i=n;i>=1;i--){
            if(n%i==0)
                sum+=i;
        }
        if(sum/2 ==n){
            
            return true;}
        else{
            
            return false;}
    }
}
