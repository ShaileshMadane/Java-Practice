//give an array of int val and a target value accepted from user determine whether the sum of any 2 element
// is equal to the target value or not
import java.util.Scanner;
import java.util.Arrays;
import java.util.HashSet;
public class F {
    public static void main(String[] args)
    {
        Scanner s1=new Scanner(System.in);
        int num[]={10,9,-2,0,13,4,15};
        int target;
        System.out.println("Enter the target");
        target=s1.nextInt();
        System.out.println(Arrays.toString(num));
        boolean a=sumof(num,target);
        if(a)
            System.out.println("Target value is available ");
        else
            System.out.println("Target value is not available ");
        s1.close();
    }
    /*
    static boolean sumof(int num[], int target)
    not preferred as time complexity is too big 10^4

    {
        int a=0;//boolean use kr
        for(int i=0;i<num.length-1;i++)
        {
            for(int j=i+1;j<num.length;j++)
            {
                if(target==num[i]+num[j]) {
                  a++;//use boolean to save space complexity
                    System.out.println("Pair number "+i+" base:"+num[i]+" complement:"+num[j]);
                }
            }
        }
        if(a>0)
            return true;
        return false;
    }

    */
   /*
    second best ,cant find multiple pairs here
    but still time compexity is 0.2 as O(logn)+O(n)
    static boolean sumof(int num[],int target)
    {
        Arrays.sort(num);
        int i=0,j= num.length-1;
        while(i<j)
        {
            if(target==num[i]+num[j]){
                System.out.println("pair found base:"+num[i]+" " +
                        "complement:"+num[j]);
                return true;
            }
            else if(target>num[i]+num[j])
                i++;
            else
                j--;
        }
        return false;
    }

    */
    //best hashset used in actual leetcode, timecomplexity is 0.01 as O(n)
    static boolean sumof(int num[],int target) {
        HashSet<Integer>hs=new HashSet<>();
        for(int n: num)
        {
            int complement=target-n;
            if(hs.contains(complement)) {
                System.out.println("Pair found base:" + n + " complement:" + complement);
                return true;
            }
            hs.add(n);//as generic supports object type only and no is int not INTEGER so java uses auto boxing to convert basic to object
            //similarly auto unboxing can convert object to basic.
        }
        return false;
    }

}
