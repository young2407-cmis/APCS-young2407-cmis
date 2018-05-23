/**
 * Write a description of class Entity here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Entity extends Actor  
{
    // instance variables - replace the example below with your own
    private int health;
    
    public final void die(){
        if(health <= 0){
            World w = getWorld();
            w.removeObject(this);
        }
    }
}
