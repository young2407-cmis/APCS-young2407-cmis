public class Fundamentals3{
    public static void main(){
        int[][] defaultArray1=  new int[5][5];
        int[][] literalArray1=  {{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5}};
        double[][] defaultArray2=   new double[5][5];
        double[][] literalArray2={   
                {1.1,2.2,3.3,4.4,5.5},{1.1,2.2,3.3,4.4,5.5},
                {1.1,2.2,3.3,4.4,5.5},{1.1,2.2,3.3,4.4,5.5},
                {1.1,2.2,3.3,4.4,5.5}};
        String[][] checkerboard={   
                {"#"," ","#"," ","#"," ","#"," "},
                {" ","#"," ","#"," ","#"," ","#"},
                {"#"," ","#"," ","#"," ","#"," "},
                {" ","#"," ","#"," ","#"," ","#"},
                {"#"," ","#"," ","#"," ","#"," "},
                {" ","#"," ","#"," ","#"," ","#"},
                {"#"," ","#"," ","#"," ","#"," "},
                {" ","#"," ","#"," ","#"," ","#"}};
        snakePrint(literalArray1);

    }

    public static void setValue(int[][] arr, int r, int c, int v){
        arr[r][c]=v;
    }

    public static void setValue(double[][] arr, int r, int c, double v){
        arr[r][c]=v;
    }

    public static void setValue(String[][] arr, int r, int c, String v){
        arr[r][c]=v;
    }

    public static void initializeArray(int[][] array, int value){
        for(int y=0;y<array.length;y++){
            for(int x=0;x<array[y].length;x++){
                array[y][x]=value;
            }
        }
    }

    public static void initializeArray(double[][] array, double value){
        for(int y=0;y<array.length;y++){
            for(int x=0;x<array[y].length;x++){
                array[y][x]=value;
            }
        }
    }

    public static void initializeArray(boolean[][] array, boolean value){
        for(int y=0;y<array.length;y++){
            for(int x=0;x<array[y].length;x++){
                array[y][x]=value;
            }
        }
    }

    public static void initializeArray(String[][] array, String value){
        for(int y=0;y<array.length;y++){
            for(int x=0;x<array[y].length;x++){
                array[y][x]=value;
            }
        }
    }

    public static void print2DArray(int[][] array, boolean rowMajor){
        if(rowMajor==true){
            for(int y=0; y<array.length; y++){
                for(int x=0; x<array.length; x++){
                    System.out.print(array[y][x]+" ");
                }
                System.out.print("\n");
            }
        }
        else{
            for(int x=0; x<array.length; x++){
                for(int y=0; y<array.length; y++){
                    System.out.print(array[y][x]+" ");
                }
                System.out.print("\n");
            }
        }
    }

    public static void snakePrint(int[][] arr){
        for(int y=0; y<arr.length; y++){
            if(y%2!=0){
                for(int x=0; x<arr[y].length; x++){
                    System.out.print(arr[y][x]+" ");
                }
                System.out.print("\n");
            }
            else if(y%2==0){
                for(int x=arr[y].length; x>0; x--){
                    System.out.print(arr[y][x]+" ");
                }
                System.out.print("\n");
            }
        }
    }
} 