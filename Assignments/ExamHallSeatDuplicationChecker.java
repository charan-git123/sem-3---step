import java.util.*;
public class ExamHallSeatDuplicationChecker{
    public static void seatchecker(int[] seat){
        boolean isfound = false;
        for(int i=0;i<seat.length;i++){
            for(int j =i+1;j<seat.length;j++){
                if(seat[i] == seat[j]){
                    isfound = true;
                    System.out.println("Duplicate seat number found: "+seat[i]);
                    break;
                }
            }
        }
        if(!isfound){
            System .out.println("Duplicate seat not found");
        }
    }
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the number of inputs: ");
        int n = inp.nextInt();
        int[] seat = new int[n];
        for(int i=0;i<n;i++){
            seat[i] = inp.nextInt();
        }
        seatchecker(seat);
    }
}