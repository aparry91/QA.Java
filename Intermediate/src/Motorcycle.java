public class Motorcycle extends Vehicle {

    private boolean sideCar;


    public Motorcycle(String make, String type, String colour, int vehicleID, boolean isBroken, boolean sideCar) {
        super(make, type, colour, vehicleID, isBroken);
        this.sideCar = sideCar;
    }

    public boolean isSideCar() {
        return sideCar;
    }

    public void setSideCar(boolean sideCar) {
        this.sideCar = sideCar;
    }
}
