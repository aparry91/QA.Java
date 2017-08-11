import java.util.ArrayList;

public class Garage {


    ArrayList<Vehicle> garageArray = new ArrayList<>();



    public void calcBill(ArrayList<Vehicle> garageArray) {

        for (Vehicle i : garageArray) {
            if (i instanceof Car) {
                System.out.println("Car - Repair cost is £150");
            }
            if (i instanceof Motorcycle) {
                System.out.println("Motorcycle - Repair cost is £75");
            }
            if (i instanceof Bus) {
                System.out.println("Bus - Repair cost is £300");
            }
        }
    }








    }

