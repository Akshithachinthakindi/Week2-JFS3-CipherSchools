import java.util.ArrayList;
import java.util.List;

public class test6 {
    public static void main(String[] args) {

        ArrayList cart0 = new ArrayList();

        List cart1 = new ArrayList();

        cart0.add("Apple");
        cart0.add(100);
        cart0.add('c');

        ArrayList<Integer> cart2 = new ArrayList<Integer>();
        cart2.add(100);
        cart2.add(200);
        cart2.add(300);
        // generic : it makes a class type safe
    }
}
