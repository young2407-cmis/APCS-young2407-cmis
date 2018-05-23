import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Triangle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Triangle extends Enemy
{
    private int health;
    public void act() 
    {
        this.health = 2;
    }    
    
    public void takeDamage(int damage){
        this.health -= damage;
    }
}
