public class Main {
    public static void main(String[] args) {
        Principal p = new Principal("Sir jafar", 50, 20);
        School s = new School("Sheikh zayed public school", "Shahi Road Ryk", p);
        
        Teacher t1 = new Teacher("Sir kamran", 30, "Math", 101);
        Teacher t2 = new Teacher("Sir jamshai", 35, "Science", 98);
        
        ClassRoom cls1 = new ClassRoom("Grade 5", "G10", t1);
        ClassRoom cls2 = new ClassRoom("Grade 9", "G11", t2);
        
        s.addClassRoom(c1);
        s.addClassRoom(c2);
        
        Student st1 = new Student("Sian", 16, 1);
        Student st2 = new Student("Ali", 17, 2);
        Student st3 = new Student("Ahmed", 16, 3);
        Student st4 = new Student("Sarfraz", 17, 4);
        Student st5 = new Student("taha", 16, 5);
        Student st6 = new Student("Talha", 17, 6); 
        
        cls1.addStudent(st1);
        cls1.addStudent(st2);
        cls1.addStudent(st3);
        cls2.addStudent(st4);
        cls2.addStudent(st5);
        cls2.addStudent(st6); 
        
        System.out.println(s.toString());

       
        System.out.println("Comparing Students " + st1.equals(st2)); 
        System.out.println("Comparing Teachers " + t1.equals(t2));
    }
}
