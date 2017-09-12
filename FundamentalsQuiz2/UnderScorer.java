public class UnderScorer
{
    public static void main(String[] args){
        for (int x=0;x<101;x++){
            System.out.println("underscore("+x+"):" + underScore(x));
        }
    }
    public static String underScore(int a){
        String output= "";
        for (int x=a;x>=0;){
            if (a%2==0){
                output += x + "_";
                x--;
                x--;
            }
            if (a%2!=0){
                output += x + "_";
                x--;
                x--;
            }
        }
        return output;
    } //end method

    /**
     * A) Write a method called underScore
     * 
     * The method should return values as follows:
     * +===============+================+
     * |  Method Call  |  return value  |
     * +===============+================+
     * | underScore(0) | "0"            |
     * | underScore(1) | "1_"           |
     * | underScore(2) | "2_0"          |
     * | underScore(3) | "3_1_"         |
     * | underScore(4) | "4_2_0"        |
     * | underScore(5) | "5_3_1_"       |
     * | underScore(6) | "6_4_2_0"      |
     * | underScore(7) | "7_5_3_1_"     |
     * | underScore(8) | "8_6_4_2_0"    |
     * | underScore(9) | "9_7_5_3_1_"   |
     * +---------------+----------------+
     * 
     * B) Call underScore from the main method and print out the results
     *    for all values from 0 to 100.
     */
}