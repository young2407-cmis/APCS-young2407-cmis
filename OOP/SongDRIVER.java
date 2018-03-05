public class SongDRIVER
{
    public static void main(){
        Song song = new Song();       
        System.out.println(song);
        
        song.setYearReleased(2016);
        System.out.println(song.getYearReleased());
        
        Song song1 = new Song("Lemonade", "Iris Temple", 200,true,2016);
        Song song2 = new Song("Neu Roses", "Daniel Caesar", 181,true,2017);
        
    }
}
