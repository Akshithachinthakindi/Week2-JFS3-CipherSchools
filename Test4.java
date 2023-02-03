import java.util.Scanner;

public class Test4 {
    int n1, n2, result;
    Scanner sc = new Scanner(System.in);

    void calculate() {

        try {

        System.out.println("Enter first num: ");
        n1=sc.nextInt();

        System.out.println("Enter second num: ");

        result = n1/n2;
        }
        catch(Exception e) {
            System.out.println("Ouch! Exception Detected.");
        }
        catch(ArithmeticException ae) {
            System.out.println("AE Detected");
        }
        catch(Exception e) {
            System.out.println("Ouch! Exception Detected! " + e.getMessage());
            e.printStackTrace();
        }
        finally {
    System.out.println("The Division is: " + result);
    }
}
    public static void main(String[] args) {
        Test4 obj = new Test4();
        obj.calculate();
    }
}
// try : represents/contains code that we think has probabilty to generate/throw error at Runtime(exception).
// catch : executes only if any error/exception occurs in try block. if there is no exception it will not execute.
