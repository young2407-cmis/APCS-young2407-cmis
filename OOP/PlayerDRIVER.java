public class PlayerDRIVER
{
    public static void main(){
        Player player1= new Player();
        System.out.println(player1);
        
        Player player2= new Player("Young", "Keum", 1, 175, 1);
        System.out.println(player2);
        
        player1.setName("Han");
        System.out.println(player1.getName());
    }
}
