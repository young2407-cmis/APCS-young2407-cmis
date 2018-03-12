import java.util.ArrayList;
public class MyPod{
    private String color;
    private double memory;
    private Song[] songLibrary;
    
    public MyPod(){
        color = "";
        memory = 0.0;
        songLibrary = new Song[3];
    }

    public MyPod(String color){
        this();
        this.color = color;
    }
    
    public MyPod(String color, double memory){
        this(color);
        this.memory = memory;
    }   
    
    public MyPod(String color, double memory, Song[] songLibrary){
        this(color, memory);
        this.songLibrary = songLibrary;
    }    
    
    public String toString(){
        String output = "";
        output += "Color: " + this.color + "\n";
        output += "Memory: " + this.memory + "\n";
        output += "Songs: \n"; 
        for(Song song : songLibrary){
            output += song + "\n" ;
        }
        return output;
    }
}
