public class Clock{
    int hour;
    int min;
    int sec;
    
    public String toString(){
        String rreturn = "";
        rreturn += "The time is " + hour + ":" + min + ":" + sec + "\n";
        rreturn += (totalSeconds()) + "seconds";
        return rreturn;
    }
    
    public Clock(){
        hour = 0;
        min = 0;
        sec = 0;
    }
    
    public Clock(int hhour){
        this();
        this.hour = hhour;       
    }
    
    public Clock(int hhour, int mmin, int ssec){
        this.hour = hhour;
        this.min = mmin;
        this.sec = ssec;
    }
    
    public void setTime(int hour, int min, int sec){
        this.hour = hour;
        this.min = min;
        this.sec = sec;
    }
    
    public void convertDaylightSaving(int hours){
        this.hour += hours;
    }
    
    public int totalSeconds(){
        int hour = this.hour*3600;
        int min = this.min*60;
        int sec = this.sec*1;
        return hour + min + sec;
    }
}