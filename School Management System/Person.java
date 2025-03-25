class Person{
 private String name;
 private int age;
Person(String name,int age){
 this.name=name;
 this.age=age;

}
public String toString(){
 return name +"Agge"+age;

}
public void setname(String name){
 this.name=name;

}
public void setage(int age){
 this.age=age;

}
public String getname(){
 return name;

}
public int getage(){
 return age;

}


}