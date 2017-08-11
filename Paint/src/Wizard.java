import java.util.ArrayList;
import java.util.List;

public class Wizard {

    private double leastWaste;
    private double waste;
    private double cheapest = 10000;
    private double comparison;
    private double tinsNeeded;
    private Paint p;
    private Room r = new Room();
    private List<Paint> paintList = new ArrayList<>();

    public Wizard() {
    }

    public double getLeastWaste() {
        return leastWaste;
    }

    public void setLeastWaste(double leastWaste) {
        this.leastWaste = leastWaste;
    }

    public double getWaste() {
        return waste;
    }

    public void setWaste(double waste) {
        this.waste = waste;
    }

    public double getTinsNeeded() {
        return tinsNeeded;
    }

    public void setTinsNeeded(int tinsNeeded) {
        this.tinsNeeded = tinsNeeded;
    }

    public double getCheapest() {
        return cheapest;
    }

    public void setCheapest(double cheapest) {
        this.cheapest = cheapest;
    }

    public void addPaint(Paint p) {
        paintList.add(p);
    }

    public void outputList() {
        for (Paint p : paintList) {
            System.out.println(p);
        }
    }


    public void leastWaste(int rSize) {

        r.setRoomSize(rSize);
        leastWaste = paintList.get(0).getTotalCoverage();

        Paint pa = new Paint(0, 0, "", 0);

        for (Paint p : paintList) {

            tinsNeeded = Math.ceil(r.getRoomSize() / p.getTotalCoverage());
            waste = (getTinsNeeded() * p.getTotalCoverage()) - r.getRoomSize();
            //

            if (leastWaste > waste) {
                setLeastWaste(waste);
                pa = p;
            } else if (leastWaste == waste) {
                //work out price
            }
        }
        System.out.println("\n" + pa.getBrand() + " wastes the least Paint. There will be ~ " + Math.ceil(leastWaste / pa.getCoverage()) + "L wasted paint.");
    }

    public void cheapest() {

        Paint pa = new Paint(0, 0, "", 0);

        for (Paint p : paintList) {
            comparison = p.getPrice() / p.getTotalCoverage();
            if (cheapest > comparison) {
                setCheapest(comparison);
                pa = p;
            } else if (cheapest == comparison) {

            }
        }
        System.out.println("\n" + pa.getBrand() + " is the cheapest paint to use. Costing ~ £" + cheapest + "per m2");
    }
}
