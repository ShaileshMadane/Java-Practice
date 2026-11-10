// given an array of string determine whether the concatenation of any 2 string from this array resul in
// palindrome or not={and,mad,eet,am,xyz} yes madam
// {in,par,abc,nit,yre} yes nitin
import java.util.Scanner;
public class I {
    public static void main(String[] args){
    String a[]={"and","mad","eet","am","xyz"};
    String b[]={"in","par","abc","nit","yre"};
        System.out.println("is it palindrome ?"+check(a));
        System.out.println("is it palindrome ?"+check(b));
    }
    static boolean check(String[] a)
    {
        for(int i=0;i<a.length-1;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(i==j)
                    continue;
                if(pal(a[i]+a[j])) {
                    System.out.println("A: "+a[i]+"\nB: "+a[j]+"\npalindorme: "+(a[i]+a[j]));
                    return true;
                }
                if(pal(a[j]+a[i])) {
                    System.out.println("A: "+a[j]+"\nB: "+a[i]+"\npalindorme: "+(a[j]+a[i]));
                    return true;
                }
            }
        }
        return false;
    }
    static boolean pal(String a)
    {
        int i=0;
        int j=a.length()-1;
        while(i<j)
        {
            if(a.charAt(i)!=a.charAt(j))
                return false;

            i++;
            j--;
        }
        return true;
    }
}

