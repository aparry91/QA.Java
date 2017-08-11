
public class Bus extends Vehicle{

    private boolean doubleDecker;

    public Bus(String make, String type, String colour, int vehicleID, boolean isBroken, boolean doubleDecker) {
        super(make, type, colour, vehicleID, isBroken);
        this.doubleDecker = doubleDecker;
    }

    public boolean isDoubleDecker() {
        return doubleDecker;
    }

    public void setDoubleDecker(boolean doubleDecker) {
        this.doubleDecker = doubleDecker;
    }
}

