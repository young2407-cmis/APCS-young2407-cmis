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
        analyze(literalArray2,4);        
                
                
    } //end setValue

    public static void setValue(int[][] arr, int r, int c, int v){
        arr[r][c]=v;
    } //end setValue

    public static void setValue(double[][] arr, int r, int c, double v){
        arr[r][c]=v;
    } //end setValue

    public static void setValue(String[][] arr, int r, int c, String v){
        arr[r][c]=v;
    } //end setValue

    public static void initializeArray(int[][] array, int value){
        for(int y=0;y<array.length;y++){
            for(int x=0;x<array[y].length;x++){
                array[y][x]=value;
            }
        }
    } //end initializeArray

    public static void initializeArray(double[][] array, double value){
        for(int y=0;y<array.length;y++){
            for(int x=0;x<array[y].length;x++){
                array[y][x]=value;
            }
        }
    } //end initializeArray

    public static void initializeArray(boolean[][] array, boolean value){
        for(int y=0;y<array.length;y++){
            for(int x=0;x<array[y].length;x++){
                array[y][x]=value;
            }
        }
    } //end initializeArray

    public static void initializeArray(String[][] array, String value){
        for(int y=0;y<array.length;y++){
            for(int x=0;x<array[y].length;x++){
                array[y][x]=value;
            }
        }
    } //end initializeArray

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
    } //end print2DArray

    public static void print2DArray(String[][] array, boolean rowMajor){
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
    } //end print2DArray

    public static void print2DArray(boolean[][] array, boolean rowMajor){
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
    } //end print2DArray

    public static void print2DArray(double[][] array, boolean rowMajor){
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
    } //print2DArray

    public static void snakePrint(int[][] arr){
        for(int y=0; y<arr.length; y++){
            if(y%2==0){
                for(int x=0; x<arr[y].length; x++){
                    System.out.print(arr[y][x]+" ");
                }
            }
            else if(y%2!=0){
                for(int x=arr[y].length-1; x>-1; x--){
                    System.out.print(arr[y][x]+" ");
                }
            }
        }
    } //snakePrint

    public static String[][] locate(String[][] arr){
        int numOfHashes= (arr.length * arr[1].length)/2;
        int theRandomNumber= (int)(Math.random() * 10);
        int prob= (int)(Math.random()*numOfHashes);
        int numOfHashesCount= 0;
        boolean check= false;
        for(int y=0; y<arr.length;y++){
            for(int x=0; x<arr[y].length; x++){
                if(arr[y][x].equals("#") && check==false){
                    numOfHashesCount++;
                    if(prob == numOfHashesCount){
                        arr[y][x]= Integer.toString(theRandomNumber);
                        check = true;
                    }
                }
            }
        }
        return arr;
    } //end locate

    public static int[][] replace(int[][] array, int threshold, int newValue){
        for(int y=0; y<array.length; y++){
            for(int x=0; x<array[y].length; x++){
                if(array[y][x]>threshold){
                    array[y][x]= newValue;
                }
            }
        }
        return array;
    } //end replace;

    public static double[][] shift(double[][] arr, int row){
        for(int y=arr.length-1; y>row-1;y--){
            arr[y]=arr[y-1];
        }
        for(int y2=0; y2<row; y2++){
            for(int x=0; x<arr[y2].length; x++){
                arr[y2][x]=(Math.random() * 10);
            }
        }
        print2DArray(arr, true);
        return arr;
    } //end rotate

    public static double[][] rotate(double[][] arr){
        double[][] arr2 = new double[arr.length][arr[0].length];
        for(int y=0; y<arr.length; y++){
            for(int x=0; x<arr[y].length; x++){
                arr2[x][y]=arr[y][x];
            }
        }
        print2DArray(arr2, true);
        return arr2;
    } //end rotate

    public static boolean[][] analyze(double[][] array, double threshold){
        boolean[][] arr2=  new boolean[array.length][array[0].length];
        for(int y=0; y<array.length; y++){
            for(int x=0; x<array[y].length; x++){
                if(array[y][x]>threshold){
                    arr2[y][x]=true;
                }
            }
        }
        print2DArray(arr2, true);
        return arr2;
    } //end analyze
}