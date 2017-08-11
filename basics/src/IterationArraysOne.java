public class IterationArraysOne {

    static int[] arrayOfInts = {11, 2, 37, 24, 15, 46, 7, 84, 9, 10};

    public static void main(String[] args) {
        System.out.println("Result : " + twoInt(arrayOfInts[3], arrayOfInts[5]));
        arrayIteration();
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

    public static void arrayIteration() {
        for (int i = 0; i < arrayOfInts.length; i++) {
            System.out.println(arrayOfInts[i]);
        }
    }
}
