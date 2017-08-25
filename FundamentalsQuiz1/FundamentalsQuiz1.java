import javax.swing.JOptionPane;
public class FundamentalsQuiz1
{
    public static void main(String[] args){
        int valuea= 3;
        int valueb= 4;
        System.out.println(one(valuea,valueb));
        
        double valuec= 1.3;
        double valued= 1.3;
        double valuee= 1.3;
        System.out.println(three(valuec, valued, valuee));
    }
    public static int one(int a, int b){
        int sqa= a*a;
        int sqb= b*b;
        return sqa + sqb;
}
    public static double three(double a, double b, double c) {
        double average= a + b + c;
        double average1= average/3;
        return average1;
}
}