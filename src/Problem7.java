import java.util.Scanner;
public class Problem7 {
    public static void reversePrint(int n, Scanner sc) {
        if (n == 0) return;

        long num = sc.nextLong();
        reversePrint(n - 1, sc);
        System.out.print(num + " ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        reversePrint(n, sc);
        sc.close();
    }
}
