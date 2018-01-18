
public class MergeClass2nd
{
    public static void main(){
        int[] array1= {1,2,3,4,5,6,7,8,9};
        int[] array2= {1,2,3,4,5,6,7,8,9,10};
        int[] array3= {1,2,3,4,5,6,7};
        //printArray(firstHalf(array1));
        //printArray(secondHalf(array1));        
        //printArray(merge(array1, array2));
        print2DArray(split(array1),true);
        //printArray(merge(array1, array2));
        printArray(merge(array1, array2));
    }

    public static int[] mergeSort(int[] array){
        if(array.length==1){
            return array;
        }
        else{
            
        }        
        return array;
    }

    public static int[] merge(int[] arraya, int[] arrayb){
        int[] returnArray= new int [arraya.length+ arrayb.length];
        int a=0;
        int b=0;
        for(int i=0;i<returnArray.length;i++){
            if(a<arraya.length && b < arrayb.length){
                if(arraya[a]<arrayb[b]){
                    if(a<arraya.length){
                        returnArray[i]= arraya[a];
                        a++;
                    }
                }
                else{
                    if(b<arrayb.length){
                        returnArray[i]= arrayb[b];
                        b++;
                    }
                }
            }
            else{
                if(a==arraya.length){
                    if(b<arrayb.length){
                        returnArray[i]= arrayb[b];
                        b++;
                    }
                }
                else if(b==arrayb.length){
                    if(a<arraya.length){
                        returnArray[i]= arraya[a];
                        a++;
                    }
                }
            }
        }
        return returnArray;
    }    

    public static int[][] split(int[]array){
        int[][] return2DArray= {firstHalf(array),secondHalf(array)};
        return return2DArray;
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
