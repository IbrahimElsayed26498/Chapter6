
import java.util.Scanner;

/*
In the name of Allah, the Gracious, the Merciful
package findthemin;

/**
 *
 * @author ibrahim
 */
public class FindTheMin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Enter 3 numbers : ");
        System.out.printf("the min number is : %d%n",
                findMin(new Scanner(System.in).nextInt(),
                        new Scanner(System.in).nextInt(), 
                        new Scanner(System.in).nextInt()));
    }
    static int findMin(int a, int b, int c){
        return Math.min(a, Math.min(c, b));
    }
}
