import java.util.*;
public class WordReversalEncoder {
    static String reverseEachWord(String sentence){
        String[] word = sentence.split(" ");
        StringBuilder result  = new StringBuilder();
        for(int i =0;i<word.length;i++){
            StringBuilder reverse = new StringBuilder();
            for(int j =word[i].length()-1;j>=0;j--){
                reverse.append(word[i].charAt(j));
            }
            result.append(reverse);
            if(i< word.length-1){
                result.append(" ");
            }
        }
        return result.toString();
    }
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = inp.nextLine();
        System.out.println(reverseEachWord(sentence));
    }
}