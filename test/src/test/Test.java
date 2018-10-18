//In the name of Allah, the Gracious, the Merciful
package test;

import java.security.SecureRandom;

/**
 *
 * @author ibrahim
 */
public class Test {

    static void tester (int x){
        System.out.println("x="+x);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for(int i=0 ; i<10 ; i++)
            System.out.println(new SecureRandom().nextInt(5)*2 + 2);
    }
    
    
}
