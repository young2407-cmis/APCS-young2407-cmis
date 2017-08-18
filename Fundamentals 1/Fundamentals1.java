import javax.swing.JOptionPane;
public class Fundamentals1
    {
    public static void main (String args [])
        {
        
        System.out.println( "Hello everyone out there! "); //Display the string
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
        
        
        } //end method main
    public static void dataTypes ()
        {
        byte byteType= 15;
        System.out.println("8bit, limited integer datatype. Byte could be used to save memory when it is used to represent someone's age\n");

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
    public static double add2(double a, double b)
        {
        double sum= a + b;
        return sum;
    }
    public static double subtract2(double a, double b)
        {
        double difference= a - b;
        return difference;
    }
    public static double multiply2(double a, double b)
        {
        double product= a * b;
        return product;
    }
    public static double divide2(double a, double b)
        {
        double quotient = a / b;
        return quotient;
    }
    public static void compare(int a, int b)
        {
        String string1= String.format("The value of a is %1$d and it is greater than b whose value is %2$d.",a,b);
        String string2= String.format("The value of a is %1$d and it is less than b whose value is %2$d.",a,b);
        String string3= String.format("The value of a is %1$d and it is equal to  b whose value is %2$d.",a,b);
        if (a>b) {
        System.out.println(string1);
    }
        else if (a<b) {
            System.out.println(string2);
    }
        else {
            System.out.println(string3);
    }
    }
    
}
        
 