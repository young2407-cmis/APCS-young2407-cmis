public class Checkerboard
{
    public static void main(String[] args){
        int h = 7, w = 10;
        String cb = checkerboard(h,w);
        System.out.println(cb);
    }

    public static String checkerboard(int h, int w){
        String a = ""; //output
        double b = ((h*w)+1)/2; //nofhash
        double c = 0;
        boolean d = false; //check
        double e = Math.random(); //rannum
        String f = "+"; //corner
        for(int x = 0; x < w; x++){
            f += "-";
        }
        f += "+\n";
        a += f;
        for(int y = 0; y < h; y++){
            a += "|";
            for(int x = 0; x < w; x++){
                boolean g = ((y % 2) + (x % 2)) != 1;
                if(g){
                    c++;
                    double prob = c / b;
                    if(e <  prob && d == false){
                        a += (int)(Math.random() * 10);
                        d = true;
                    }else{
                        a += "#";
                    }
                }else{
                    a += " ";
                }

            }
            a += "|\n";
        }
        a += f;
        return a;
    }
}