public class instruments
{
    String family;
    int rangeInOctaves;
    
    public instruments(){
        family = "";
        rangeInOctaves = 0;
    }
    
    public instruments(String ffam, int rangefam){
        this.family= ffam;
        this.rangeInOctaves = rangefam;
    }
}
