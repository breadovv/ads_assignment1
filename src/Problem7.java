import java.util.Scanner;
public class Problem7 {
    public static void reversePrint(int n, Scanner sc) {
        if (n == 0) return;

        long num = sc.nextLong();
        reversePrint(n - 1, sc);
        System.out.print(num + " ");
    }
    /**
     * This method reads n numbers and prints them in reverse order using recursion.
     *
     * Time complexity: O(n)
     * - The function makes n recursive calls, each reading one number.
     * - Each call executes in constant time O(1), leading to an overall O(n) complexity.
     *
     * Space complexity: O(n)
     * - Each recursive call is stored in the call stack.
     * - Since there are n recursive calls, the space complexity is O(n).
     *
     * @param n The number of elements to read and print in reverse order.
     * @param sc The Scanner object to read input.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        reversePrint(n, sc);
        sc.close();
    }
}
