//Manolo's Software Enterprise  29.08.22
package bobbischallenge;

import java.util.*;

public class BobbisChallenge {

    public static void main(String[] args) {
    
    int num;
    Scanner reader = new Scanner(System.in);
    System.out.println("Welcome to guess the number :P \n You've 8 attempts to guess the number between 1 - 100");
    int rndNumber = (int) (Math.random() * 100);
    
    //Ciclo
        for(int i = 1; i <= 8; i++)
        {
            System.out.println("Attempt number: " + i + "  Input your number: ");   
            num = reader.nextInt();

            if(num == rndNumber)        {System.out.println("Got it!!! The number was guessed in  " + i + " attempts");  return;}
            if(num < 1 || num > 100)    {System.out.println("The entered number is out of the range, remember the range is between 0 - 100");}
            else if(num < rndNumber)         {System.out.println("The entered number is less than the goal");}
            else if(num > rndNumber)         {System.out.println("The entered number is greater than the goal");}
        }
        System.out.println("Sorry, no left attempts the number was: " + rndNumber);
    }
    
}
