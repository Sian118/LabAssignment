class ClassRoom {
    private String className
    private String  classCode;
    private Teacher teacher;
    private Student[] students = new Student[5];
    private int studentCount = 0;

    public ClassRoom(String className, String classCode, Teacher teacher) {
        this.className = className;
        this.classCode = classCode;
        this.teacher = teacher;
    }

    public void setClassName(String className) 
 { this.className = className; 
 }
    public void setClassCode(String classCode) 
 { this.classCode = classCode; 
 }
    public void setTeacher(Teacher teacher)
  { this.teacher = teacher; 
  }

    public String getClassName() 
 { return className; 
 }
    public String getClassCode()
  { return classCode;
  }
    public Teacher getTeacher()
  { return teacher; 
  }

    public void addStudent(Student s) {
        if (studentCount < 5) {
            students[studentCount++] = s;
        } else {
            System.out.println("Class " + className + " is full. kindly leave it please");
        }
    }

    public String toString() {
        String result = "Class " + className + " (" + classCode + ")\n" +
                        teacher.toString() + "Students";
        for (int i = 0; i < studentCount; i++) {
            result += students[i].toString() + "\n";
        }
        return result;
    }
}