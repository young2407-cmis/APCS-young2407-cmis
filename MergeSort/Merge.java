public class Merge
{
    public static void main(){
        int[] array1= {2,4,3,2,1,6,7,8,9,10};
        int[] array2= {1,2,3,4,5,6,7,8,9,10};
        int[] array3= {1,2,3,4,5,6,7};
        //printArray(firstHalf(array1));
        //printArray(secondHalf(array1));
        delete(array3,0);
        printArray(array3);
        
        //printArray(merge(array1, array2));
        //print2DArray(split(array1),true);
        printArray(merge(array1, array2));
    }
    
    public static int[] firstHalf(int[] array){
        int[] returnArray= new int [array.length/2];
        for(int i=0; i<returnArray.length; i++){
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
    
    public static int[][] split(int[]array){
        int[][] return2DArray= {firstHalf(array),secondHalf(array)};
        return return2DArray;
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
    
    public static int[] merge2(int[] arraya, int[] arrayb){
        int[] returnArray= new int [arraya.length+arrayb.length];
        if(arraya.length + arrayb.length == 0){
            return
        }
    }
    

    public static void delete(int[] array, int i){
        int[] returnArray= new int [array.length-1];
        for(int k=i;k<array.length-1;k++){
            returnArray[k]=array[k+1];
        }
        array= returnArray;
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
    
    public static void printArray(int[] array){
        for(int i : array){
            System.out.print(i+ " ");
        }
        System.out.print("\n");
    }

     public static void print2DArray(int[][] array, boolean rowMajor){
        if(rowMajor==true){
            for(int y=0; y<array.length; y++){
                for(int x=0; x<array[y].length; x++){
                    System.out.print(array[y][x]+" ");
                }
                System.out.print("\n");
            }
        }
        else{
            for(int x=0; x<array.length; x++){
                for(int y=0; y<array[y].length; y++){
                    System.out.print(array[y][x]+" ");
                }
                System.out.print("\n");
            }
        }
    } //end print2DArray
}
