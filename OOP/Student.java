public class Student{
    private String firstname;
    private String lastname;
    private int grade;
    private boolean isMale;
    private double[] grades;
       
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
        rreturn += firstname + " " + lastname + " is a " + gender + " " + sgrade + "with an average GPA of " + calcGPA(); 
        return rreturn;
    }
    
    public Student(){
        firstname = "";
        lastname = "";
        grade = 0;
        isMale = false;
        grades = new double[5];
    }
    
    public Student(String ffirstname, String llastname, int ggrade, boolean iisMale, double[] ggrades){
        this.firstname = ffirstname;
        this.lastname = llastname;
        this.grade = ggrade;
        this.isMale = iisMale;
        this.grades = ggrades;
    }
    
    public void setGPA(double englishGrade, double mathGrade, double scienceGrade, double fineArtsGrade, double socialScienceGrade){
        this.grades[0] = englishGrade;
        this.grades[1] = mathGrade;
        this.grades[2] = mathGrade;
        this.grades[3] = fineArtsGrade;
        this.grades[4] = socialScienceGrade;
    }
    
    public double calcGPA(){
        int gpa = 0;
        for(int i=0; i<5; i++){
            gpa += this.grades[i];
        }
        return gpa/5;
    }
}