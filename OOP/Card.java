public class Card
{
    boolean isFirst;
    int cardValue;
    public Card()
    {
        isFirst = false;
        cardValue = 0;
    }

    public Card(boolean iisFirst, int ccardValue)
    {
        this.isFirst = iisFirst;
        if(ccardValue>10){
            this.cardValue=10;
        }
        else{
            this.cardValue = ccardValue;
        }
    }

    public String toString(){
        String rreturn = "";
        if(this.isFirst = true){
            rreturn = "First Card Value: " + this.cardValue;
        }
        else{
            rreturn = "Second Card Value: " + this.cardValue;
        }
        return rreturn;
    }
}