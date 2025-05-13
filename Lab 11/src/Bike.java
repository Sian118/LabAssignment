public class Bike extends TwoWheelVehicle {
    @Override
    public void drive() {
        super.drive();
    }

    @Override
    public void pause() {

    }

    @Override
    public void play() {
        System.out.println("The bike is running");;
    }

    @Override
    public void print() {
        System.out.println("The bike is Printing");
    }
}
