public class Clock{
    int hour;
    int min;
    int sec;
    
    public String toString(){
        String rreturn = "";
        rreturn += "The time is " + hour + ":" + min + ":" + sec;
        return rreturn;
    }
    
    public Clock(){
        hour = 0;
        min = 0;
        sec = 0;
    }
    
    public Clock(int hhour, int mmin, int ssec){
        this.hour = hhour;
        this.min = mmin;
        this.sec = ssec;
    }
}