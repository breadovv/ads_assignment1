import java.util.Scanner;
public class Problem6 {
    public static int power(int a, int b) {
        if(b == 0) return 1;
        return a*power(a, b-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(power(a, b));
    }
}
