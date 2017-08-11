public class ConditionalsOne {

    public static void main (String [] args){
        System.out.print(twoInt(2,3,false));
    }

    public static int twoInt(int a, int b, boolean c) {
        if (c == true) {
            return a+b;
        } else {
            return a*b;
        }
}

}
