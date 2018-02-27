public class Song{
    private String name;
    private int lengthInSeconds;
    private boolean isMale;
    private int yearReleased;

    //zero
    public Song(){
        name = "";
        lengthInSeconds = 0;
        isMale = false;
        yearReleased = 0;
    }

    public Song(String name){
        this();
        this.name = name;
    }

    public Song(String name, int length){
        this(name);
        this.lengthInSeconds= length;
    }
    
    public Song(String name, int length, boolean isMale){
        this(name, length);
        this.isMale= isMale;
    }

    public Song(String nname, int llength, boolean isMale, int yearReleased){
        this.name = nname;
        this.lengthInSeconds = llength;
        this.isMale = isMale;
        this.yearReleased = yearReleased;
    }

    //toString
    public String toString(){
        String rreturn = "";
        rreturn += "Name: " + name + "\n";
        rreturn += convertToMinSec(lengthInSeconds);
        rreturn += "Year Released: " + yearReleased + "\n";
        if(isMale == true){
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