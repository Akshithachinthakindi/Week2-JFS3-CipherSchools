import java.io.File;

public class errorHandling {
    public static void main(String[] args) {
        // CHECK EXCEPTION
        try {
        File f = new File("d:\\abc.txt");

        f.createNewFile();
        } catch(Exception e) {} // this is called checked excpetion
    }
}
