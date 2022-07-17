package OOP.I;

public class instOf {
    public static void main(String[] args) {

        // Primitive Data Type Example
        String name = "John The Ripper";
        boolean res = name instanceof String;
        System.out.println("Result #1: " + res);

        // Object Data Type Example
        instOf obj = new instOf();
        boolean res2 = obj instanceof instOf;
        System.out.println("Result #2: " + res2);
    }
}
