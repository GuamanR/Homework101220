public class Pet {

    private String name;
    private int age; 
    private String location; 
    private String type; 

    public Pet(){
        name="johnny";
        age= 12;
    }
    public Pet(String na, int ag){
        this.name= na; 
        this.age= ag; 
    }
    public String getName(){
        return name; 
    }
    public int getAge(){
        return age;
    }
    public String getType(){
        return type;
    }
    public String getLocation(){
        return location;
    }
    public void setName(String na){
        this.name=na;
    }
    public void setAge(int ag){
        this.age=ag;
    }
    public void setLocation(String lo){
        this.location=lo;
    }
}
