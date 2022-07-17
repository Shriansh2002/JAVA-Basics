package OOP.I;

class Main {
    public int addNumbers(int a, int b) {
        return (a + b);
    }
}

public class method {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        Main Obj = new Main();

        int res = Obj.addNumbers(num1, num2);
        System.out.println("Result is: " + res);

        // Java Standard Library Methods
        System.out.println("Square Root of 4 is: " + Math.sqrt(4));

    }
}
