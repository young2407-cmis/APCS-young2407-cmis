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
        initializeArray(literalArray1, 9);
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
    
}
