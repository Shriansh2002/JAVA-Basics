package OOP.I.String;

public class L1 {
    public static void main(String[] args) {
        String str1 = new String("Java");
        String str2 = "World";

        // Length
        System.out.println("Length is: " + str1.length());

        // Merge Strings
        String mergeString = str1 + " " + str2;
        System.out.println(mergeString);

        // Concat
        mergeString = mergeString.concat(" 🔥");
        System.out.println(mergeString);

        // Compare
        boolean isEqual = str1.equals(str2);
        System.out.println(isEqual);
    }
}
