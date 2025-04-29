public class ParkingZone {
    private static int idCounter = 1;
    private String id;
    private Vehicle[] slots;

    public ParkingZone() {
        id = "Z" + idCounter;
        idCounter++;
        slots = new Vehicle[5];
    }

    public boolean addVehicle(Vehicle v) {
        for (int i = 0; i < slots.length; i++) {
            if (slots[i] != null && slots[i].getLicensePlate().equals(v.getLicensePlate())) {
                System.out.println("Duplicate plate not allowed: " + v.getLicensePlate());
                return false;
            }
        }

        for (int i = 0; i < slots.length; i++) {
            if (slots[i] == null) {
                slots[i] = v;
                return true;
            }
        }

        return false;
    }

    public String getZoneId() {
        return id;
    }

    public String toString() {
        String text = "Zone ID: " + id + ", Vehicles: [";
        for (int i = 0; i < slots.length; i++) {
            if (slots[i] != null) {
                text += slots[i];
            } else {
                text += "null";
            }
            if (i < slots.length - 1) {
                text += ", ";
            }
        }
        text += "]";
        return text;
    }
}
