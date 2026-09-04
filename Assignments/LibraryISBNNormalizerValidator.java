import java.util.*;

public class LibraryISBNNormalizerValidator {
    static String normalizeCode(String raw) {
        raw = raw.trim();
        String publisher = raw.substring(0, 3).toUpperCase();
        String remaining = raw.substring(3);
        return publisher + remaining;
    }
    static String validateAndFormat(String code) {
        if (code.length() != 13) {
            return "Invalid: wrong length";
        }
        for (int i = 0; i < 3; i++) {
            if (!Character.isLetter(code.charAt(i))) {
                return "Invalid: publisher code must be 3 digits";
            }
        }
        for (int i = 3; i < 13; i++) {
            if (!Character.isDigit(code.charAt(i))) {
                return "Invalid: non-digit body";
            }
        }
        StringBuilder result = new StringBuilder();
        result.append("[");
        result.append(code.substring(0, 3));
        result.append("] YEAR: ");
        result.append(code.substring(3, 7));
        result.append(" | CATALOG: ");
        result.append(code.substring(7, 13));
        return result.toString();
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter ISBN code: ");
        String raw = inp.nextLine();
        String normalized = normalizeCode(raw);
        System.out.println(validateAndFormat(normalized));
    }
}