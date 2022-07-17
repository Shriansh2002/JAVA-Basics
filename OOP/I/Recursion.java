package OOP.I;

public class Recursion {
    static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        int num = 4;
        System.out.println("Factorial of " + num + " is " + factorial(num));
    }
}
