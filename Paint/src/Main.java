public class Main {

    public static void main (String [] args){

        Wizard w = new Wizard();
        Room r = new Room();
        Paint p = new Paint(10, 20, "CheapoMax", 19.99);
        Paint p2 = new Paint(11, 15, "AverageJoes", 17.99);
        Paint p3 = new Paint(20, 10, "DuluxourousPaints", 25.00);


        w.addPaint(p);
        w.addPaint(p2);
        w.addPaint(p3);
        w.outputList();
        w.leastWaste(166);
        w.cheapest();

        }
}


