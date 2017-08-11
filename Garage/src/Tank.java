public class Tank extends Vehicle {

    private double firePower;


    public Tank(double engineSize, int wheelCount, String color, String registration, double firePower) {
        super(engineSize, wheelCount, color, registration);
        this.firePower = firePower;
    }

    public double getFirePower() {
        return firePower;
    }

    public void setFirePower(double firePower) {
        this.firePower = firePower;
    }
        public String toString() {
            return super.toString() + "Fire Power: " + this.firePower;

    }
}
