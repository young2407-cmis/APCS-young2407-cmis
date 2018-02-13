public class SongDRIVER
{
    public static void main(){
        Song song1 = new Song();       
        System.out.println(song1);
        
        song1.setYearReleased(2016);
        System.out.println(song1.getYearReleased());
        
        Song song2 = new Song("Lemonade",200,true,2016);
        System.out.println(song2);
        
    }
}
