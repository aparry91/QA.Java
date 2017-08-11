public class Vehicle {

    private String make;
    private String type;
    private String colour;
    private int vehicleID;
    private boolean isBroken;



    public Vehicle(String make, String type, String colour, int vehicleID, boolean isBroken) {
        this.make = make;
        this.type = type;
        this.colour = colour;
        this.vehicleID = vehicleID;
        this.isBroken = isBroken;
    }


    //getters & setters

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getVehicleID() {
        return vehicleID;
    }

    public void setVehicleID(int vehicleID) {
        this.vehicleID = vehicleID;
    }

    public boolean isBroken() {
        return isBroken;
    }

    public void setBroken(boolean broken) {
        isBroken = broken;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                ", make='" + make + '\'' +
                ", colour='" + colour + '\'' +
                ", vehicleID='" + vehicleID + '\'' +
                ", isBroken=" + isBroken +
                '}';
    }
}

