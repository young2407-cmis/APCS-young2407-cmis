public class Teacher extends Person{
    private double teachingAbility;
    
    public Teacher(String name){
        super(name);
        this.teachingAbility = teachingAbility;
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