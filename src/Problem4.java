import java.util.Scanner;

public class Problem4 {
    public static int factorial(int n) {
        return n == 1 ? 1 : n * factorial(n - 1);

    }
    /**
     * This method calculates the factorial of a given number using recursion.
     *
     * Time complexity: O(n)
     * - The function calls itself recursively, decreasing n by 1 in each step.
     * - The recursion depth is n, meaning the number of recursive calls is proportional to n.
     * - Therefore, the overall time complexity is O(n).
     *
     * Space complexity: O(n)
     * - Each recursive call adds a new frame to the call stack.
     * - Since there are n recursive calls, the space required for the call stack is O(n).
     *
     * @param n The number for which the factorial is to be calculated.
     * @return The factorial of the given number.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factorial(n));

    }
}
