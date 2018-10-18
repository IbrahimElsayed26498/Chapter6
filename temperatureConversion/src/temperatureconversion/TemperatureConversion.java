/*
In the name of Allah, the Gracious, the merciful
6.22
 */
package temperatureconversion;

import java.util.Scanner;

/**
 *
 * @author ibrahim
 */
public class TemperatureConversion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Enter a temp in c : ");
        double temp = new Scanner(System.in).nextDouble();
        System.out.printf("the temp in f : %f%n",fehrenheit(temp));
        System.out.print("Enter a temp in f : ");
        temp = new Scanner(System.in).nextDouble();
        System.out.printf("the temp in c : %f%n",Celsius(temp));
    }
    static double Celsius(double f){
        return 5.0/9.0 * (f-32);
    }
    static double fehrenheit(double c){
        return 9.0/5.0 * c + 32 ;
    }
    
}
