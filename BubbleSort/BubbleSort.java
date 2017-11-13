public class BubbleSort
{
    public static void main(String[] args){
        int[] numbers = new int[15];
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = (int)(Math.random() * 100);
        }
        print(numbers);
        sort(numbers);
        print(numbers);
    }
    
    public static void print(int[] array){
        for(int i : array){
            System.out.println(i);
        }
        System.out.println();
    }
    
    public static void sort(int[] array){
        int[] array2= array;
        for(int i=0; i<array.length-1; i++){
            int iplus= i+1;
            boolean check= false;
            if(array[i]>array[iplus]){
                check=true;
                array[i]=array2[iplus];
                array[iplus]=array2[i];                
            }
        }
    }
}
