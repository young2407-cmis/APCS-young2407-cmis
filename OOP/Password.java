import javax.swing.JOptionPane;
public class Password{
    public static void main(){
        String input= JOptionPane.showInputDialog("Password");
        if(meat(input)){
            return;
        }
        else{
            String input2= JOptionPane.showInputDialog("Invalid Password! Make sure your password is longer than 6 character and contains at least one non-alphanumeric character.");
            meat(input2);
        }
    }
    
    public static boolean meat(String input){
        boolean finalWhat = false;
        if(length(input, 6) && nonAlpha(input, "+-*/@_")){
            finalWhat = true;
        }
        return finalWhat;
    }
    
    public static boolean length(String input, int lengthExcept){
        return (input.length()>=lengthExcept);
    }
    
    public static boolean nonAlpha(String input, String exception){
        for(int i=0; i<exception.length()-1; i++){
            String oneLetter = exception.substring(i,i+1);
            if(input.contains(oneLetter)){
                return true;
            }
        }
        return false;
    }
}