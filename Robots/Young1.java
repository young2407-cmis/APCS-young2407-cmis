import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
public class Young1 extends Robot
{
    public RobotTemplate(){
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
     * public final int[] getData() => returns array of int data
     * public final int getData(int idx) => returns int data from index idx
     * public final void setData(int idx, int value) => sets value of data array at idx
     * public final void setData(int[] newData) => replaces values in data array with values in newData
     *
     *Stage1()
     *Stage2()
     *Stage3()
     *Stage4()
     *Stage5()
     *Stage6()
     *Stage7()
     *Stage8()
     *Stage9()
     *
     */

    public final void setMaximumYData(){
        if (isClearDown()==true){
            down();
        }
        else{
            int x= getX();
            int y= getY();
            setData(0,x);
            setData(1,y);
        }
    }

    public void verticalCheck(){}
    
    public boolean boxCheck(){
        if (isClearDown()==false && getY()!=getData(1)){
            return true;
        }
        else if(isClearUp()==false && getY()!=0){
            return true;
        }
    }
    
    public void behave(){
        setMaximumYData();
        
    }
}