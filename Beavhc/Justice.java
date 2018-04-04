import greenfoot.*;
public class Justice extends Animal{
    public void changePosition(){
        if(Math.random() > 0.8){
            turn(30 - (int)(Math.random() * 60));
        }
        move(getLifeForce() / 20);
    }
    
    public boolean eat (Actor food){
        boolean success = false;
        if(food instanceof Starfish && getLifeForce() < 25){
            Starfish starfish = (Starfish) food;
            int nutrition = starfish.getLifeForce();
            while(nutrition > 0){
                incrementLifeForce();
                nutrition--;
            }
        }else if(food instanceof Mango){
            Mango mango = (Mango) food;
            int nutrition = mango.getNutrition();
            success = true;
            while (nutrition > 0){
                incrementLifeForce();
                nutrition--;
            }
        }else if (food instanceof Justice && getLifeForce() < 50){
            Justice justice = (Justice) food;
            int nutrition = justice.getLifeForce();
            while(nutrition > 0){
                incrementLifeForce();
                nutrition--;
            }
        }
        return success;
    }
    
    public void reproduce(){
        if(isTouching(Starfish.class) && getLifeForce() > 95){
            World w = getWorld();
            w.addObject(new Justice(), getX(), getY());
            while(getLifeForce() > 25){
                whither();
            }
        }
    }
}