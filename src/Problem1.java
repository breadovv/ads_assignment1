import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];
        long min = Long.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(min);

    }
    /**
     * This method finds the minimum element in an array.
     * It uses an iterative approach by scanning through all elements.
     *
     * Time complexity: O(n), where n is the number of elements in the array.
     * - The loop runs exactly n times, making the complexity linear.
     * - Each iteration performs a constant-time operation (comparison and assignment).
     *
     * Space complexity: O(n), since an array of size n is created to store elements.
     *
     * @param n The number of elements in the array.
     * @return The minimum value in the array.
     */

}
