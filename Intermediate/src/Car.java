public class Car extends Vehicle {

    private int door;

    public Car(String make, String type, String colour, int vehicleID, boolean isBroken, int door) {
        super(make, type, colour, vehicleID, isBroken);
        this.door = door;
    }

    public int getDoor() {
        return door;
    }

    public void setDoor(int door) {
        this.door = door;
    }
    }

