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
}
