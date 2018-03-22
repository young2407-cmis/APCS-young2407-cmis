public class MyPhone extends MyDevice{
    private int ram;
    private String sdCardNumber;
    public MyPhone(String brand,int ram, String sdCardNumber){
        super(brand);
        this.ram = ram;
        this.sdCardNumber = sdCardNumber;
    }
    
    public String toString(){
        return "This is a(n) " + getBrand() + " device with " + this.ram + " ram and with SD Card Number of " + this.sdCardNumber;
    }
    
    public int getRam(){
        return this.ram;
    }
    
    public String getSdCardNumber(){
        return this.sdCardNumber;
    }
    
    public void setRam(int ram){
        this.ram = ram;
    }
    
    public void setSdCardNumber(String sdCardNumber){
        this.sdCardNumber = sdCardNumber;
    }
}