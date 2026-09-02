import java.util.Random;
import java.util.Scanner;

public class diceroller {
    public static void main(String [] args)
    {
        Scanner s1= new Scanner(System.in);
        Random r1=new Random();
        int dicenum;
        int total=0;
        System.out.println("Enter the number of time you want dice to roll: ");
        dicenum=s1.nextInt();
        if(dicenum>0)
        {
            for(int i=0;i<dicenum;i++)
            {
                int roll=r1.nextInt(1,7);
                printdie(roll);
                System.out.printf("Dice rolled %d \n\n",roll);
                total+=roll;
            }
            System.out.println("Total Sum of dice is: "+total);
        }
        else {
            System.out.println("Number of dice must be greater than 0");
        }
        s1.close();
    }
    static void printdie(int roll)
    {
        String dice1= """
                 -------
                |       |
                |   ●   |
                |       |
                 -------
                """ ;
        String dice2= """
                 -------
                | ●     |
                |       |
                |     ● |
                 -------
                """ ;
        String dice3= """
                 -------
                | ●     |
                |   ●   |
                |     ● |
                 -------
                """ ;
        String dice4= """
                 -------
                | ●   ● |
                |       |
                | ●   ● |
                 -------
                """ ;
        String dice5= """
                 -------
                | ●   ● |
                |   ●   |
                | ●   ● |
                 -------
                """ ;
        String dice6= """
                 -------
                | ●   ● |
                | ●   ● |
                | ●   ● |
                 -------
                """ ;
        switch (roll)
        {
            case 1-> System.out.print(dice1);
            case 2-> System.out.print(dice2);
            case 3-> System.out.print(dice3);
            case 4-> System.out.print(dice4);
            case 5-> System.out.print(dice5);
            case 6-> System.out.print(dice6);
            default -> System.out.print("Invalid Statement");
        }
    }
}
