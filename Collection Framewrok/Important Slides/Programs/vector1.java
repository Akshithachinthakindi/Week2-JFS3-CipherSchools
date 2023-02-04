import java.util.Iterator;
import java.util.Vector;

public class vector1 {
    public static void main(String[] args) {
        Vector vec = new Vector(); // created a new obj

        vec.add("Telangana");
        vec.add("Karnataka");
        vec.add("Andhra Pradesh");

        //System.out.println("My Favourite States are: "+vec);

        //******ITERATORS******

        //Iterator is another convinient method to access classes.
        // In ArrayList we used for loop and here in vectors we are using iterators

        Iterator pointer = vec.iterator();

        while(pointer.hasNext()) { // hasNext returns true if it has any next value element to run
            System.out.println(pointer.next());
        }
    }
}