import java.util.Scanner;
public class Problem9 {
    public static int binomialCoefficient(int n, int k) {
        if (k == 0 || k == n) return 1; // Base case: C(n, 0) = C(n, n) = 1
        return binomialCoefficient(n - 1, k - 1) + binomialCoefficient(n - 1, k);
    }
    /**
     * This method calculates the binomial coefficient C(n, k) recursively
     * using the formula: C(n, k) = C(n-1, k-1) + C(n-1, k).
     *
     * Time complexity: O(2^n)
     * - Each call to `binomialCoefficient(n, k)` makes **two recursive calls**.
     * - The recursion tree grows exponentially, leading to **O(2^n) complexity**.
     * - This is because there are **2^n possible subsets** in Pascal’s Triangle.
     *
     * Space complexity: O(n)
     * - The recursion depth reaches at most **n** before hitting the base case.
     * - Each recursive call is stored in the call stack, leading to **O(n) space**.
     *
     * @param n The total number of elements.
     * @param k The number of elements to choose.
     * @return The binomial coefficient C(n, k).
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(binomialCoefficient(n, k));
    }
}
