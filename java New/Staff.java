class Staff {
    private String role;
    private Person person;

    public Staff(String role, Person person) {
        this.role = role;
        this.person = new Person(person);
    }

    public Staff(Staff other) {
        this.role = other.role;
        this.person = new Person(other.person);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Staff staff = (Staff) obj;
        return role.equals(staff.role) && person.equals(staff.person);
    }
}
