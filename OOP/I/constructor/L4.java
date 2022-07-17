package OOP.I.constructor;

public class L4 {
    String lang;

    // Constructor Overloading

    L4() {
        this.lang = "Java";
    }

    L4(String x) {
        this.lang = x;
    }

    public void getName() {
        System.out.println("Langauge: " + this.lang);
    }

    public static void main(String[] args) {
        L4 obj = new L4();
        L4 obj2 = new L4("Python");

        obj.getName();
        obj2.getName();
    }
}
