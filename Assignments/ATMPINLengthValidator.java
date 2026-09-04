import java.util.*;
public class ATMPINLengthValidator {
    static void checkpinlength(String pin){
        int len = pin.length();
        if(len == 4){
            System.out.println("PIN Length OK");
        }
        else{
            System.out.println("Invalid PIN - must be exactly 4 digits");
        }
    }
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        String pin = inp.next();
        checkpinlength(pin);
    }
}