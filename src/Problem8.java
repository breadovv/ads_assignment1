import java.util.Scanner;
public class Problem8 {
    public static String isAllDigits(String s, int index) {
        if (index == s.length()) return "Yes";
        if (!Character.isDigit(s.charAt(index))) return "No";
        return isAllDigits(s, index + 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(isAllDigits(s, 0));
    }
}
