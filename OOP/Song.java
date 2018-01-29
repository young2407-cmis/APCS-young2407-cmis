public class Song{
    private String name;
    private double length;
    private boolean gender;

    //zero
    public Song(){
        name = "Arizona";
        length = 4.9;
        gender = true;
    }

    //three
    public Song(String name, double length, boolean gender){
        name = "Lemonade";
        length = 4;
        gender= true;
    }
    
    
    public String toString(){
        String rreturn = "";
        rreturn += "Name: " + name + "\n";
        rreturn += "Length in Minutes: " + length + "\n";
        if(gender == true){
            rreturn += "Gender of the Artist: " + "Male" + "\n";
        }
        else{
            rreturn += "Gender of the Artist: " + "Female" + "\n";
        }
        return rreturn; 
    }
}