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
        for(int i=0; i<array.length;i++){
            lowest= array[i];
            for(int i2=i; i2<array.length; i2++){
                if(lowest>array[i2]){
                    lowest= array[i2];
                    lindex= i2;
                }
            }
            int swap1= array[i];
            array[i]= lowest;
            array[lindex]= swap1;
        }
    }
}
