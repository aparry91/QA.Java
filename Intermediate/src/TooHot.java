public class TooHot {

    public static void main(String[] args) {
        System.out.println("Current Temperature is: ");

        tooHot(91, true);
    }

    public static void tooHot(int currentTemp, boolean isSummer) {
        int minTemp = 60;
        int maxTemp;

        if (isSummer == true) {
            maxTemp = 100;
        } else {
            maxTemp = 90;
        }

        if (currentTemp <= maxTemp && currentTemp >= minTemp) {
            System.out.println("Today's temperature is within range");
        } else if (currentTemp > maxTemp) {
            System.out.println("It's too hot today.");
        } else {
            System.out.println("It's too cold today.");
        }
    }
}

