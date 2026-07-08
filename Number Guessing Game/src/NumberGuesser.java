package src;

import java.util.Scanner;
import java.util.Random;
public class NumberGuesser
{
    public static void main(String[] args)
    {
        Scanner s1=new Scanner(System.in);
        Random r1=new Random();
        int num= r1.nextInt(1,100);
        int attempts=1;
        int SecretNumber;
        System.out.println("Welcome To Number Guess Game");
        System.out.print("Try your guess by picking number between 1 to 100: ");
        SecretNumber =s1.nextInt();
        do
        {
            attempts++;
            if(SecretNumber <num)
            {
                System.out.println("Try Higher Number");
                System.out.print("Try your guess by picking number between "+ SecretNumber +" and higher: ");
                SecretNumber =s1.nextInt();
            }
            else if(SecretNumber >num)
            {
                System.out.println("Try Lower Number");
                System.out.print("Try your guess by picking number between "+ SecretNumber +" and lower: ");
                SecretNumber =s1.nextInt();
            }
            else
            {
                System.out.println("Congratulation!!!!");
            }
        }while(SecretNumber !=num);
        System.out.println("Secret Number was: "+ SecretNumber);
        System.out.println("You have guess the number in "+attempts+" attempts");
        s1.close();
    }
}
