import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
public class Young2 extends Robot
{
    public Young2(){
        super(Color.black);
    }

    public void init(){

    }

    /**
     * What your robot can do:
     * right() => move 1 to the right
     * left() => move 1 to the left
     * up() => move 1 up
     * down() => move 1 down
     * isClearRight() => true means no block to the right
     * isClearRight() => true means no block to the left
     * isClearUp() => true means no block up
     * isClearDown() => true means no block down
     * getX() => returns x coordinate of robot
     * getY() => returns y coordinate of robot 
     */
    public void behave(){
        if(isClearLeft()==true && getY()%2!=0){
            left();
        }
        else if(isClearLeft()==false &&getY()%2!=0){
            down();
        }
        else if(isClearRight()==true && getY()%2==0){
            right();
        }
        else if(isClearRight()==false &&getY()%2==0){
            down();
        }
    }
}
