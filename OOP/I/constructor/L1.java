package OOP.I.constructor;

public class L1 {
    int ele;

    // no-arg Constructor
    private L1() {
        System.out.println("No-Arg Constructor Called");
        ele = 1;
    }

    public static void main(String[] args) {
        L1 obj = new L1();

        System.out.println("The Element is: " + obj.ele);
    }
}
