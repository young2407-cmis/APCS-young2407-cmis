public class Fundamentals2{
    public static void main(){
        int [] intList= {1,2,3,4,5};
        double[] doubleList= {1.3,5.2,9.8,0.2,7.4};
        String[] stringList= {"first","second","third","fourth","fifth"};
        System.out.println (intList[0]);
        System.out.println (doubleList[2]);
        System.out.println (stringList[4]);
        
        printArray(intList,false);
    } //end main
    public static void printArray(int[] array, boolean skip){
        if (skip==true){
            for(int index=0; index<array.length; index++){
                System.out.println((index) + "." + array[index]);
                index ++;
            }
        } //end if
        else if (skip==false){
            for(int index=0; index<array.length; index++){
                System.out.println((index) + "." + array[index]);
            }
        } //end else if
    } //end printArray
    public static void printArray(int[] array, boolean skip){
        if (skip==true){
            for(int index=0; index<array.length; index++){
                System.out.println((index) + "." + array[index]);
                index ++;
            }
        } //end if
        else if (skip==false){
            for(int index=0; index<array.length; index++){
                System.out.println((index) + "." + array[index]);
            }
        } //end else if
    } //end printArray
    public static void printArray(int[] array, boolean skip){
        if (skip==true){
            for(int index=0; index<array.length; index++){
                System.out.println((index) + "." + array[index]);
                index ++;
            }
        } //end if
        else if (skip==false){
            for(int index=0; index<array.length; index++){
                System.out.println((index) + "." + array[index]);
            }
        } //end else if
    } //end printArray
    public static void printArray(int[] array, boolean skip){
        if (skip==true){
            for(int index=0; index<array.length; index++){
                System.out.println((index) + "." + array[index]);
                index ++;
            }
        } //end if
        else if (skip==false){
            for(int index=0; index<array.length; index++){
                System.out.println((index) + "." + array[index]);
            }
        } //end else if
    } //end printArray
} //end class Fundamentals2

/*for(int index=0; index < array.length; index++){
            if (skip = true){
                System.out.println((index+1
            }
            System.out.println((index) + ". " + array[index]);
        } //end for */