public class Iteration {

    public static void main(String[] args) {
        forLoop();
    }

    public static int twoInt(int a, int b) {
            if (a == 0) {
                return b;
            } else if (b == 0) {
                return a;
            } else {
                return a + b;
            }
    }
    public static void forLoop () {
        for (int i = 0; i < 10; i++){
            System.out.println(twoInt(3,3));
        }


    }
}
