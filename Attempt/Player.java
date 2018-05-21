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
    private int speed;

    public Player(){
        GreenfootImage image = getImage();
        image.scale(90,60);
        setImage(image);
        this.reload = 1;
        this.bulletSpeed = 1;
        this.damage = 1;
        this.health = 1;
        this.speed = 5;
    }

    public void act()
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        moveAndTurn();
        //wrapAround();
        faceMouse(mouse);
        shootMouse(mouse);
    }

    public void moveAndTurn()
    {
        x = this.getX();
        y = this.getY();
        if(Greenfoot.isKeyDown("a")) {
            turnTowards(x-1,y);
            move(speed);
        }
        if(Greenfoot.isKeyDown("d")) {
            turnTowards(x+1,y);
            move(speed);
        }
        if(Greenfoot.isKeyDown("w")) {
            turnTowards(x,y-1);
            move(speed);
        }
        if(Greenfoot.isKeyDown("s")) {
            turnTowards(x,y+1);
            move(speed);
        }
        if(Greenfoot.isKeyDown("a") && Greenfoot.isKeyDown("w"))  {
            turnTowards(x-1,y-1);
            move(speed);
        }
        if(Greenfoot.isKeyDown("a") && Greenfoot.isKeyDown("s"))  {
            turnTowards(x-1,y+1);
            move(speed);
        }
        if(Greenfoot.isKeyDown("d") && Greenfoot.isKeyDown("w"))  {
            turnTowards(x+1,y-1);
            move(speed);
        }
        if(Greenfoot.isKeyDown("d") && Greenfoot.isKeyDown("s"))  {
            turnTowards(x+1,y+1);
            move(speed);
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

    public void faceMouse(MouseInfo mouse){
        if(mouse != null){
            facingx = mouse.getX();
            facingy = mouse.getY();
            turnTowards(facingx, facingy);
        }
    }

    public void shoot()
    {
        Bullet bullet = new Bullet();
        getWorld().addObject(bullet, getX(), getY());
        bullet.setRotation(getRotation());
    }

    public void shootMouse(MouseInfo mouse){
        if(Greenfoot.isKeyDown("space")) {
            shoot();
        }
    }
}
