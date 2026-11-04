//given array of pos single digit. write a method to increment or add one to  the last digit of array and display
//1,2,3->1,2,4; 5,3,6,9->5,3,7,0; 9,9,9->1,0,0,0
import java.util.Arrays;
public class D {
    public static void main(String[] args)
    {
        int num[]={9,9,9};
        System.out.println(Arrays.toString(num));
        num=add1(num);
        System.out.println("after adding 1 , num is "+Arrays.toString(num));
    }
    static int[]  add1(int num[])
    {
        for(int i= num.length-1;i>=0;i--)
        {
            if(num[i]!=9) {
                num[i]++;
                return num;
            }
            num[i]=0;
        }
        int res[]=new int[num.length+1];
        res[0]=1;
        return res;

    }
}
