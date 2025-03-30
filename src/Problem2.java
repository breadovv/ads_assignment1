import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];
        double sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
            sum += arr[i];
        }
        System.out.println(sum/n);

    }
    /**
     * This method calculates the average of an array of numbers.
     * It reads 'n' numbers from the user, computes their sum, and then finds the average.
     *
     * Time complexity: O(n), where n is the number of elements in the array.
     * - The loop iterates exactly n times, performing constant-time operations (reading input and summing values).
     * - Thus, the overall complexity is linear.
     *
     * Space complexity: O(n), because an array of size n is created to store input values.
     *
     * @param n The number of elements in the array.
     * @return The average of the given numbers.
     */

}
