public class ParkingSystem {
    private static ParkingSystem psInstance;
    private String campus;
    private Supervisor head;
    private ParkingZone[] zoneList;
    private PermitHolder[] holderList;
    private int zCount;
    private int hCount;

    private ParkingSystem(String campus, Supervisor head) {
        this.campus = campus;
        this.head = head;
        this.zoneList = new ParkingZone[2];
        this.holderList = new PermitHolder[2];
        this.zCount = 0;
        this.hCount = 0;
    }

    public static ParkingSystem getInstance(String campus, Supervisor head) {
        if (psInstance == null) {
            psInstance = new ParkingSystem(campus, head);
        } else {
            System.out.println("Note: System already exists. Returning the same instance.");
        }
        return psInstance;
    }

    public void addZone(ParkingZone z) {
        if (zCount < zoneList.length) {
            zoneList[zCount] = z;
            zCount++;
        }
    }

    public void addPermitHolder(PermitHolder p) {
        if (hCount < holderList.length) {
            holderList[hCount] = p;
            hCount++;
        }
    }

    public String toString() {
        String res = "Campus: " + campus + "\n";
        res += "Supervisor: " + head + "\n";

        res += "Zones: [";
        for (int i = 0; i < zCount; i++) {
            res += zoneList[i];
            if (i < zCount - 1) {
                res += ", ";
            }
        }
        res += "]\n";

        res += "Permit Holders: [";
        for (int i = 0; i < hCount; i++) {
            res += holderList[i];
            if (i < hCount - 1) {
                res += ", ";
            }
        }
        res += "]";

        return res;
    }
}
