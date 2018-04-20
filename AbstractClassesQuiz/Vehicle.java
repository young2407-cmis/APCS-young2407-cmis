/**
 * Instance Methods
 * ================
 * Both of these methods should be callable by subclasses of Vehicle
 * #1 breakThisVehicle - change isBroken to true
 * #2 getBrokenStatus - return the value of isBroken
 */
public abstract class Vehicle
{
    private double maxSpeed;
    private double currentSpeed;
    private boolean isBroken;
    private int id;

    public Vehicle(int id, double maxSpeed){
        this.maxSpeed = maxSpeed;
        this.currentSpeed = 0.0;
        this.isBroken = false;
        this.id = id;
    }

    public final double getMaxSpeed(){
        return maxSpeed;
    }

    public final double getCurrentSpeed(){
        return currentSpeed;
    }
    
    public final void setCurrentSpeed(double speed){
        this.currentSpeed = speed;
    }
    
    public abstract void setCurrentSpeedRestricted(double speed);
    
    public final void breakThisVehicle(){
        isBroken = true;
    }
    
    public final boolean getBrokenStatus(){
        return isBroken;
    }

    public String toString(){
        return "Vehicle" + id + "-> Current Speed: " + currentSpeed + "Broken: " + isBroken;
    }
}
