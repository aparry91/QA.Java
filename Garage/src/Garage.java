import java.util.ArrayList;
import java.util.List;

public class Garage {

    //better to use List because, easier to swap left hand side ArrayList, to LinkedList//
    List<Vehicle> vehicleList = new ArrayList<Vehicle>();


    public void addVehicle(Vehicle v) {
        vehicleList.add(v);
    }


    //loops through vehicle list and prints v
    public void outputGarage() {
        for (Vehicle v : vehicleList) {
            System.out.println(v);
        }
    }


    public void removeById(String registration) {
        for (Vehicle v : vehicleList) {
            if (v.getRegistration().equals(registration)) ;
            vehicleList.remove(v);
            //breaks bad practice in big systems
            break;
        }
    }


    //add all of one vehicle to temporary list, ArrayList<Vehicle> tmpList = new ArrayList; loop through, remove all
    public void removeByType(String type) {
        for (Vehicle v : vehicleList) {

            //- scalability option
            if (v.getClass().getName().equals(type)) {
                vehicleList.remove(v);

            }
         }
    }


    public void emptyGarage(){
        vehicleList.clear();
    }


    public void billVehicles(){
        for(Vehicle v : vehicleList) {
            if(v instanceof Car){
                System.out.println("200");
            }
            if(v instanceof Boat){
                System.out.println("2000");
            }
            if(v instanceof Tank){
                System.out.println("20000");
            }
        }
    }

    public void fixVehicle(){
        for(Vehicle v : vehicleList){
        v.setFixed(true);
    }
}
}
