/*
In the name of Allah, the Gracious, the Merciful
 */
package qualifyavarage;

import java.util.Scanner;

/**
 *
 * @author ibrahim
 */
public class QualifyAvarage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Enter average : ");
        int avg = qualityPoints(new Scanner(System.in).nextInt());
        if(avg == -1 )
            System.out.println("Wrong Average !!");
        else
            System.out.println(avg);
    }
    static int qualityPoints(int avg){
        if(avg>=90 && avg<=100)
            return 4;
        else if (avg>=80 && avg<90)
            return 3;
        else if (avg>=70 && avg<80)
            return 2;
        else if (avg>=60 && avg<70)
            return 1;
        else if(avg>=0 && avg<60)
            return 0;
        else 
            return -1;
    }
    
}
