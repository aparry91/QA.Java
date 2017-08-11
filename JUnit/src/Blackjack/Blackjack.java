package Blackjack;

public class Blackjack {

    static int answer;
    public static void main(String[] args) {

        blackjack(21, 21);
    }


    public static int blackjack(int a, int b) {
        if (a < 22 && b < 22) {
            int sumA = 21 - a;
            int sumB = 21 - b;

            if (sumA < sumB) {
                int answer = a;
                System.out.println(answer);
                return a;
            } else if (sumA > sumB){
                int answer = b;
                System.out.println(answer);
                return b;
            } else {
                System.out.println("Its a tie!");
                int answer = 21;
                System.out.println(answer);
                return 21;

            }
        } if (a >= 22 && b < 22) {
            int answer = b;
            System.out.println(answer);
            return b;
        } else if (a < 22 && b >= 22) {
            int answer = a;
            System.out.println(answer);
            return a;
        } else if (a >= 22 && b >= 22) {
            System.out.println("Both busted.");
            int answer = 0;
            System.out.println(answer);
            return 0;
        }
        return answer;
    }

}