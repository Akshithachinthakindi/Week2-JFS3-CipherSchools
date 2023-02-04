import java.util.LinkedList;

public class LinkedList2 {
    public static void main(String[] args) {
        LinkedList myll = new LinkedList();

        myll.push("Ironman");
        myll.push("Thor");
        myll.push("Thanos");

        System.out.println(myll.pop());

        //if we want the output in stack like structure
        // instead of using '.add()' use '.push()'
    }
}
