import java.io.File;
import java.io.IOException;

public class test5 {
    public static void main(String[] args) {
        File f = new File("d:\\abc.txt");
        f.createNewFile();

        // throws is an indication there is a need of
        // exceptionhandling here try/catch
    }
}
