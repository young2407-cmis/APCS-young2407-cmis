import java.util.concurrent.ThreadLocalRandom;
import java.lang.*;
public class Fundamentals2{
    public static void main(){
        int [] intList= {1,3,5,7,9};
        int [] intList3= {2,4,1,9,11};
        int [] intList2= {2,4,6,8,10,12};
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
        int[] merged= merge(intList,intList2);
        int[] compare= compareArrays(intList, intList3);
        printArray(compare,false);
        int[] minimize= minimize(intList,3);
        printArray(minimize,false);
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
        int totalLength=a.length+b.length;
        int shortLength=0;
        int[] longerArray;
        int[] output= new int[totalLength];   
        int i2=0;
        int i3=0;
        if(a.length<b.length){
            shortLength+= a.length;
            longerArray= b;
        }
        else{
            shortLength+= b.length;
            longerArray= a;
        }
        for(int i=0; i<shortLength;i++){
            output[i2]=a[i];
            output[i2+1]=b[i];
            i2+=2;
        }
        for(int i4=shortLength*2; i4<totalLength; i4++){
            output[i4]= longerArray[shortLength+i3];
            i3++;
        }
        return output;
    } //end Merge
    public static void reverse(int[] array){
        int[] copyArray=copy(array);
        for(int i=0, reversei=array.length-1; i<array.length && reversei>-1; i++, reversei--){
            copyArray[i]=array[reversei];
        }
        array=copyArray;
        printArray(array,false);
    } //end reverse
    public static int[] subArray(int[] array, int start, int stop){
        int[] subArray= new int[stop-start];
        int i2=0;
        for(int i=start; i<stop;i++){
            subArray[i2]=array[i];
            i2++;
        }
        return subArray;
    } //end subArray
    public static int[] compareArrays(int[] a, int[] b){
        int counta=0;
        int countb=0;
        int[] result= new int[a.length];
        for(int i=0; i<a.length;i++){
            if(a[i]>b[i]){
                counta++;
            }
            else if(a[i]>b[i]){
                countb++;
            }
        }
        if(counta>countb){
            result= a;
        }
        else if(countb>counta){
            result= b;
        }
        return result;
    } //end class Fundamentals2
    public static int[] minimize(int[] array, int threshold){
        int[] newArray= new int[array.length];
        for(int i=0;i<array.length;i++){
            if(array[i]>threshold){
                newArray[i]=threshold;
            }
            else{
                newArray[i]=array[i];
            }
        }
        return newArray;
    } //end minimize
    public static void maximize(int[] array, int threshold){
        for(int i=0;i<array.length;i++){
            if(array[i]<threshold){
                array[i]=threshold;
            }
        }
    } //end minimize
    public static double[] maxMerge(double[] a, double[] b){
        
    }
}