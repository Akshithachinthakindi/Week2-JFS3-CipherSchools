public class SampleProgram {
    // this keyword
    int arg = 5;
    void myTest(int arg) {
        arg=arg;
    }
    public static void main(String[] args) {
        int arg = 10; // local variable
        SampleProgram obj = new SampleProgram(); // here we created an object
        obj.myTest(arg);
        System.out.println(obj.arg);
    }
}
