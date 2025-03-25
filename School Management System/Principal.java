class Principal extends Person{
  private int experience;
 Principal(String name, int age, int experience){
 super(name,age);
 this.experience=experience;
} 
public void setexperience(int experience){
 this.experience=experience;

}
public int getexperience(){
 return experience;

}
public String toString(){
 return "Principal name"+ getname()+"Age"+getage()+"Experience"+experience;
}

}