
public class Array {

    static int[] arrayOfInts = {11,2,37,24,15,46,7,84,9,10};

    public static void main(String[] args) {
        System.out.print(twoInt(arrayOfInts[3],arrayOfInts[5]));
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



