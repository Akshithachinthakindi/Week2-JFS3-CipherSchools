public class SampleProgram {
    // this keyword
    int arg = 5;
    SampleProgram() {
        System.out.println("Hi ! I am default constructor");
    }
    SampleProgram(int arg) {
        this();
        this.arg=arg;
    }
    public static void main(String[] args) {
        int arg = 10; // local variable
        SampleProgram obj = new SampleProgram(10); // here we created an object
        //obj.myTest(arg);
        System.out.println(obj.arg);
    }
}