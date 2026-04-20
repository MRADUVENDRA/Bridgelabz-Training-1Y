package src.com.gla.Generic_Problem_Statements;
import java.util.*;
class Vehicle{}
class Truck extends Vehicle{}
class Bike extends Vehicle{}
class FleetManager<T extends Vehicle>{
    List<T> list=new ArrayList<>();
    void addVehicle(T v){ list.add(v); }
    void showFleet(){ System.out.println(list.size()); }
}
public class FleetManager {
    public static void main(String[] args) {
        FleetManager<Truck> f=new FleetManager<>();
        f.addVehicle(new Truck());
        f.showFleet();
    }
}