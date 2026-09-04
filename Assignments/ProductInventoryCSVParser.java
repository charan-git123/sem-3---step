import java.util.*;
public class ProductInventoryCSVParser {
    static void parseInventoryRecord(String csvLine) {
        String[] word = csvLine.split(",");
        if(word.length !=3){
            System.out.println("Invalid Record");
        }
        else{
            System.out.println("Product: "+word[0]+"| SKU: "+word[1]+"| QTY: "+word[2]);
        }

    }
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        String csvLine = inp.nextLine();
        parseInventoryRecord(csvLine);
    }
}