//given an array of integers. find the maximum sum of a sub array with given length
//sub array is a continuos part of an array whereas a sub sequence is part of array with 0 or more
//no of missing elements from original array but relative order of elements maintained
import java.util.Arrays;
import java.util.Scanner;
public class G {
    public static void main(String[] args)
    {
        Scanner s1=new Scanner(System.in);
        int num[]={4,0,10,-2,8,3,10,7,6,2};
        System.out.println(Arrays.toString(num));
        int w;
        System.out.println("Enter Sliding window size");
        w=s1.nextInt();
        System.out.println("Max sum of num[] with size "+w+" is: "+maxsum(num,w));
        s1.close();
    }
    static int maxsum(int num[], int w)
    {
        int max;
        int sum=0;
        for(int i=0;i<w;i++)
            sum+=num[i];
        max=sum;
        for(int i=1;i<= num.length-w;i++)
        {
            sum=sum-num[i-1]+num[i+w-1];
            if(max<sum)
                max=sum;
        }
        return max;
    }
}