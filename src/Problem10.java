import java.util.Scanner;
public class Problem10 {
    public static int gcd(int a, int b) {
        if(b == 0) return a;
        return gcd(b, a%b);
    }
    /**
     * This method calculates the Greatest Common Divisor (GCD) of two numbers
     * using the Euclidean Algorithm.
     *
     * Time Complexity: O(log(min(a, b)))
     * - The Euclidean Algorithm reduces the problem size **by at least half**
     *   in each step, making the number of recursive calls **logarithmic**.
     * - The worst case occurs when `b` is the smallest Fibonacci number larger than `a`,
     *   leading to O(log(min(a, b))) complexity.
     *
     * Space Complexity: O(log(min(a, b)))
     * - The recursive approach has a **call stack depth** equal to the number of recursive calls.
     * - Since the recursion depth is **O(log(min(a, b)))**, the space complexity is also **O(log(min(a, b)))**.
     *
     * @param a First number
     * @param b Second number
     * @return The greatest common divisor of `a` and `b`
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(gcd(a, b));
    }
}
