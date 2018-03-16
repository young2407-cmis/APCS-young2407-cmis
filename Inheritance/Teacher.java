public class Teacher extends Person{
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