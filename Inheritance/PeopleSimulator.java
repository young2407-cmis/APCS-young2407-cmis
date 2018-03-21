public class PeopleSimulator{
    public static void main(){
        Trainer a = new Trainer("Mario");
        Athlete b = new Athlete("Wario");
        a.move(6,3);
        b.train(a, "Shooting");
    }
}