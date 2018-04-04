import greenfoot.*;
public class Mango extends Fruit{
    public Mango(){
        super(75);
    }
    
    public void rot(){
        while(Math.random() > 0.3){
            decFreshness();
        }
    }
}