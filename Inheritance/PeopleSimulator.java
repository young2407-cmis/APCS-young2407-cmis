public class PeopleSimulator{
    public static void main(){
        Teacher a = new Teacher("Mario");
        Athlete b = new Athlete("Wario");
        a.move(6,3);
        System.out.println(a);
    }
}