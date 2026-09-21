package in.kgcoding.abstraction;

public class TestAbstraction {
    static void main() {
//      Vehicle veh= new Vehicle(4);
        Car car=new Car();
        car.commute();
        car.makeStartSound();
        car.getSetGo();
    }
}
