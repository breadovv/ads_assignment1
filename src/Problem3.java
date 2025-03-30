import java.util.Scanner;

public class Problem3 {
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n <= 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;

        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
    /**
     * This method checks whether a given number is prime.
     * It uses an optimized approach by eliminating even numbers and checking divisibility up to √n.
     *
     * Time complexity: O(√n)
     * - The function first handles small numbers and eliminates even numbers and multiples of 3 in constant time.
     * - The loop runs from 5 to √n, checking divisibility in steps of 6 (i and i+2).
     * - Since the number of iterations is approximately √n, the overall complexity is O(√n).
     *
     * Space complexity: O(1), as only a few integer variables are used.
     *
     * @param n The number to be checked for primality.
     * @return true if n is prime, false otherwise.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(isPrime(n)) {
            System.out.println("Prime");
        } else {
            System.out.println("Composite");
        }
    }
}
