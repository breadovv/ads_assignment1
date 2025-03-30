import java.util.Scanner;

public class Problem5 {
    public static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    /**
     * This method calculates the nth Fibonacci number using recursion.
     *
     * Time complexity: O(2^n)
     * - The function makes two recursive calls for each non-base case.
     * - This results in an exponential growth of recursive calls.
     * - The number of calls follows the Fibonacci sequence itself, leading to O(2^n) complexity.
     *
     * Space complexity: O(n)
     * - Due to recursive calls, the maximum depth of the recursion stack is O(n).
     *
     * @param n The position in the Fibonacci sequence to compute.
     * @return The nth Fibonacci number.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibonacci(n));
    }
}
