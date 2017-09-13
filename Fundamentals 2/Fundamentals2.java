public class Fundamentals2{
    public static void main(){
        int [] intList= {1,2,3,4,5};
        double[] doubleList= {1.3,5.2,9.8,0.2,7.4};
        String[] stringList= {"first","second","third","fourth","fifth"};
        boolean[] booleanList= {true, false, true, false, true};
        System.out.println (intList[0]);
        System.out.println (doubleList[2]);
        System.out.println (stringList[4]);
        
        printArray(intList,false);
        printArray(booleanList, false);
        System.out.println (middleItem(intList));
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
    public static void printArray(double[] array, boolean skip){
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
    public static void printArray(String[] array, boolean skip){
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
    public static void printArray(boolean[] array, boolean skip){
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
    public static int lastItem(int[] array){
        return (array[array.length-1]);
    }
    public static double lastItem(double[] array){
        return (array[array.length-1]);
    }
    public static String lastItem(String[] array){
        return (array[array.length-1]);
    }
    public static boolean lastItem(boolean[] array){
        return (array[array.length-1]);
    }
    public static int middleItem(int[] array){
        return (array[(int)(array.length/2)]);
    }
} //end class Fundamentals2