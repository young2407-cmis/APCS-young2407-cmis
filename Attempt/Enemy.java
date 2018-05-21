import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Enemy extends Actor
{
    private int health;
    private int damage;
    public void act(){
        
    }   
    
    public void die(){
        if(health <= 0){
            World w = getWorld();
            w.removeObject(this);
        }
    }
}
