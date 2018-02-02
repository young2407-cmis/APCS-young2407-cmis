public class Card
{
    String name;
    int cardValue;
    String cardSuit;
    public Card()
    {
        name = "";
        cardValue = 0;
        cardSuit = "";
    }
    
    public Card(String nname, int ccardValue, int ccardSuit)
    {
        this.name = nname;
        this.cardValue = ccardValue;
        String sCardSuit = "";
        if(ccardSuit==1){
            this.cardSuit = "Clover";
        }
        else if(ccardSuit == 2){
            
        }
    }
    
    public String toString(){
        String rreturn = "";
        rreturn += name+"\n" + cardValue+"\n"+cardSuit;
        return rreturn;
    }
    
}
