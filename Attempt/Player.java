import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Player extends Actor
{
    public int x;
    public int y;
    public int facingx;
    public int facingy;
    private int reload;
    private int bulletSpeed;
    private double damage;
    private double health;

    public Player(){
        GreenfootImage image = getImage();
        image.scale(90,60);
        setImage(image);
        this.reload = 1;
        this.bulletSpeed = 1;
        this.damage = 1;
        this.health = 1;
    }

    public void act()
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        moveAndTurn();
        //wrapAround();
        faceMouse();
        shootMouse(mouse);
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

    public void shoot(MouseInfo mouse)
    {
        Bullet bullet = new Bullet();
        getWorld().addObject(bullet, getX(), getY());
        bullet.setRotation(getRotation());
    }

    public void shootMouse(MouseInfo mouse){
        if (mouse != null){
            if (mouse.getButton() == 1)
            {
                shoot(mouse);
            }
        }
        else if (Greenfoot.mouseMoved() && mouse.getButton()== 1){
            Bullet bullet = new Bullet();
            getWorld().addObject(bullet, getX(), getY());
            bullet.setRotation(getRotation());
        }
    }
}
