import java.util.ArrayList;

public class Garage2 {

    ArrayList<Vehicle> listOfVehicles;

    public Garage2(ArrayList<Vehicle> listOfVehicles) {
        this.listOfVehicles = listOfVehicles;


    }

    public ArrayList<Vehicle> getListOfVehicles() {

        return listOfVehicles;
    }

    public void setListOfVehicles(ArrayList<Vehicle> listOfVehicles) {

        this.listOfVehicles = listOfVehicles;
    }

    public void calcBill(ArrayList<Vehicle> garageArray) {

        int runningTotal = 0;

        for (Vehicle i : garageArray) {
            if (i instanceof Car) {
                System.out.println("Car - Repair cost is £150");
                runningTotal += 150;
            }
            if (i instanceof Motorcycle) {
                System.out.println("Motorcycle - Repair cost is £75");
                runningTotal += 75;
            }
            if (i instanceof Bus) {
                System.out.println("Bus - Repair cost is £300");
                runningTotal += 300;
            }
        }
        System.out.println("Total Cost is : £" + runningTotal + ".00");
    }

    public void clearGarage (){
        listOfVehicles.clear();
    }

    public void addVehicle (Vehicle vehicle) {
        listOfVehicles.add(vehicle);
    }

    public void fixVehicle (int vehicleID){
            for (Vehicle i : listOfVehicles) {
                    if (i.getVehicleID() == vehicleID){
                        i.setBroken(false);
                }
            }

        }


    public void removeVehicle (int vehicleID) {
        ArrayList<Vehicle> v1 = new ArrayList<>();
        for (Vehicle i : listOfVehicles) {
            if(i.getVehicleID() == vehicleID) {
                v1.add(i);
            }
        }

        listOfVehicles.removeAll(v1);

    }

    public void removeVehicle (String type) {
        ArrayList<Vehicle> v1 = new ArrayList<>();
        for (Vehicle i : listOfVehicles) {
            if(i.getType() == type) {
                v1.add(i);
            }
        }

        listOfVehicles.removeAll(v1);

    }







    public static void main(String[] args) {


        ArrayList<Vehicle> garageArray = new ArrayList<>();

        Car c1 = new Car("Jaguar", "Car", "Silver", 1, true, 5);
        Car c2 = new Car("Corsa", "Car", "Red", 2, true, 5);
        Car c3 = new Car("Jaguar", "Car", "Silver", 3, true, 5);
        Bus b1 = new Bus("Arriva", "Bus", "Green", 4, false, true);
        Bus b2 = new Bus("Arriva", "Bus", "Red", 5, true, false);
        Bus b3 = new Bus("EYMS", "Bus", "Yellow", 6, true, true);
        Motorcycle m1 = new Motorcycle("Honda", "Motorcycle", "Red", 7, false, false);
        Motorcycle m2 = new Motorcycle("Suzuki", "Motorcycle", "Blue", 8, true, false);
        Motorcycle m3 = new Motorcycle("Harley-Davidson", "Motorcycle", "Black", 9, true, true);


        garageArray.add(c1);
        garageArray.add(c2);
        garageArray.add(c3);
        garageArray.add(b1);
        garageArray.add(b2);
        garageArray.add(b3);
        garageArray.add(m1);
        garageArray.add(m2);
        garageArray.add(m3);

        Garage2 g = new Garage2(garageArray);
        g.calcBill(garageArray);
        g.fixVehicle(5);
        System.out.println(garageArray);
        g.removeVehicle("Car");
        System.out.println(garageArray);
        g.clearGarage();
        System.out.println(garageArray);





    }
}
