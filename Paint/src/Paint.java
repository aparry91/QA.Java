public class Paint {

    private int coverage;
    private int volume;
    private String brand;
    private double price;
    private int totalCoverage;
    public Paint p;

    public Paint(int coverage, int volume, String brand, double price) {
        this.coverage = coverage;
        this.volume = volume;
        this.brand = brand;
        this.price = price;
    }

    public int getCoverage() {
        return coverage;
    }

    public void setCoverage(int coverage) {
        this.coverage = coverage;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getTotalCoverage() {
        return getCoverage() * getVolume();
    }

    public void setTotalCoverage(int totalCoverage) {
        this.totalCoverage = totalCoverage;
    }

    @Override
    public String toString() {
        return "Paint{" +
                "coverage=" + coverage +
                ", volume=" + volume +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }

    
}

