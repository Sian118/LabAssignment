class Teacher extends Person {
    private String subject;
    private int teacherID;

    public Teacher(String name, int age, String subject, int teacherID) {
        super(name, age);
        this.subject = subject;
        this.teacherID = teacherID;
    }

    public void setSubject(String subject) 

{
 this.subject = subject; 

}
    public void setTeacherID(int teacherID) {


 this.teacherID = teacherID;

 }

    public String getSubject() {

 return subject; 
}
    public int getTeacherID() { 
return teacherID; 
 }
    
    public boolean equals(Teacher t) {
        return this.teacherID == t.teacherID;
    }

    public String toString() {
        return "Teacher " + getname() + " Age " + getage() + " Subject " + subject;
    }
}