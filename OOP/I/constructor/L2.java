package OOP.I.constructor;

public class L2 {
    String lang;

    // Parameterized Constructor
    L2(String x) {
        System.out.println("Parametrized Constructor Called");
        lang = x;
    }

    public static void main(String[] args) {
        L2 obj = new L2("Java");

        System.out.println("The Language is: " + obj.lang);
    }
}
