//determine the kth largest element from given array of integer without sorting the array
import java.util.*;
public class M {
    static Scanner s1=new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("Enter the what largest element you want");
        int k=s1.nextInt();
        klement(k);
    }
    static void klement(int k)
    {
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        System.out.println("Start entering the elements one by one(Enter stop if no more number to be enter): ");
        while(s1.hasNextInt()) {
            int a=s1.nextInt();
            pq.offer(a);
            if(pq.size()>k)
                pq.poll();
        }
        System.out.println(k+" largest element is: "+pq.peek());
    }
}
