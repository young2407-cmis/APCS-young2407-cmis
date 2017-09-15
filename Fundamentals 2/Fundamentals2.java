import java.util.concurrent.ThreadLocalRandom;
public class Fundamentals2{
    public static void main(){
        int [] intList= {1,2,3,4,5,6};
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
    public static double middleItem(double[] array){
        return (array[(int)(array.length/2)]);
    }
    public static String middleItem(String[] array){
        return (array[(int)(array.length/2)]);
    }
    public static boolean middleItem(boolean[] array){
        return (array[(int)(array.length/2)]);
    }
    public static int[] randomInts(int n, int min, int max){
        int[] output;
        while (n--){
            int random= ThreadLocalRandom.current().nextInt(min, max + 1);
            int[] output + random;
        }
        return output;
    }

//} //end class Fundamentals2