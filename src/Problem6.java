import java.util.Scanner;
public class Problem6 {
    public static int power(int a, int b) {
        if(b == 0) return 1;
        return a*power(a, b-1);
    }
    /**
     * This method calculates the power of a number using recursion.
     *
     * Time complexity: O(b)
     * - The function recursively calls itself, decrementing b by 1 in each step.
     * - This results in b recursive calls, making the complexity O(b).
     *
     * Space complexity: O(b)
     * - Each recursive call adds a new frame to the call stack.
     * - Since there are b recursive calls, the space complexity is O(b).
     *
     * @param a The base number.
     * @param b The exponent.
     * @return a raised to the power of b (a^b).
     */


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(power(a, b));
    }
}
