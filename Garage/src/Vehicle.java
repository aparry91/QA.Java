public class Vehicle {
    private double engineSize;
    private int wheelCount;
    private String color;
    private String registration;
    private boolean isFixed = false;



    public Vehicle(double engineSize, int wheelCount, String color, String registration) {
        super();
        this.engineSize = engineSize;
        this.wheelCount = wheelCount;
        this.color = color;
        this.registration = registration;

    }

        public double getEngineSize() {
            return engineSize;
        }

        public void setEngineSize(double engineSize) {
            this.engineSize = engineSize;
        }

        public int getWheelCount() {
            return wheelCount;
        }

        public void setWheelCount(int wheelCount) {
            this.wheelCount = wheelCount;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public boolean isFixed() {
        return isFixed;
    }

    public void setFixed(boolean fixed) {
        isFixed = fixed;
    }

    public String toString() {
            return "Engine size" + this.engineSize + "Color: " + this.color + "Wheel count: " + this.wheelCount + "Registration" + this.registration;
        }

}
