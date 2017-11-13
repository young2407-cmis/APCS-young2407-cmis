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
        boolean check= false;
        while(check){
            check=true;
            for(int i=0; i<array.length-1; i++){
                int iplus= i+1;
                if(array[i]>array[iplus]){
                    check=false;
                    int var1= array[i];
                    int var2= array[iplus];
                    array[i]= var2;
                    array[iplus]= var1;
                }
            }
        }
    }
}

