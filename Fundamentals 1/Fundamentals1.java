import javax.swing.JOptionPane;
import java.util.Random;
public class Fundamentals1
    {
    public static void main (String args [])
        {
        /*System.out.println( "Hello everyone out there! "); //Display the string
        dataTypes();
        
        double ValueA= 8.41;
        double ValueB= 2.74;
        double ValueC= 4.11;
        
        double CallFunction1= multiply2(ValueC,((add2(ValueA, ValueB))));
        System.out.println(CallFunction1);
        
        String input= JOptionPane.showInputDialog("In Y-Z mathematical equation,\n" +
                                                  "Enter a value for Y \n");
        String input2= JOptionPane.showInputDialog("In Y-Z mathematical equation, \n" +
                                                   "Enter a value for Z");
        String input3= JOptionPane.showInputDialog("In X/Y) mathematical equation, \n" +
                                                   "Enter a value for X");
        String input4= JOptionPane.showInputDialog("In X/Y) mathematical equation, \n" +
                                                   "Enter a value for Y");
        int num1= Integer.parseInt(input);
        int num2= Integer.parseInt(input2);
        int num3= Integer.parseInt(input3);
        int num4= Integer.parseInt(input4);
                            
        double CallFunction2= subtract(num1,num2);
        double CallFunction3= divide(num3,num4);
        
        System.out.println(CallFunction2);
        System.out.println(CallFunction3);
        */
       
        // Conditionals #2. //
        int num5 = 10;
        int num6 = 13;
        System.out.println(compare(num5, num6));
        System.out.println(classify(num5));
        } //end method main
    public static void dataTypes ()
        {
        byte byteType= 15;
        System.out.println("8bit, limited integer datatype.");

        short shortType= 1912;
        System.out.println("16bit, limited integer datatype that is one step larger than byte. Also used to save memory and could be used to represent the year?\n");
        
        int intType= 123181092;
        System.out.println("32bit, limited integer datatype. Integer is smaller than long and could be used to save memory. It can be used in more complex methods involving constant addition, multiplication, subtraction, or division.\n"); 
               
        long longType= 123123L;
        System.out.println("64bit, integer datatype. It is used to store a larger value integer datatype can cover.\n");
        
        float floatType= 199.3F;
        System.out.println("32 bit, decimal datatype. It is used to save memory and is not as accurate as other decimal datatypes. It can be used in simple math functions(division with its unique form of floating points) in different methods\n");
        
        double doubleType= 311.3D;
        System.out.println("64 bit, decimal datatype. Default datatype for decimal values but is not accurate. Could be used in simple calculations\n");
        
        boolean booleanType= true;
        System.out.println("Boolean has two values: True and False. Could be useful in conditionals and in for loops to read and react.\n");
        
        char charType= 'A';
        System.out.println("Char datatype is used to store any character. Could be used in methods to create unicodes for a product.\n");
    }
    public static int add(int a, int b)
        {
        int sum= a + b;
        return sum;
    }
    public static int subtract(int a, int b)
        {
        int difference= a - b;
        return difference;
    }
    public static int multiply(int a, int b)
        {
        int product= a * b;
        return product;
    }
    public static int divide(int a, int b)
        {
        int quotient= a / b;
        return quotient;
    }
    public static double add(double a, double b)
        {
        double sum= a + b;
        return sum;
    }
    public static double subtract(double a, double b)
        {
        double difference= a - b;
        return difference;
    }
    public static double multiply(double a, double b)
        {
        double product= a * b;
        return product;
    }
    public static double divide(double a, double b)
        {
        double quotient = a / b;
        return quotient;
    }
    public static String compare(int a, int b)
        {
        String string1= String.format("The value of a is %1$d and it is greater than b whose value is %2$d.",a,b);
        String string2= String.format("The value of a is %1$d and it is less than b whose value is %2$d.",a,b);
        String string3= String.format("The value of a is %1$d and it is equal to  b whose value is %2$d.",a,b);
        if (a>b) {
        return (string1);
    }
        else if (a<b) {
            return (string2);
    }
        else {
            return (string3);
    }
    }
    public static int classify(int a)
        {
        if (a==0) {
        return (0);
    }
        else if (a%2==0) {
            return (1);
    }
        else {
            return (-1);
    }
    }
    public static void sqareTable ()
        {
        for(int x = 1; x <= 10; x = x + 1) { 
            int square = x*x;
            Random rand= new Random();
            int n= rand.nextInt(square)+x;
            System.out.println (x + "\t" + square + "\t"+ n + "\n");
        }
    }
    public static int triangle (int x)
        {
        int returnvalue= 0;
        for(;x>0;x--) {
            int product= x;
            returnvalue += product;
        }
        return returnvalue;
    }
    public static int pyramid (int x)
        {
        int returnvalue= 0;
        while(x>0) {
            int product= x;
            int square= x*x;
            returnvalue += square;
            x--;
        }
        return returnvalue;
    }
    public static void stringbuffer(String[]args) {
      StringBuffer sb = new StringBuffer();
      for (int i=0; i<1000; i++) {
          sb.append(i);
      }
      System.out.println(sb.toString());
    }
    public static void checkerboard(int h, int w)
    {
        String height="";
        String width="";
        String width2="";
        String up= "";
        double totalhashes = ((h*w)+1)/2;
        double therandomnumber = Math.random();
        boolean onetime= false;
        int alternateh= h+2;
        int x= w;
        int xx=w;
        int alternaterealh= h+2;
        int y= alternaterealh;
        int count = 0;
        for(;alternaterealh>0;alternaterealh--){
            for(;w>0;w--){
                up = up + "-";
            }
            if (alternaterealh%2!=0){
                for (;x>0;x--) {
                    if (x%2!=0){
                            count++;
                            double probability= count/totalhashes;
                            if (therandomnumber < probability && onetime == false){
                                width = width + (int)(Math.random()*10);
                                onetime = true;
                            }
                            else {
                                width = width + "#";
                            }
                        }
                    else {
                        width = width + " ";
                    }
                }   
            }
            else if (alternaterealh%2==0){
                for (;xx>0;xx--) {
                    if (xx%2==0){
                            count++;
                            double probability= count/totalhashes;
                            if (therandomnumber < probability && onetime == false){
                                width2 = width2 + (int)(Math.random()*10);
                                onetime = true;
                            }
                            else {
                                width2 = width2 + "#";
                            }
                    }
                    else {
                        width2 = width2 + " ";
                    }
                }
            }
            String top= "+" + up + "+";
            String side= "|" + width + "|";
            String side2= "|" + width2+ "|";
            if (alternaterealh>alternateh-1){
                    System.out.println (top);
                }
                else if (alternaterealh==1){
                    System.out.println (top);
                }
                else {
                    if (alternaterealh%2!=0){
                        System.out.println (side2);
                    }
                    else if (alternaterealh%2==0){
                        System.out.println (side);
                }
            }     
        }
        }
        public static void checkerboard2 (int h, int w){
        String output= "";
        boolean check= true;
        double indicator= Math.random();
        String top = "";
        String up = "";
        int placement = 0;
        for (int width=0;width<w;width++){
            up = up + "-";
        }
        top = "+" + up + "+\n";
        for (int height=0;height<h;height++){
            output = output + "|";
            for (int width=0;width<w;width++){
                boolean isHash = ((height % 2) + (width % 2)) != 1;
                if (isHash){
                    placement++;
                    double nOfHash= ((h*w)+1)/2;
                    double prob = placement/nOfHash;
                    if (indicator < prob && check == true){
                        int theRandomNumber= (int)(Math.random() * 10);
                        output += theRandomNumber;
                        check = false;
                    }
                    else{
                        output += "#";
                    }
                }
                else {
                    output += " ";
                }
            }
            output += "|\n";
        }
        output = top + output + top;
        System.out.println (output);
    }
    }
