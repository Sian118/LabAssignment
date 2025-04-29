public class Supervisor extends Person {
    private int YearsofExperience;

    Supervisor(String name, int YearsofExperience){
        super(name); 
        this.YearsofExperience = YearsofExperience;
    }
    @Override
    public String toString(){
    return super.toString()+","+"Years of experience"+YearsofExperience+"Years";


    }
}
