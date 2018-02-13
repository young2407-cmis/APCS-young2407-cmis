public class Song{
    private int yearReleased;
    
    public Song(){
        this.yearReleased = 0;
    }
    
    public int getYearReleased(){
         return yearReleased;
    }
    
    public void setYearReleased(int yearReleased){
         this.yearReleased= yearReleased;
    }
    
    public String convertToMinSec(int seconds){
        int min= seconds/60;
        int sec= seconds%60;
        return "The length of the song is: "+ min+ " minutes and " + seconds + " seconds.";       
    }
}