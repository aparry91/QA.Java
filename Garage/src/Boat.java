public class Boat extends Vehicle{

    private boolean hasPropellor;

    public Boat(double engineSize, int wheelCount, String color, String registration, boolean hasPropellor) {
        super(engineSize, wheelCount, color, registration);
        this.hasPropellor = hasPropellor;
    }

    public boolean isHasPropellor() {
        return hasPropellor;
    }

    public void setHasPropellor(boolean hasPropellor) {
        this.hasPropellor = hasPropellor;
    }

    public String toString() {
        return super.toString() + "Propellor: " + this.hasPropellor;
    }
}
