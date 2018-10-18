/*
In the name of Allah, the Gracious, the Merciful
 */
package geussthenumber;

import java.security.SecureRandom;
import java.util.Scanner;

/**
 *
 * @author ibrahim
 */
public class GeussTheNumber {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        int numberOfGeusses = 0;
        int correctAnswer = 0;
        char ch = 'y';
        int correct = new SecureRandom().nextInt(1000)+1;
        while(ch=='y'){
            System.out.print("Geuss a number between 1 to 1000 : ");
            int geussed = new Scanner(System.in).nextInt();
            if(geussed == correct){
                correctAnswer++;
                System.out.println("Congratulations. You guessed the number !!");
                if(numberOfGeusses<=10)
                    System.out.println("Either you know the secret or you got lucky !");
                else if(numberOfGeusses==10)
                    System.out.println("Aha! You know the secret!");
                else 
                    System.out.println("You should be able to do better!");
                System.out.print("Do you want to continue ? (y,n) : ");
                ch = new Scanner(System.in).next().charAt(0);
            }
            else if(geussed > correct){
                System.out.println("Too High. Try again");
                //System.out.println("Number : "+correct);
                System.out.println("Number of correct Answers : "+correctAnswer);
            }
            else{;
                System.out.println("Too Low. Try again");
                //System.out.println("Number : "+correct);
                System.out.println("Number of correct Answers : "+correctAnswer);
            }
            numberOfGeusses++;
        }
    }
    
}
