import java.util.Arrays;

public class StringToCharArrayBasic {
    public static void main(String[] args) {
        // toCharArray()
        String s = "Hello Java";
        char[] chars = s.toCharArray();
        System.out.println("=== toCharArray() ===");
        System.out.println("String : " + s);
        System.out.println("Chars  : " + Arrays.toString(chars));
        System.out.println("Length : " + chars.length);

        // Iterate character by character
        System.out.println("\nCharacter by character:");
        for (int i=0; i<chars.length; i++)
            System.out.printf("  [%2d] '%c' (ASCII: %3d)%n", i, chars[i], (int)chars[i]);

        // Palindrome check using char array
        System.out.println("\n=== Palindrome Checker ===");
        String[] words = {"racecar","level","hello","noon","world","madam"};
        for (String w : words) {
            char[] arr = w.toCharArray();
            boolean isPalin = true;
            for (int i=0, j=arr.length-1; i<j; i++,j--)
                if (arr[i] != arr[j]) { isPalin = false; break; }
            System.out.printf("%-10s → %s%n", w, isPalin ? "palindrome" : "not palindrome");
        }

        // Count uppercase / lowercase / digits
        System.out.println("\n=== Character Analysis ===");
        String test = "Hello World 2024!";
        int upper=0, lower=0, digits=0, spaces=0, other=0;
        for (char c : test.toCharArray()) {
            if      (Character.isUpperCase(c)) upper++;
            else if (Character.isLowerCase(c)) lower++;
            else if (Character.isDigit(c))     digits++;
            else if (c == ' ')                 spaces++;
            else                               other++;
        }
        System.out.printf("Input: "%s"%n", test);
        System.out.printf("Upper: %d | Lower: %d | Digits: %d | Spaces: %d | Other: %d%n",
            upper, lower, digits, spaces, other);
    }
}
