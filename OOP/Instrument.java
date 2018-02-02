public class Instrument
{
    String name;
    String family;
    int rangeInOctaves;
    
    public String toString(){
        String rreturn = "";
        rreturn += name + " is an instrument in the " + family + " family and is able to play " + rangeInOctaves + " octaves.";
        return rreturn;
    }
    
    public Instrument(){
        name = "";
        family = "";
        rangeInOctaves = 0;
    }
    
    public Instrument(String nname,String ffam, int rangefam){
        this.name = nname;
        this.family= ffam;
        this.rangeInOctaves = rangefam;
    }
}
