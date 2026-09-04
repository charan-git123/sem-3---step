import java.util.*;
public class TrafficSignalStreakAnalyzer {
    public static void streak(String s){
        if(s.length() ==0){
            System.out.println("Signal log is empty");
        }
        char longestcolor = s.charAt(0);
        int longestlength = 1;
        char currentcolor = s.charAt(0);
        int currentLength = 1;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i) == currentcolor){
                currentLength++;
            }
            else{
                if(currentLength >longestlength){
                    longestlength = currentLength;
                    longestcolor = currentcolor;
                }
                currentcolor = s.charAt(i);
                currentLength = 1;
            }
        }
        if(currentLength>longestlength){
            longestlength = currentLength;
            longestcolor = currentcolor;
        }
        System.out.println("Longest Streak: "+longestcolor+" repeated "+longestlength+" times");
    }
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        String signal = inp.nextLine();
        streak(signal);
    }
}