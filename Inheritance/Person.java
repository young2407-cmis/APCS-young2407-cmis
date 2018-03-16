public abstract class Person{
    private String name;
    private int age;
    private boolean gender;
    private int x;
    private int y;
    public Person(){
        name = "";
        age = 0;
        gender = false;
    }

    public Person(String newName){
        this();
        this.name = newName;
    }

    public Person(String newName, int newAge){
        this(newName);
        this.age = newAge;
    }

    public Person(String newName, int newAge, boolean isMale){
        this(newName, newAge);
        this.gender = isMale;
    }
    
    public Person(String newName, int newAge, boolean isMale, int x, int y){
        this(newName, newAge, isMale);
        this.x = x;
        this.y = y;
    }    

    public String toString(){
        String gender = "female";
        if(this.gender == true){
            gender = "male";
        }
        String output = this.name + " is a " + this.age + " year old " + gender + " at " + this.x + "," + this.y + ".";
        return output;
    }
    
    public boolean move(int x, int y){
        this.x = x;
        this.y = y;
        return true;
    }
}