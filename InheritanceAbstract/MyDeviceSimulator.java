import java.util.ArrayList;
public class MyDeviceSimulator{
    public static void main(){
        MyPhone a = new MyPhone("Apple", 16, "0947057587");
        ArrayList<MyDevice> inventory = new ArrayList<MyDevice>();
        inventory.add(a);
        for(MyDevice device : inventory){
            System.out.println(device);
        }
    }
}