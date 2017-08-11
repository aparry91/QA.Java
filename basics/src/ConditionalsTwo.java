public class ConditionalsTwo {

    public static void main(String[] args) {
        System.out.print(twoInt(3, 3));
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
}
