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
    }
}
