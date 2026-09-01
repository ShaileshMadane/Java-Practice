import java.util.Scanner;
public class BankingProgram {
    static Scanner s1=new Scanner(System.in);
    public static void main(String[] args)
    {
        double balance=0;
        boolean isRunning=true;
        while(isRunning)
        {
            System.out.println("What do you want to do: ");
            System.out.println("1.Show current balance");
            System.out.println("2.Add Amount");
            System.out.println("3.Withdraw");
            System.out.println("4.Exit");
            int ch;
            ch=s1.nextInt();
            switch(ch)
            {
                case 1->showbalance(balance);
                case 2-> balance=add(balance);
                case 3-> balance=sub(balance);
                case 4-> {
                    System.out.println("You are exiting the banking program");
                    isRunning=false;
                }
                default -> System.out.println("Enter Valid choice");
            }
        }
        s1.close();

    }
    static void showbalance(double balance)
    {
        System.out.printf("Your Current balance is $ %.2f \n",balance);
    }
    static double add(double balance) {
        double a;
        System.out.println("Enter Amount to add: ");
        a= s1.nextDouble();
        if(a<0)
            System.out.println("Invalid Amount");
        else {
            balance += a;
            System.out.println("Amount added successfully");
        }
        return balance;
    }
    static double sub(double balance) {
        double a;
        System.out.println("Enter Amount to withdraw: ");
        a= s1.nextDouble();
        if(a>balance)
            System.out.println("Not enough balance");
        else if(a<0)
            System.out.println("Invalid Amount");
        else {
            balance -= a;
            System.out.println("Amount withdrawn successfully");
        }
        return balance;
    }
}
