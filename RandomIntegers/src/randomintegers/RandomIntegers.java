
package randomintegers;
import java.security.SecureRandom;
/**
 *
 * @author ibrahim
 */
public class RandomIntegers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //RanodomNumbers object will create a secure random numbers
        SecureRandom randomNumbers = new SecureRandom();
        for (int i=1; i<=20; i++){
            //pick a random integer from 1 to 6
            int face = 1+randomNumbers.nextInt(6);
            System.out.printf("%d ",face);
            
            if(i%5 == 0){
                System.out.println("");
            }
        }
    }
    
}
