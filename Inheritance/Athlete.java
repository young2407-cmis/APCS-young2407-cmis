public class Athlete extends Person{
    private double athlecism;
    
    public Athlete(String name){
        super(name);
        this.athlecism = athlecism;
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