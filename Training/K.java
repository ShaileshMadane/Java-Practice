//accept an expression consisting of parenthesis only and determine whether it is valid or not
//ip{} op true, ip( op false
import java.util.Stack;
import java.util.Scanner;
public class K {
    public static void main(String[] args)
    {
        Scanner s1=new Scanner(System.in);
        String par;
        System.out.println("Enter the expression: ");
        par=s1.next();
        System.out.println(par);
        System.out.println("Is this valid?"+check(par));
        s1.close();
    }
    static boolean check(String par)
    {
        Stack<Character>s=new Stack<>();
        for(int i=0;i<par.length();i++)
        {
            char ch1=par.charAt(i);
            if(ch1=='{' || ch1=='('|| ch1=='[')
                s.push(ch1);
            else
            {
                if(s.isEmpty())
                    return false;
                char ch2=s.pop();
                if((ch1=='}' && ch2!='{')||(ch1==')' && ch2!='(')||(ch1==']' && ch2!='['))
                    return false;
            }
        }
        if(!s.isEmpty())
            return false;
        return true;

    }
}
