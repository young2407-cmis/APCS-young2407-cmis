public abstract class MyDevice{
    private String brand;
    
    public MyDevice(String brand){
        this.brand = brand;
    }
    
    public String toString(){
        return "This is a(n) " + this.brand + " device";
    }
    
    public String getBrand(){
        return this.brand;
    }
}