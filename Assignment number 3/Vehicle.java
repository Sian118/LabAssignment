public class Vehicle {
    private String licensePlate;
    private String type;
    private Owner owner;
    
    public Vehicle(String licensePlate, String type, Owner owner) {
        this.licensePlate = licensePlate;
        this.type = type;
        this.owner = owner;
    }
    
    
    public Vehicle(Vehicle other) {
        this(other.licensePlate, other.type, other.owner);
    }
    
    
    public Vehicle(Vehicle other, Owner newOwner) {
        this(other.licensePlate, other.type, newOwner);
    }
    
    public String getLicensePlate() {
        return licensePlate;
    }
    
    @Override
    public String toString() {
        return "License Plate: " + licensePlate + ", Type: " + type + ", Owner: [" + owner + "]";
    }
}