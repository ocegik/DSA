package Recursion;

public class BasicRecursion {
    static int factorial(int n) {
        if (n == 0) return 1;   // base case
        return n * factorial(n - 1);  // recursive call
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Factorial of " + n + " is " + factorial(n));
    }
}
