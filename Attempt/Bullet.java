import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Bullet extends Actor
{
    public Bullet(){
        GreenfootImage image = getImage();
        image.scale(20,20);
        setImage(image);
    }

    public void act()
    {
        move(10);
        hitEdges();
    }

    private void hitEdges()
    {
        if((this.getX() < 10 || this.getX() > this.getWorld().getWidth() - 10) && (this != null))
        {
            this.getWorld().removeObject(this);
            return;
        }
        if((this.getY() < 10 || this.getY() > this.getWorld().getWidth() - 10)  && (this != null))
        {
            this.getWorld().removeObject(this);
            return;
        }
    }
    
    private void damage(){
    }
}
