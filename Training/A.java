//Given an array of integer.Determine the minimum element from given array
public class A {
    public static void main(String[] args)
    {
        int num[]={10,0,-6,17,7,20};
        System.out.println("Numbers are:");
        for(int i=0;i<num.length;i++)
            System.out.print(num[i]+" ");
        int min=getminelement(num);
        System.out.println("\nMinimum element in array is: "+min);
    }
    static int getminelement(int num[])
    {
        int min= Integer.MAX_VALUE;//2^31-1 ie 2147483647,taking it as benchmark
        for(int i=0;i<num.length;i++)
        {
            if(num[i]<min)
                min=num[i];
        }
        return min;

    }
}
