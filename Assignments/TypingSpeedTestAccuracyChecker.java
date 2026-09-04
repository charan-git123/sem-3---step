import java.util.*;
public class TypingSpeedTestAccuracyChecker {
    public static void checkaccuracy(String o, String t){
        if(o.length() != t.length()){
            System.out.println("Error: The typed text must have the exact same length as the original passage");
        }
        int tc = o.length();
        int mc = 0;
        int firstmsp = -1;
        for(int i=0;i<tc;i++){
            if(o.charAt(i) == t.charAt(i)){
                mc++;
            }
            else{
                if(firstmsp == -1){
                    firstmsp = i+1;
                }
            }
        }
        double accuracyper = ((double) mc/tc)*100;
        StringBuilder output = new StringBuilder();
        output.append(String.format("Matched: %d/%d)|", mc,tc));
        output.append(String.format("Accuracy: %.2f%% |",accuracyper));
        if(firstmsp == -1){
            output.append("No mismatches");
        }
        else{
            char ochar = o.charAt(firstmsp-1);
            char tchar = t.charAt(firstmsp-1);
            output.append(String.format("First mismatch at position %d ('%c' vs '%c')",firstmsp,ochar,tchar));
        }
        System.out.println(output.toString());
    }
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the original passage: ");
        String original = inp.nextLine();
        System.out.println("Type the passage here: ");
        String typed = inp.nextLine();
        System.out.println("\n-----Results------");
        checkaccuracy(original,typed);
    }
}