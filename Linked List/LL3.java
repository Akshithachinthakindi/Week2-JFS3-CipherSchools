import java.util.ArrayList;
import java.util.Scanner;

public class LL3 {
    
    //Task: write a program that accepts groceryitems
    // from user (5 items)
    // make sure no duplicates are added
    // display the products

    // arrayList or LinkedList

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList mylist = new ArrayList();

        for (int i=1; i<=5; i++) {
            String item = sc.next();

            if(mylist.contains(item)) {
                continue;
            }
            mylist.add(item);
        }
        System.out.println(mylist);
    }
}
