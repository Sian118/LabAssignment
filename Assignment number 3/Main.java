public class Main {
    public static void main(String[] args) {
        Supervisor s = new Supervisor("Dr. Ayesha", 5);
        ParkingSystem ps = ParkingSystem.getInstance("CUI Lahore", s);

        ParkingSystem second = ParkingSystem.getInstance("InvalidTry", s);

        ParkingZone z1 = new ParkingZone();
        ParkingZone z2 = new ParkingZone();

        Owner o1 = new Owner("Ali");
        Owner o2 = new Owner("Zara");

        Vehicle car1 = new Vehicle("LEA123", "Car", o1);
        Vehicle bike1 = new Vehicle("LEB456", "Bike", o2);
        Vehicle car2 = new Vehicle("LEA123", "Car", o1);

        z1.addVehicle(car1);
        z1.addVehicle(bike1);
        z2.addVehicle(car2);

        ps.addZone(z1);
        ps.addZone(z2);

        PermitHolder holder1 = new PermitHolder("Sara");
        PermitHolder holder2 = new PermitHolder("Hassan");

        ps.addPermitHolder(holder1);
        ps.addPermitHolder(holder2);

        System.out.println(ps);

        System.out.println("Showing difference between shallow and deep copy:");
        Vehicle copy1 = new Vehicle(car1);
        Owner freshOwner = new Owner("New Owner");
        Vehicle copy2 = new Vehicle(car1, freshOwner);

        System.out.println("Main Vehicle: " + car1);
        System.out.println("Shallow Copy: " + copy1);
        System.out.println("Deep Copy: " + copy2);

        System.out.println("\nNow changing original owner's name:");
        o1.name = "Changed Ali";
        System.out.println("Main Vehicle: " + car1);
        System.out.println("Shallow Copy (affected): " + copy1);
        System.out.println("Deep Copy (safe): " + copy2);
    }
}
