public class Song{
    private String name;
    private int lengthInSeconds;
    private boolean gender;
    private int yearReleased;

    //zero
    public Song(){
        name = "";
        lengthInSeconds = 0;
        gender = true;
        yearReleased = 0;
    }

    //three
    public Song(String nname, int llength, boolean ggender, int yearReleased){
        this.name = nname;
        this.lengthInSeconds = llength;
        this.gender = ggender;
        this.yearReleased = yearReleased;
    }
    
    //toString
    public String toString(){
        String rreturn = "";
        rreturn += "Name: " + name + "\n";
        rreturn += convertToMinSec(lengthInSeconds);
        rreturn += "Year Released: " + yearReleased + "\n";
        if(gender == true){
            rreturn += "Gender of the Artist: " + "Male" + "\n";
        }
        else{
            rreturn += "Gender of the Artist: " + "Female" + "\n";
        }
        return rreturn; 
    }
    
    public String convertToMinSec(int seconds){
        int min= seconds/60;
        int sec= seconds%60;
        return "Length in Minutes: "+ min+ ":" + sec + "\n";       
    }
    
    public int getYearReleased(){
         return yearReleased;
    }
    
    public void setYearReleased(int yearReleased){
         this.yearReleased= yearReleased;
    }
}