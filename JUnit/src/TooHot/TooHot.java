package TooHot;

public class TooHot {

    public static void main(String[] args) {
        tooHot(60, true);
    }

    public static boolean tooHot(int currentTemp, boolean isSummer) {
        int minTemp = 60;
        int maxTemp;

        if (isSummer == true) {
            maxTemp = 100;
        } else {
            maxTemp = 90;
        }

        if (currentTemp <= maxTemp && currentTemp >= minTemp) {
            System.out.println("Today's temperature is within range");
            return true;
        } else if (currentTemp > maxTemp) {
            System.out.println("It's too hot today.");
            return false;
        } else {
            System.out.println("It's too cold today.");
            return false;
        }

    }
}

