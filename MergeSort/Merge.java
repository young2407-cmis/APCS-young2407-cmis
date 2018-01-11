public class Merge
{
    public static void main(){
        int[] array1= {5,4,3,2,1,6,7,8,9,10};
        int[] array2= {1,2,3,4,5,6,7,8,9,10};

        printArray(firstHalf(array1));
        printArray(secondHalf(array1));
        printArray(delete(array1, 0));
        printArray(merge(array1, array2));
    }

    public static void printArray(int[] array){
        for(int i : array){
            System.out.print(i+ " ");
        }
        System.out.print("\n");
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

    public static int[] merge(int[] arraya, int[] arrayb){
        int[] returnArray= new int [arraya.length+arrayb.length];
        for(int i=0; i<returnArray.length; i++){
            int a1 = arraya[0];
            int b1 = arrayb[0];
            if(a1>b1){
                returnArray[i]=a1;
                delete(arraya,0);
            }
            else{
                returnArray[i]=b1;
                delete(arrayb,0);
            }
        }
        return returnArray;
    }

    public static int[] delete(int[] array, int i){
        int[] returnArray= new int [array.length-1];
        for(int k=i;k<array.length-1;k++){
            returnArray[k]=array[k+1];
        }
        return returnArray;
    }

    public static int[] mergeSort(int[] array){
        int[] array1;
        int[] array2;
        if (array.length < 2){
            return array;
        }
        else{
            array1= firstHalf(array);            
            array2= secondHalf(array);            
        }
        return merge(array1, array2);
    }
}
