import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Line extends Actor
{
    public int x;
    public int y;
    public void act()
    {
        moveAndTurn();
        wrapAround();
        faceMouse();
    }
    
    public void moveAndTurn()
    {
        if(Greenfoot.isKeyDown("left")) {
            turnTowards(x-1,y);
            move(1);
        }
        if(Greenfoot.isKeyDown("right")) {
            turnTowards(x+1,y);
            move(1);
        }
        if(Greenfoot.isKeyDown("up")) {
            turnTowards(x,y-1);
            move(1);
        }
        if(Greenfoot.isKeyDown("down")) {
            turnTowards(x,y+1);
            move(1);
        }
        if(Greenfoot.isKeyDown("left") && Greenfoot.isKeyDown("up"))  {
            turnTowards(x-1,y-1);
            move(1);
        }
        if(Greenfoot.isKeyDown("left") && Greenfoot.isKeyDown("down"))  {
            turnTowards(x-1,y+1);
            move(1);
        }
        if(Greenfoot.isKeyDown("right") && Greenfoot.isKeyDown("up"))  {
            turnTowards(x+1,y-1);
            move(1);
        }
        if(Greenfoot.isKeyDown("right") && Greenfoot.isKeyDown("down"))  {
            turnTowards(x+1,y+1);
            move(1);
        }
    }

    public void wrapAround()
    {
        x = getX();
        y = getY();
        if (x == 599){
            setLocation(0, y);
        }
        if (y == 399){
            setLocation(x, 0);
        }
        if (x == 0){
            setLocation(599, y);
        }
        if (y == 0){
            setLocation(x, 399);
        }
    }
    
    public void faceMouse(){
        MouseInfo mouse = Greenfoot.getMouseInfo();
        turnTowards(mouse.getX(), mouse.getY());
    }
}
