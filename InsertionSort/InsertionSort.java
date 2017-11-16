public class InsertionSort
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
        for(int i=1; i<array.length; i++){
            for(int i2=i-1; i2>0; i2--){
                if(array[i]<array[i2]){
                    int variable1= array[i];
                    int variable2= array[i2];
                    array[i2]= variable1;
                    array[i]= variable2;
                }
            }
        }
    }
}