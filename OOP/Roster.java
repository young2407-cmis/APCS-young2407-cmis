public class Roster{
    private Student[] squad = new Student[3];
    public String findStudentWithMaxGPA(Student[] squad){
        double gpa = 0;
        int index = 0;
        int maxIndex = 0;
        for(Student student : squad){           
            if(student.calcGPA()>gpa){
                gpa = student.calcGPA();
                maxIndex = index;
            }
            index += 1;
        }
        squad[maxIndex].
    }
}
