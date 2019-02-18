package exercises;

public class Factorial {

    // Solution #1 - Recursion
    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
         return n * factorial(n-1);
    }

    // Solution #2
    /*public static int factorial(int n) {
        int result = n;
        for (int i = 1; i < n; i++) {
            result *= n-i;
        }
        return result;
    }*/

    public static void main(String[] args) {
        System.out.println(factorial(6));
    }
}
