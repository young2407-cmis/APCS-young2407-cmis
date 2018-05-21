import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Background here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Background extends World
{
    public static final int width = 1000;
    public static final int height = 600;
    public static final int nOfPlayer = 1;
    public static int nOfEnemies;
    public Background(){    
        super(width, height, 1); 
        setPaintOrder(Player.class, Bullet.class);
        for(int i = 0; i < nOfPlayer; i++){
            addObject(new Player(), (int)(width/2), (int)(height/2));
        }
    }
    
    public void act(){
        
    }
}
