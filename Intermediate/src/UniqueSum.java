public class UniqueSum {


    public static void main(String[] args) {
        System.out.println(methodOne(6,2,2));
    }

    public static int methodOne(int a, int b, int c) {
        if (a == b && a == c) {
            return 0;
        } else if (a == b) {
            return c;
        } else if (a == c) {
            return b;
        } else if (b == c) {
            return a;
        } else {
            return a + b + c;
        }
    }
}


