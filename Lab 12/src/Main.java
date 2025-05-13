public class Main {
    public static void main(String[] args) {
    Vehicle [] vehicles=new Vehicle[3];
    vehicles[0]=new Truck();
    vehicles[1]=new Bike();
    vehicles[2]=new Car();

    processVehicle(vehicles, vehicles);
    Doable d=()-> System.out.println("THe Doable is working");
    d.Doit();

}
    public static void processVehicle(Vehicle [] vehicle, Vehicle[] vehicles){
        for(int i=0;i<3;i++){
          System.out.println(vehicle[i]);


        }
        ProcessVehicle v = (Vehicle[] vehicles1) -> {

            for (Vehicle veh : vehicles) {
                System.out.println("Processing: " );
            }
        };

        v.process(  vehicles);


    }
}