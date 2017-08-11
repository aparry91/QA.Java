public class Car extends Vehicle {

    private double bootSize;

    public Car(double engineSize, int wheelCount, String color, String registration, double bootSize) {
        super(engineSize, wheelCount, color, registration);
        this.bootSize = bootSize;
    }

    public double getBootSize() {
        return bootSize;
    }

    public void setBootSize(double bootSize) {
        this.bootSize = bootSize;
    }

    public String toString() {
        return super.toString() + "Boot Size: " + this.bootSize;
    }
}
