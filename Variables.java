public class Variables {
    public static void main(String[] args) {

        // ========================
        // Primitive Data Types
        // ========================

        boolean flag = true; // boolean

        byte range = 127; // byte [-128, 127]
        short temprature = -300; // short [-32,768, 32,767]
        int number = -1000000; // int [-2^(31), 2^(31) - 1]
        long bigNumber = 10000000000L; // long [-2^(63), 2^(63) - 1]
        double decimal = 3.14; // double [-1.7E308, 1.7E308]
        float pi = 3.14f; // float [-3.4E38, 3.4E38]

        char character = 'x'; // Print x
        char letter = 65; // Prints A (ASCII 65)

        String myString = "Hello World"; // String

        System.out.println(flag);
        System.out.println(range);
        System.out.println(temprature);
        System.out.println(number);
        System.out.println(bigNumber);
        System.out.println(decimal);
        System.out.println(pi);
        System.out.println(character);
        System.out.println(letter);
        System.out.println(myString);

    }
}
