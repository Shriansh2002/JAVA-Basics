package Arrays;

import java.util.Arrays;

public class cpyArr {
    public static void main(String[] args) {
        // Original Array
        int[] numbers = { 1, 2, 3, 4, 5, 6 };

        // Copy Arrays
        int[] n1;
        int[] n2 = new int[numbers.length];
        int[] n3 = new int[numbers.length];
        int[] n4;

        // Method 1: By Assigning Operator
        n1 = numbers;
        for (int number : n1) {
            System.out.print(number + ", ");
        }

        // Method 2: By Using Looping Construct
        for (int ele = 0; ele < numbers.length; ele++) {
            n2[ele] = numbers[ele];
        }
        for (int ele : n2) {
            System.out.print(ele + ", ");
        }

        // // Method 3: By Using System.arraycopy()
        System.arraycopy(numbers, 0, n3, 0, numbers.length);
        System.out.println("n3 = " + Arrays.toString(n3));

        // // Method 4: By Using Arrays.copyOfRange()
        n4 = Arrays.copyOfRange(numbers, 0, numbers.length);
        System.out.println("n4 = " + Arrays.toString(n4));
    }
}
