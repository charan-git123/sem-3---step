import java.util.*;
public class WarehouseInventoryBalancer {
    public static void compare(int[] a, int[] b){
        int s1 =0;
        int s2 =0;
        String status;
        int hq = a[0];
        int index =0;
        String section = "Section A";
        for(int i=0;i<a.length;i++){
            s1+= a[i];
            s2+=b[i];
        }
        if(s1==s2){
            status = "Balanced";
        }
        else{
            status = "unbalanced";
        }
        for (int i = 1; i < a.length; i++) {
            if (a[i] > hq) {
                hq = a[i];
                section = "Section A";
                index = i;
            }
        }
        for (int i = 0; i < b.length; i++) {
            if (b[i] > hq) {
                hq = b[i];
                section = "Section B";
                index = i;
            }
        }
        System.out.println("Section A Total: " + s1);
        System.out.println("Section B Total: " + s2);
        System.out.println("Status: "+status);
        System.out.println("Highest Quantity: " + hq + " (" + section + ", Item " + (index + 1) + ")");
    }

    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int[] secA = new int[n];
        int[] secB = new int[n];
        System.out.println("Enter the data for Section A: ");
        for(int i=0;i<n;i++){
            secA[i] = inp.nextInt();
        }
        System.out.println("Enter the data for Section B: ");
        for(int i = 0;i<n;i++){
            secB[i] = inp.nextInt();
        }
        compare(secA,secB);
    }
}