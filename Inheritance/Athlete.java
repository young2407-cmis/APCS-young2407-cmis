import java.util.ArrayList;
public class Athlete extends Person{
    private double skillRating;
    private ArrayList<String> trainedSkills;
    private double potential;
    public Athlete(String name){
        super(name);;
        this.trainedSkills = new ArrayList<String>();
        this.potential = Math.random();
    }
    
    public boolean train(String skill){
        boolean success = false;
        if(potential > Math.random()){
            trainedSkills.add(skill);
            success = true;
        }
        return success;
    }
    
    public boolean train(Trainer trainer, String skill){
        return trainer.teach(this, skill);
    }
    
    public boolean move(int x, int y){
        if(x<10 && y<10){
            super.move(x,y);
            return true;
        }
        else{
            return false;
        }
    }
}