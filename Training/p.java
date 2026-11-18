//given a LL of names of students.Create another LL using names of student at ODD positions followed by names
//of student at even positions
//eg ll- "manish->suresh->amit->beena->supriya->priya->mitali->krishna
// ll1: suresh->beena->priya->krishna->manish->amit->supriya->mitali
import java.util.*;
public class p {
    public static void main(String[] args)
    {
        LinkedList<String>ll1=new LinkedList<>();
        ll1.add("Manish");
        ll1.add("suresh");
        ll1.add("amit");
        ll1.add("beena");
        ll1.add("supriya");
        ll1.add("priya");
        ll1.add("mitali");
        ll1.add("krishna");
        System.out.println("Before: "+ll1);
        ll1=reaarange(ll1);
        System.out.println("After: "+ll1);
    }
    static LinkedList<String> reaarange(LinkedList<String>ll) {
        LinkedList<String> llo = new LinkedList<>();
        LinkedList<String> lle = new LinkedList<>();
        for (int i = 0; i < ll.size(); i++) {
            if (i % 2 != 0) {
                llo.add(ll.get(i));
                continue;
            }
            lle.add(ll.get(i));
        }
        llo.addAll(llo.size(),lle);
        return llo;
    }

}

