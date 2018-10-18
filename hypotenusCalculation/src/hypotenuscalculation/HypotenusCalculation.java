/*
In the name of Allah, the Fracious, the Merciful
6.15
 */
package hypotenuscalculation;

import java.util.Scanner;

/**
 *
 * @author ibrahim
 */
public class HypotenusCalculation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Enter side1 : ");
        double s1 = new Scanner(System.in).nextDouble();
        System.out.print("Enter side2 : ");
        double s2 = new Scanner(System.in).nextDouble();
        System.out.println("the Hypotenus is : "+hypotenus(s1, s2));
    }
    static double hypotenus(double side1, double side2){
        double hyp;
        hyp = Math.sqrt(Math.pow(side1,2)+Math.pow(side2,2));
        return hyp;
    }
}
