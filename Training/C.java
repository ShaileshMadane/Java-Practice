//given an array of integer write a method to reverse the sequence of element
import java.util.Arrays;
public class C {
    public static void main(String[] args)
    {
        int num[]={10,6,-8,17,25};
        System.out.println(Arrays.toString(num));
        reverse(num);
    }
    static void reverse(int num[])
    {
       for(int i=0,j=num.length-1;i<j;i++,j--)
        {
            int temp=num[i];
            num[i]=num[j];
            num[j]=temp;
        }
        System.out.println(Arrays.toString(num));
        /*for(int i=0;i< num.length/2;i++)
        {
            int temp=num[i];
            num[i]=num[num.length-i-1];
            num[num.length-i-1]=temp;
        }
        System.out.println(Arrays.toString(num));*/
    }
}



