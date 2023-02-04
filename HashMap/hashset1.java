import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class hashset1 {
    public static void main(String[] args) {
        
        // HASH SET

        HashSet  myset = new HashSet();

        myset.add("purple");
        myset.add("pink");
        myset.add("blue");
        myset.add("orange");
        myset.add("purple");
        myset.add("white");

        System.out.println(myset);

        // output: [orange, pink, blue, white, purple]

        // hashset doesn't follow order
        // it automatically ignores the duplicates
        // as we can see purple repeated 2 times but only 1 ime it got printed.

        // LinkedHashSet
        // we use this just to maintain the order of insertion

        LinkedHashSet newset = new LinkedHashSet();

        newset.add("purple");
        newset.add("pink");
        newset.add("blue");
        newset.add("purple");
        newset.add("white");
        newset.add("pink");

        System.out.println(newset);

        // output: [purple, pink, blue, white]
        // here it followed the order of insertion
        // and also ignored the duplicates and printed everything 1 time.


        // TREE SET

        TreeSet ts = new TreeSet();

        ts.add("beautiful");
        ts.add("chinthakindi");
        ts.add("akshitha");

        System.out.println(ts);

        // output: [akshitha, beautiful, chinthakindi]
        // tree set doesn't allows null values
        // tree set sorts the data in ascending order
    }
}