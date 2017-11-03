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
     *0 Stages (SetMaximumYData(), goToStartingPoint())
     *1 MaxY
     *2 X
     *3
     *4
     */

    public void setMaximumYData(){
        if(getData(0)==0){
            if (isClearDown()==true ){
                down();
            }
            else{
                int y= getY();
                setData(1,y);
                setData(0,1);
            }
        }
    }

    public void goToStartingPoint(){
        if(getData(0)==1){
            if(isClearLeft()==true){
                left();
            }
            else if(isClearUp()==true){
                up();
                if(isClearUp()==false){
                    setData(0,2);
                }
            }
        }
    }

    public void locateBox(){
        int x;
        if(isClearUp() == false || isClearDown() == false){
            x= getX();
        }
        
    }

    public boolean boxCheck(){
        boolean theReturn= false;
        if (isClearDown()==false && getY()!= getData(0)){
            theReturn=true;
        }
        else if(isClearUp()==false && getY()!= getData(0)){
            theReturn=true;
        }
        else if(isClearRight()==false && getY()!= getData(0)){
            theReturn=true;
        }
        else if(isClearLeft()==false && getY()!=getData(0)){
            theReturn=true;
        }
        return theReturn;
    }

    public final void behave(){
        setMaximumYData(); //stage1
        goToStartingPoint(); 
        locateBox();
    }
}