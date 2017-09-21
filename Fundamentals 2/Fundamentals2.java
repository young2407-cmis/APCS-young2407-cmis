import java.util.concurrent.ThreadLocalRandom;
import java.lang.*;
public class Fundamentals2{
    public static void main(){
        int [] intList= {1,2,3,4,5,6,7,8};
        int [] intList2= {2,2,3,4,5,6};
        double[] doubleList= {1.3,5.2,9.8,0.2,7.4};
        String[] stringList= {"first","second","third","fourth","fifth"};
        boolean[] booleanList= {true, false, true, false, true};
        System.out.println (intList[0]);
        System.out.println (doubleList[2]);
        System.out.println (stringList[4]);

        printArray(intList,false);
        printArray(booleanList, false);
        System.out.println (middleItem(intList));

        int[] arraysss = pairs(7);
        printArray(arraysss,false);
        int[] concatr= merge(intList,intList2);
        printArray (concatr,false);
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
    } //end lastItem
    public static double lastItem(double[] array){
        return (array[array.length-1]);
    } //end lastItem
    public static String lastItem(String[] array){
        return (array[array.length-1]);
    } //end lastItem
    public static boolean lastItem(boolean[] array){
        return (array[array.length-1]);
    } //end lastItem
    public static int middleItem(int[] array){
        return (array[(int)(array.length/2)]);
    } //end middleItem
    public static double middleItem(double[] array){
        return (array[(int)(array.length/2)]);
    } //end middleItem
    public static String middleItem(String[] array){
        return (array[(int)(array.length/2)]);
    } //end middleItem
    public static boolean middleItem(boolean[] array){
        return (array[(int)(array.length/2)]);
    } //end middleItem
    public static int[] randomInts(int n, int min, int max){
        int[] output = new int[n];
        for(int i=0;i<n;i++){
            int random= ThreadLocalRandom.current().nextInt(min, max+1);
            output[i] = random;
        }
        return output;
    } //end randomInts
    public static double[] randomDoubles(int n, double min, double max){
        double[] output = new double[n];
        for(int i=0;i<n;i++){
            double random= ThreadLocalRandom.current().nextDouble(min, max+1);
            output[i] = random;
        } //end for 
        return output;
    } //end randomDoubles
    public static int[] copy(int[] array){
        int[] copyArray= new int[array.length];
        for(int i=0;i<array.length;i++){
            copyArray[i] = array[i];
        }
        return copyArray;
    } //end copy
    public static double[] copy(double[] array){
        double[] copyArray= new double[array.length];
        for(int i=0;i<array.length;i++){
            copyArray[i] = array[i];
        }
        return copyArray;
    } //end copy
    public static String[] copy(String[] array){
        String[] copyArray= new String[array.length];
        for(int i=0;i<array.length;i++){
            copyArray[i] = array[i];
        }
        return copyArray;
    } //end copy
    public static boolean[] copy(boolean[] array){
        boolean[] copyArray= new boolean[array.length];
        for(int i=0;i<array.length;i++){
            copyArray[i] = array[i];
        }
        return copyArray;
    } //end copy
    public static int[] pairs(int n){
        int[] output = new int[n*2];
        for(int i=0;i<output.length;i+=2){
            output[i] = i+2;
            output[i+1] = i+2;
        }
        return output;
    } //end pairs
    public static int[] concat(int[] a, int[] b){
        int[] output= new int[a.length + b.length];
        for(int i=0; i<a.length;i++){
            output[i]= a[i];
        }
        for(int i=0; i<b.length;i++){
            output[a.length+i]= b[i];
        }
        return output;
    } //end concat
    public static int[] merge(int[] a, int[] b){
        int[] output= new int[a.length + b.length];
        int shortLength=0;
        for(int i=0; i<output.length;i++){
            if(a.length<b.length){
                shortLength+= a.length;
            }
            else{
                shortLength+= b.length;
            }
        }
    } //end Merge
} //end class Fundamentals2