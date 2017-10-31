import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
public class Young1 extends Robot
{
    public Young1(){
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

    public void setMaximumYData(){
        boolean check = false;
        if(check == false){
            if (isClearDown()==true){
                down();
            }
            else{
                int x= getX();
                int y= getY();
                setData(0,x);
                setData(1,y);
            }
            check = true;
        }
    }

    public void goToStartingPoint(){
        if(isClearLeft()==true){
            left();
        }
        if(isClearLeft()==false && isClearUp()==true){
            up();
        }
    }

    public void locateBox(){
        if(getY()%2!=0 && isClearRight() == true){
            right();
            if(isClearRight()==false){
                down();
                if(getY()%2==0 && isClearLeft() == true){
                    left();
                    if(isClearLeft()==false){
                        down();
                    }
                }
            }
        }
    }

    public boolean boxCheck(){
        boolean theReturn=false;
        if (isClearDown()==false && getY()!=getData(1)){
            theReturn=true;
        }
        else if(isClearUp()==false && getY()!=0){
            theReturn=true;
        }
        return theReturn;
    }

    public final void behave(){
        locateBox();
    }
}