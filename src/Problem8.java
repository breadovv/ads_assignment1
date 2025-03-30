import java.util.Scanner;
public class Problem8 {
    public static String isAllDigits(String s, int index) {
        if (index == s.length()) return "Yes";
        if (!Character.isDigit(s.charAt(index))) return "No";
        return isAllDigits(s, index + 1);
    }
    /**
     * This method checks if a given string contains only digits using recursion.
     *
     * Time complexity: O(n)
     * - The function processes one character per recursive call.
     * - Since there are n characters in the string, the function makes n recursive calls.
     * - Each call performs constant-time operations (checking a character and making a recursive call).
     * - Therefore, the overall time complexity is O(n).
     *
     * Space complexity: O(n)
     * - Each recursive call is stored in the call stack.
     * - Since there are at most n recursive calls, the space complexity is O(n).
     *
     * @param s The input string.
     * @param index The current index being checked.
     * @return "Yes" if all characters are digits, otherwise "No".
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(isAllDigits(s, 0));
    }
}
