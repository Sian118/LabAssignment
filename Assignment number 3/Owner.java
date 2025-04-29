public class Owner extends Person {
    private String ownerId;
    private static int nextId = 1;

    Owner(String name) {
        super(name);
        this.ownerId = String.format("%04d", nextId++);
    }

    public String getOwnerId() {
        return ownerId;
    }

    public String toString() {
        return super.toString() + " Owner ID: " + ownerId;
    }
}
