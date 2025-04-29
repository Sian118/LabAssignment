public class PermitHolder extends Person {
    private static int nextId = 1000;
    private int permitId;
    
    public PermitHolder(String name) {
        super(name);
        this.permitId = nextId++;
    }
    
    public int getPermitId() {
        return permitId;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", Permit ID: " + permitId;
    }
}