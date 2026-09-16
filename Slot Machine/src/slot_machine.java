import com.sun.security.jgss.GSSUtil;

import java.util.Random;
import java.util.Scanner;

public class slot_machine {
    public static void main(String[] args)
    {
        Scanner s1=  new Scanner(System.in);
        int bal=100;
        int bet;
        int payout;
        String[] row;
        System.out.println("*****************************");
        System.out.println("   Welcome to Slot Machine   ");
        System.out.println("   Symbols 🍒 🍉 🍋 🔔 ⭐   ");
        System.out.println("*****************************");
        while(bal>0)
        {
            System.out.println("Current Balance: "+bal);
            System.out.println("Enter Bet Amount: ");
            bet=s1.nextInt();
            s1.nextLine();
            if(bet>bal)
            {
                System.out.println("Insufficient amount");
                continue;
            }
            else if(bet<=0)
            {
                System.out.println("Bet must be greater than 0");
                continue;
            }
            else
            {
                bal-=bet;
            }
            System.out.println("Spinning");
            row=spinrow();
            display(row);
            payout=getpay(row,bet);
            if(payout==0) {
                System.out.println("You didn't win anything");
            }
            else {
                System.out.printf("You won %d $\n",payout);
                bal+=payout;
            }
            String ch;
            System.out.println("Do you wanna play again (Y/N): ");
            ch=s1.next().toUpperCase();
            if(!ch.equals("Y"))
            {
                break;
            }
        }
        s1.close();
    }
    static String[] spinrow() {
        String[] symbol={"🍒","🍉", "🍋", "🔔", "⭐"};
        String[] row =new String[3];
        Random r1=new Random();
        for(int i=0;i<3;i++)
        {
            row[i]=symbol[r1.nextInt(symbol.length)];
        }
        return row;
    }
    static void display(String[] row){
        System.out.println("***************");
        System.out.println(" " + String.join(" | ",row));
        System.out.println("***************");
    }
    static int getpay(String[] row,int bet){
        if(row[0].equals(row[1])&&row[1].equals(row[2])){
            switch(row[0])
            {
                case "🍒" ->{return bet*4;}
                case "🍉" -> {return bet*5;}
                case "🍋" -> {return bet*6;}
                case "🔔" -> {return bet*7;}
                case "⭐" -> {return bet*8;}
                default -> {return 0;}
            }
            } else if (row[0].equals(row[1])||row[1].equals(row[2])) {
            switch(row[1])
            {
                case "🍒" ->{return bet*2;}
                case "🍉" -> {return bet*3;}
                case "🍋" -> {return bet*4;}
                case "🔔" -> {return bet*5;}
                case "⭐" -> {return bet*6;}
                default -> {return 0;}
            }
        }
        return 0;
    }
}
