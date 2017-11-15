public class SelectionSort
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
        int lowest=0;
        int lindex=0;
        for(int i=0; i<array.length-1;i++){
            for(int i2=i; i2<array.length-1; i2++){
                lowest= array[i];
                if(lowest>array[i2]){
                    lowest= array[i2];
                    lindex= i2;
                }
            }
            int swap1= array[i];
            array[i]= lowest;
            lindex= swap1;
        }
    }
}
