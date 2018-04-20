import java.util.*;
public class Program
{
    public static void main(String[] args){
        System.out.println("Started");
        List<Vehicle> vehicles = new ArrayList<Vehicle>();
        Airplane airplane1 = new Airplane(23, 5000, 1000);
        airplane1.setAltitude(80);
        airplane1.setCurrentSpeed(2555);
        System.out.println(airplane1);
    }
}
