
package rolldie;
import java.security.SecureRandom;
/**
 *
 * @author ibrahim
 */
public class RollDie {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SecureRandom randomNumber = new SecureRandom();
        
        int frequancy1 = 0;
        int frequancy2 = 0;
        int frequancy3 = 0;
        int frequancy4 = 0;
        int frequancy5 = 0;
        int frequancy6 = 0;
        
        for (int roll = 1; roll <= 6000000; roll++){
            int face = 1+randomNumber.nextInt(6);
            switch(face){
                case 1: frequancy1++;   break;
                case 2: frequancy2++;   break;
                case 3: frequancy3++;   break;
                case 4: frequancy4++;   break;
                case 5: frequancy5++;   break;
                case 6: frequancy6++;   break;
            }
        }
        
        System.out.println("Face\tFrequancey");
        System.out.printf("1\t%d%n2\t%d%n3\t%d%n4\t%d%n5\t%d%n6\t%d%n",
                frequancy1,frequancy2,frequancy3,frequancy4,frequancy5,frequancy6);
        
    }

    
}
