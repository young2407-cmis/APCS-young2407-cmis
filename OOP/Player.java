public class Player
{
    private String name;
    private int number;
    private double height;
    private String position;

    public Player(){
        this.name = "";
        this.number= 0;
        this.height= 0;
        this.position= "";
    }

    public Player(String fname, String lname, int number, double height, int position){
        this.name= fname;
        this.name= lname;
        if(position==1){
            this.position= "Point Guard";
        }
        else if(position==2){
            this.position= "Shooting Guard";
        }
        else if(position==3){
            this.position= "Small Forward";
        }
        else if(position==4){
            this.position= "Power Forward";
        }
        else{
            this.position= "Center";
        }
        this.number= number;
        this.height= height;
    }

    public String toString(){
        String out="";
        out+= "Name: " + name + "\n";
        out+= "Number: " + number + "\n";
        out+= "Height: " + height + "cm\n";
        out+= "Position: " + position + "\n";
        return out;
    }
    
    public String getName(){
        return this.name;
    }

    public int getNumber(){
        return this.number;
    }

    public double getHeight(){
        return this.height;
    }

    public String getPosition(){
        return this.position;
    }
    
    public void setName(String newName){
        this.name= newName;
    }

    public void setNumber(int newNumber){
        this.number= newNumber;
    }   

    public void setHeight(double newHeight){
        this.height= newHeight;
    }

    public void setPosition(int newPosition){
        int a = newPosition;
        if(newPosition==1){
            this.position= "Point Guard";
        }
        else if(newPosition==2){
            this.position= "Shooting Guard";
        }
        else if(newPosition==3){
            this.position= "Small Forward";
        }
        else if(newPosition==4){
            this.position= "Power Forward";
        }
        else{
            this.position= "Center";
        }
    }
    
    public String initials(){
        String initials= "";
    }
    
}

