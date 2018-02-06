public class Planet
{
    private String name;
    private double diameter;
    private int moons;
    private boolean haveRings;

    //zero constructor
    public Planet(){
        double ddiameter =(Math.random() * (100 - 5)) + 5;
        double nname= (Math.random());
        this.name = "Planet " + nname;
        this.diameter= ddiameter;
        this.moons=(int) (Math.random() * (10 - 0)) + 0;
        if(Math.random()>0.25){
            this.haveRings=true;
        }
        else{
            this.haveRings=false;
        }
    }

    public Planet(String name, double diameter, int moons, boolean haveRings){
        if(name=="Alderaan"){
            this.name= "The shattered remains of Alderaan";
        }
        else{
            this.name = name;
        }
        
        if(5<diameter && diameter<100){
            this.diameter = diameter;
        }
        else{
            this.diameter = 5;
        }
        
        if(0<moons && moons<10){
            this.moons = moons;
        }
        else{
            this.moons = 0;
        }
        
        if(this.moons == 0){
            this.haveRings= haveRings;
        }
        else{
            this.haveRings= false;
        }
    }
    
    public String toString(){
        String rreturn = "";
        rreturn += "Name: " + name + "\n";
        rreturn += "Diameter: " + diameter + "\n";
        rreturn += "Number of moons: " + moons + "\n";
        if(haveRings == true){
            rreturn += "Has rings";
        }
        else{
            rreturn += "Doesn't have rings";
        }
        return rreturn;
    }
    
    
    public static void main(String[] args){
        Planet p1 = new Planet();
        System.out.println(p1);
        System.out.println();

        Planet p2 = new Planet();
        System.out.println(p2);
        System.out.println();

        Planet p3 = new Planet("Tatooine", -100.0, 35, true);
        System.out.println(p3);
        System.out.println();

        Planet p4 = new Planet("Alderaan", 35.234234, 2, false);
        System.out.println(p4);
        System.out.println();

        Planet p5 = new Planet("Endor", 12.234234, 2, true);
        System.out.println(p5);
        System.out.println();

        Planet p6 = new Planet("Dagoba", 85.4, 0, true);
        System.out.println(p6);
        System.out.println();

    }
}