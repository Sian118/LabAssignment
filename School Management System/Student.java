class Student extends Person {
    private int rollNumber;

    public Student(String name, int age, int rollNumber) {
        super(name, age);
        this.rollNumber = rollNumber;
    }
    
    public void setRollNumber(int rollNumber) { this.rollNumber = rollNumber; }
    public int getRollNumber() { return rollNumber; }

    public boolean equals(Student s) {
        return this.rollNumber == s.rollNumber;
    }

    public String toString() {
        return "Student " + getname() + " Age " + getage() + " Roll No" + rollNumber;
    }
}