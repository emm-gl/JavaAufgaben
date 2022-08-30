//Manolo's Software Enterprise  29.08.22
package bobbischallenge;

import java.util.*;

public class BobbisChallenge {

    public static void main(String[] args) {
        // TODO code application logic here
    
    int num;
    Scanner reader = new Scanner(System.in);
    System.out.println("Welcome to guest the number :P /n You've 8 attempts to guess the number between 1 -100");
    int rndNumber = (int) (Math.random() * 100);
    
    //Ciclo
        for(int i = 1; i <= 8; i++)
        {
            System.out.println("Intento número: " + i + "  Ingrese su numero: ");   //"Input the Sphere's radius: ");
            num = reader.nextInt();

            if(num == rndNumber)        {System.out.println("Adivino el numero correcto en " + i + " intento(s), se ha ganado un beso de Tzeigou");  return;}
            if(num < 1 || num > 100)    {System.out.println("El numero ingresado está fuera del rango, intentelo otra vez");}
            else if(num < rndNumber)         {System.out.println("El numero ingresado es menor que el número secreto, intentelo otra vez");}
            else if(num > rndNumber)         {System.out.println("El numero ingresado es mayor que el número secreto, intentelo otra vez");}
        }
        System.out.println("Lo siento no lo logró en los minimos intentos, gracias por nada :P");
    }
    
}
