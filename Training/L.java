import java.util.*;
public class L {
    public static void main(String[] args)
    {
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        pq.offer(5);
        pq.offer(3);
        pq.offer(8);
        pq.offer(2);
        pq.offer(4);
        System.out.println(pq);
        System.out.println("Deleting form pq");
        while(!pq.isEmpty())
        {
            System.out.print(pq.poll()+" ");
        }
    }
}
