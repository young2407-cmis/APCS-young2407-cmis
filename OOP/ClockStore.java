import java.util.ArrayList;
public class ClockStore
{
    private ArrayList<Clock> clocksInStock = new ArrayList<Clock>();
    
    public ClockStore(){
        ;
    } 
    
    public void addClock(Clock clock){
        clocksInStock.add(clock);
    }
    
    public int mostSeconds(){
        int seconds = 0;
        int index = -1;
        for(Clock clock:clocksInStock){
            index += 1 ;
            if(clock.totalSeconds()>seconds){
                seconds = clock.totalSeconds();  
            }          
        }
        return index;
    }
    
    public String toString(){
        String rreturn = "";
        for(Clock clock:clocksInStock){
            rreturn += clock + "\n";
        }
        return rreturn;
    }
}
