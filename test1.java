public class test1 {
    int getNextNo(int n) {
        try{
            if(n==5) {
                return n+1;
            }
        }
        finally {
            System.out.println("This is important code");
        }
        return n-1;
    }
    public static void main(String[] args) {
        test1 obj = new test1();
        System.out.println(obj.getNextNo(5));
    }
}
// 19-21-22-4-5-6-7-8-12-13-14-8-22-23-exit.