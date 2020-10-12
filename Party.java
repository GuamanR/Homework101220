
public class Party {
    private String food; 
    private String person; 
    private String location;
    private int balloons;

    public Party(){
        this.food="chips";
        this.person= "Joseph";
        this.location="Richie's house";
        this.balloons= 24;
    }
    public Party(String foodz, int loons){
        this.food=foodz;
        this.person= "Joseph";
        this.location="Richie's house";
        this.balloons= loons;
    }
    public Party(String foodz, String who, String loco){
        this.food=foodz;
        this.person= who;
        this.location=loco;
        this.balloons= 24;
    }
    public String getFood(){
        return food;
    }
    public String getPerson(){
        return person;
    }
    public String getLocation(){
        return location;
    }
    public int getBalloons(){
        return balloons;
    }
    public void setFood(String foodz){
        this.food=foodz;
    }
    public void setPerson(String who){
        this.person=who;
    }
    public void setLocation(String where){
       this.location=where; 
    }
    public void setBalloons(int loons){
        this.balloons=loons;
    }
    public boolean isRichie(String loco){
        return loco=="Richie";
    }
    public String youBring(String foodz){
        return "So, you will bring "+ foodz+"?";
    }



    
}