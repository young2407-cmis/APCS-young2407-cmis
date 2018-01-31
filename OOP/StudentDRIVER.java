import javax.swing.JOptionPane;
public class StudentDRIVER{
    public static void main(){
        Student senior001 = new Student();
        System.out.println(senior001);
        
        Student junior001 = new Student("Calvin", "Lee", 11, true);
        System.out.println(junior001);
        
        JOptionPane.showMessageDialog(null, senior001);
        JOptionPane.showMessageDialog(null, junior001);
    }
}