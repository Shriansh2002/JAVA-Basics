package Arrays;

import java.util.Scanner;

public class Array1D {

    // Delaration of an array
    // Syntax: type[] name = new type[size];

    // Example
    // int[] myArray = new int[10];
    // int[] age = {1,2,4,5,6,7,8,9,10};

    public static void main(String[] args) {
        int[] data = new int[4];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < data.length; i++) {
            data[i] = input.nextInt();
        }

        System.out.println("You Entered: ");
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }

        input.close();
    }

}
