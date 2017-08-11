
public class IterationArraysTwo {

    static int[] arrayOfInts = new int[10];

    public static void main(String[] args) {
        arrayIteration();
        System.out.println("\n\nNow, multiplied by 10.\n");
        arrayIterationTwo();
    }


    public static void arrayIteration() {
        for (int i = 0; i < arrayOfInts.length; i++) {
            arrayOfInts[i] = i;
            System.out.print(arrayOfInts[i] + ",");
        }
    }

    public static void arrayIterationTwo() {
        for (int i = 0; i < arrayOfInts.length; i++) {
            arrayOfInts[i] = i * 10;
            System.out.print(arrayOfInts[i] + ",");
        }
    }
}
