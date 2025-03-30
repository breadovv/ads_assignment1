import java.util.Scanner;
public class Problem7 {
    public static void reversePrint(int n, Scanner sc) {
        if (n == 0) return; // Base case: Stop recursion when all elements are read

        long num = sc.nextLong(); // Read the number
        reversePrint(n - 1, sc);  // Recursive call (next number is read before printing)
        System.out.print(num + " "); // Print during backtracking (reverse order)
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        reversePrint(n, sc);
        sc.close();
    }
}
