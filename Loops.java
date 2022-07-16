public class Loops {
    public static void main(String[] args) {
        int finalValue = 10, sum = 0;

        // Simple For Loop
        for (int i = 0; i <= finalValue; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to " + finalValue + " is " + sum);

        // For-Each Loop
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        for (int number : numbers) {
            System.out.println(number);
        }

        // While Loop
        int i = 0, n = 11;
        while (i <= n) {
            System.out.println(i);
            i++;
        }

        // Do-While Loop
        do {
            System.out.println(i);
            i++;
        } while (i <= n);

    }
}
