/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distancebetweenpoints;

import java.util.Scanner;

/**
 *
 * @author ibrahim
 */
public class DistanceBetweenPoints {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Enter points x1 y1 x2 y2 :");
        double result;
        result = distance(new Scanner(System.in).nextDouble(),
                new Scanner(System.in).nextDouble(),
                new Scanner(System.in).nextDouble(),
                new Scanner(System.in).nextDouble());
        System.out.println("Distance is : " + result + " Unit.");
    }
    static double distance(double x1,double y1, double x2, double y2){
        double result = Math.sqrt(Math.pow(y2-y1, 2)+Math.pow(x2-x1, 2));
        return result;
    }
    
}
