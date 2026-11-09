//accept 2 string from user and determine wheteher 1 string is sub string of another string,
import java.util.Scanner;
public class H {
    public static void main(String[] args)
    {
        String s2,s3;
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter two strings");
        s2=s1.next();
        s3=s1.next();
        System.out.println("is it a subsequence ?"+checkstring(s2,s3));
    }
    static boolean checkstring(String a,String b)
    {
        int i=0;
        int j=0;
        while(i<a.length() && j<b.length())
        {
            if(a.charAt(i)==(b.charAt(j)))
                j++;
            i++;
        }
        if(b.length()==j)
            return true;
        return false;
    }
}
