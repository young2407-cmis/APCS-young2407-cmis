import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Player extends Actor
{
    public int x;
    public int y;
    public int facingx;
    public int facingy;

    public Player(){
        GreenfootImage image = getImage();
        image.scale(90,60);
        setImage(image);
    }

    public void act()
    {
        moveAndTurn();
        //wrapAround();
        faceMouse();
        shoot();
    }

    public void moveAndTurn()
    {
        x = getX();
        y = getY();
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

    /*
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
     */

    public void faceMouse(){
        MouseInfo mouse = Greenfoot.getMouseInfo();
        facingx = mouse.getX();
        facingy = mouse.getY();
        turnTowards(facingx, facingy);
    }

    public void shoot()
    {
        MouseInfo mouseInfo = Greenfoot.getMouseInfo();
        Bullet bullet = new Bullet();
        getWorld().addObject(bullet,getX(),getY());
        bullet.setRotation(getRotation());
    }
}
