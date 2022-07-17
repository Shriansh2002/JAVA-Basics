package OOP.I.constructor;

public class L3 {
    int num;
    boolean variable;

    // By-Default the values are assigned to the variables
    // Like for integers = 0, for boolean = false

    public static void main(String[] args) {
        L3 obj = new L3();

        System.out.println("DEFAULT VALUES");
        System.out.println("num: " + obj.num);
        System.out.println("variable: " + obj.variable);
    }
}
