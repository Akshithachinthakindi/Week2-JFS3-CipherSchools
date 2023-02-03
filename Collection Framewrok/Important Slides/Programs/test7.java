import java.util.ArrayList;
import java.util.List;

public class test7 {
    public static void main(String[] args) {
        ArrayList<String> states = new ArrayList<String>();
        states.add("Telangana");
        states.add("Karnataka");
        states.add("Tamil Nadu");
        states.add("Kerala");
        states.add("Andhra Pradesh");
        System.out.println("ArrayList is: " + states);

        // Accessing elements using .get() method

        String s = states.get(2);

        System.out.println("I got: " + s);

        // write a loop for this

    //     System.out.println("ArrayList size: "+states.size());

    //     for (int i = 0; i<states.size(); i++) {
    //         System.out.println(states.get(i));
    //     }

    // update elements using .set() method
    states.set(2, "Texas");
    System.out.println("After Updation: "+states);
    
    // Removing elements using .remove() method
    }
}
