public class Main {

    public static void main (String [] args){
        Garage g = new Garage();
        Car c = new Car(200,4,"Black", "ABC", 205);
        Tank  t = new Tank(200, 20,"Russian color", "BBC", 20000);
        Boat b = new Boat(100, 2, "White", "BAC", true);

        g.addVehicle(c);
        g.addVehicle(t);
        g.addVehicle(b);
        g.outputGarage();
        g.removeById("ABC");
        g.outputGarage();
    }

}
