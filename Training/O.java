//given a linked list of integers accepted from user rotate the linked list from right to lft
import  java.util.*;
public class O {
    public static void main(String[] args)
    {
        LinkedList<Integer>ll=new LinkedList<>();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.add(50);
        Scanner s1=new Scanner(System.in);
        System.out.println(ll);
        System.out.println("Enter number of rotation: ");
        int r=s1.nextInt();
        ll=rotatell(ll,r);
        System.out.println("ll after rotation "+ll);
    }
    static LinkedList<Integer>rotatell(LinkedList<Integer>ll,int r)
    {
        r=r%ll.size();
        System.out.println("actual rotation "+r);
        for(int i=0;i<r;i++)
        {
            ll.addFirst(ll.getLast());
            ll.removeLast();
        }
        return ll;
    }
}
