public class Merge
{
    public static void main(){
        int[] array= {5,4,3,2,1,6,7,8,9,10};

        printArray(firstHalf(array));
        printArray(secondHalf(array));
    }

    public static void printArray(int[] array){
        for(int i : array){
            System.out.print(i+ " ");
        }
    }

    public static int[] firstHalf(int[] array){
        int[] returnArray= new int [array.length/2];
        for(int i=0; i<array.length/2; i++){
            returnArray[i] = array[i];
        }
        return returnArray;
    }

    public static int[] secondHalf(int[] array){
        int[] returnArray= new int [array.length - (array.length/2)];
        for(int i=returnArray.length; i<array.length; i++){
            returnArray[i-returnArray.length] = array[i];
        }    
        return returnArray;
    }

    public static int[] MergeSort(int[] array){
        if (array.length < 2){
            return array;
        }
        else{
            int[] array1= firstHalf(array);
            int[] array2= secondHalf(array);
            ;
        }
    }
}
