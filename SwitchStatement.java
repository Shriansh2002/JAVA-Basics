public class SwitchStatement {
    public static void main(String[] args) {
        int number = 32;

        switch (number) {
            case 16:
                System.out.println("16");
                break;
            case 32:
                System.out.println("32");
                break;
            case 64:
                System.out.println("64");
                break;
            default:
                System.out.println("Unknown");
                break;
        }
    }
}
