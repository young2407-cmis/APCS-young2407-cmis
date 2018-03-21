import java.util.ArrayList;
public class Trainer extends Person{
    private double teachingAbility;
    private ArrayList<String> taughtSkills;

    public Trainer(String name){
        super(name);
        this.teachingAbility = teachingAbility;
        this.taughtSkills = new ArrayList<String>();
    }

    public boolean teach(Athlete athlete,String skill){
        boolean success = false;
        if(teachingAbility > Math.random()){
            taughtSkills.add(skill);
            success = athlete.train(skill);
        }
        return success;
    }
    
    public boolean move(int x, int y){
        if(x<5 && y<5){
            super.move(x,y);
            return true;
        }
        else{
            return false;
        }
    }
}