/*
SET:
primary us of set data structure us to eliminate the duplicate records
three types:-hashset, linkedhashset, treeset
hashset:- dont maintain the insertion order
linkedhashset:- maintains the insertion order
treeset:- arrange te elements in asc order
other benefit is searching is very fast with time complexity O(n)
methods- size,add(element e),remove(element e),contains(element e),
*/
import java.util.*;
public class Q {
    public static void  main(String [] args)
    {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter no of elements");
        int n=s1.nextInt();
        int num[]=new int[n];
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++)
            num[i]=s1.nextInt();
        System.out.println("Before "+Arrays.toString(num));
        num=removedup(num);
        System.out.println("After "+Arrays.toString(num));
    }
    static int[] removedup(int[] num)
    {
        LinkedHashSet<Integer>lh=new LinkedHashSet<>();
        for(int n: num)
            lh.add(n);
        int result[]=new int[lh.size()];
        int i=0;
        for(int n:lh)
            result[i++]=n;
        return result;
    }

}
//remove duplicates from ll using hashset