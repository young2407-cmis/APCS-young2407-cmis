import java.util.ArrayList;
public class MyPodDRIVER{
    public static void main(){
        Song song1 = new Song("Lemonade", "Iris Temple", 200, true, 2016);
        Song song2 = new Song("Transform", "Daniel Caesar", 280, true, 2016);
        Song song3 = new Song("Roots//Habit", "Common Souls", 328, true, 2016);
        
        Song[] carPodSongs = {song1,song2,song3};
        MyPod carPod = new MyPod("Black", 128, carPodSongs);
        System.out.println(carPod);
    }
}