import java.util.LinkedList;
import java.util.Iterator;

public class LinkedList1 {
    public static void main(String[] args) {
        
        // LINKED LIST (COLLECTION FRAMEWORK)

        LinkedList myll = new LinkedList();

        myll.add("Ironman");
        myll.add("Thor");
        myll.add("Hulk");
        myll.add("Loki");

        // System.out.println(myll.get(3));
        myll.add("Gamora");
        myll.add("Antman");
        myll.add(2, "Akshitha");

        Iterator it = myll.iterator();

        while (it.hasNext()) {
            // it.remove();
            System.out.println(it.next());
        }
        System.out.println("------------------------------");
        System.out.println("Who's at the top : " + myll.peek());
        System.out.println("Hey first one get out !" + myll.poll());

        System.out.println("Who's standing at the last ?" + myll.pop());
        System.out.println("------------------------------");

        it = myll.iterator();

        while (it.hasNext()) {
            // it.remove();
            System.out.println(it.next());
        }
    }
}
