import javax.swing.JOptionPane;
public class ClockDRIVER{
    public static void main(){
        /*
        Clock kitchenClock = new Clock();
        System.out.println(kitchenClock);

        String inputHour= JOptionPane.showInputDialog("Enter the hour");
        String inputMin= JOptionPane.showInputDialog("Enter the minute");
        String inputSec= JOptionPane.showInputDialog("Enter the second");

        int intHour = Integer.parseInt(inputHour);
        int intMin = Integer.parseInt(inputMin);
        int intSec = Integer.parseInt(inputSec);

        Clock bedroomClock = new Clock(intHour,intMin,intSec);
        System.out.println(bedroomClock);
        */

        Clock methodClock = new Clock();
        System.out.println(methodClock);
        methodClock.setTime(0,1,1);     
        methodClock.convertDaylightSaving(1);
        System.out.println(methodClock);
    }
}