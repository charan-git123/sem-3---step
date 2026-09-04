import java.util.*;
public class MovieReviewWordLengthProfiler {
    public static void classify(String r){
        String[] words = r.split(" ");
        int scount = 0;
        int mcount = 0;
        int lcount = 0;
        for(int i=0;i<words.length;i++){
            int len = words[i].length();
            if(len>=1&&len<=4){
                scount++;
            }
            else if(len>=5 && len<=8){
                mcount++;
            }
            else{
                lcount++;
            }
        }
        System.out.println("Short: "+scount);
        System.out.println("Medium: "+mcount);
        System.out.println("Long: "+lcount);
    }
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the movie review: ");
        String review = inp.nextLine();
        classify(review);
    }
}