import java.util.Scanner;

public class test0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hey Buddy how old r u ? ");
        int age = sc.nextInt();
        System.out.println("Woah ! You have really grown up. you are " + age + " years old");
    }
}
// checked exceptions are checked at compile time eg. IOexception
// Unchecked exceptions are checked at runtime. eg. InputMisMatchException.

