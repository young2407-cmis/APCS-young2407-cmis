public class Student{
    String firstname;
    String lastname;
    int grade;
    boolean isMale;
       
    public String toString(){
        String rreturn = "";
        String gender = "";
        String sgrade = "";
        if (isMale == true){
            gender = "male";
        }
        else{
            gender = "female";
        }
        if(grade == 9){
            sgrade = "freshman";
        }
        else if (grade == 10){
            sgrade = "sophomore";
        }
        else if (grade == 11){
            sgrade = "junior";
        }
        else if (grade == 12){
            sgrade = "senior";
        }
        rreturn += firstname + " " + lastname + " is a " + gender + " " + sgrade + "."; 
        return rreturn;
    }
    
    public Student(){
        firstname = "Rachel";
        lastname = "Perry";
        grade = 12;
        isMale = false;
    }
    
    public Student(String ffirstname, String llastname, int ggrade, boolean iisMale){
        this.firstname = ffirstname;
        this.lastname = llastname;
        this.grade = ggrade;
        this.isMale = iisMale;
    }
}