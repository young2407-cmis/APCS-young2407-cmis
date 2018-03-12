import java.util.ArrayList;
public class ClockStoreDRIVER
{
    public static void main(){
        Clock clock1 = new Clock(2,40,00);
        Clock clock2 = new Clock(5,30,00);
        Clock clock3 = new Clock(9,30,00);
        ClockStore store1 = new ClockStore();
        store1.addClock(clock1);
        store1.addClock(clock2);
        store1.addClock(clock3);
        System.out.println(store1);
    }
}
