//given an array of integers.determine the first second and third -largest element from the array
import java.util.Arrays; //util means package in java containing different utilities which contains class like its array and its function
public class B {
    public static void main(String[] args)
    {
        int num[]={10,9,13,5,11,4};
        System.out.println("given array is: "+Arrays.toString(num));
        int result[]=getfirstthreemax(num);
        System.out.println("First three max element are: "+Arrays.toString(result));
    }
    static int[] getfirstthreemax(int num[])
    {
        int m1,m2,m3;
        m1=m2=m3=Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++)
        {
            if(m1<num[i]) {
                m3=m2;
                m2=m1;
                m1 = num[i];
            }
            else if(m2<num[i])
            {
                m3=m2;
                m2=num[i];
            }
            else if(m3<num[i])
                m3=num[i];
        }
        int res[]={m1,m2,m3};
        return res;
    }
}

