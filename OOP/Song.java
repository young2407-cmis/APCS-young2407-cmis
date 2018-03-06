public class Song{
    private String name;
    private String artist;
    private int lengthInSeconds;
    private boolean isMale;
    private int yearReleased;

    //zero
    public Song(){
        name = "";
        lengthInSeconds = 0;
        isMale = false;
        yearReleased = 0;
        artist = "";
    }

    public Song(String name){
        this();
        this.name = name;
    }
    
    public Song(String name, String artist){
        this(name);
        this.artist = artist;
    }

    public Song(String name, String artist, int lengthInSeconds){
        this(name, artist);
        this.lengthInSeconds= lengthInSeconds;
    }
    
    
    public Song(String name, String artist, int lengthInSeconds, boolean isMale){
        this(name, artist, lengthInSeconds);
        this.isMale= isMale;
    }

    public Song(String name, String artist, int lengthInSeconds, boolean isMale, int released){
        this(name, artist, lengthInSeconds,isMale);
        this.yearReleased = released;
    }

    //toString
    public String toString(){
        String rreturn = "";
        rreturn += "Name: " + name + "\n";
        rreturn += "Artist: " + artist + "\n";
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
        return "Length: "+ min+ ":" + sec + "\n";       
    }

    public int getYearReleased(){
        return yearReleased;
    }

    public void setYearReleased(int yearReleased){
        this.yearReleased= yearReleased;
    }
}