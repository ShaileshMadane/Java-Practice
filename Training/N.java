//determine the kth smallest element from given array of integer without sorting the array
import java.util.*;
public class N {
    static Scanner s1=new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("Enter the what smallest element you want");
        int k=s1.nextInt();
        klement(k);
    }
    static void klement(int k)
    {
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
        System.out.println("Start entering the elements one by one(Enter stop if no more number to be enter): ");
        while(s1.hasNextInt()) {
            int a=s1.nextInt();
            pq.offer(a);
            if(pq.size()>k)
                pq.poll();
        }
        System.out.println(k+" smallest element is: "+pq.peek());
    }
}
