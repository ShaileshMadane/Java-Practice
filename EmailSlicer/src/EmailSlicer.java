import java.util.Scanner;
public class EmailSlicer {
    public static void main(String[] args)
    {
        Scanner s1=new Scanner(System.in);
        String email;
        String uname,domain;
        System.out.println("Enter Your Email: ");
        email=s1.nextLine();
        if(email.contains("@"))
        {
            uname=email.substring(0,email.indexOf("@"));
            domain=email.substring(email.indexOf("@")+1);
            System.out.println("Username: "+uname);
            System.out.println("Domain: "+domain);
        }
        else
            System.out.println("Invalid Email");
        s1.close();
    }
}
