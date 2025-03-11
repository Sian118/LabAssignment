class Person {
    private String name;
    private Address address;

    public Person(String name, Address address) {
        this.name = name;
        this.address = new Address(address);
    }

    public Person(Person other) {
        this.name = other.name;
        this.address = new Address(other.address);
    }

    public String getName() { return name; }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return name.equals(person.name) && address.equals(person.address);
    }
@Override
public boolean equals(Object obj) {
    if (obj instanceof Person other) {
        return this.name.equals(other.name) &&
               this.address.equals(other.address);
    }
    return false;
}



}
