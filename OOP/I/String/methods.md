## String Methods in Java

<br>

```java
package OOP.I.String;

public class methods{

    public static void main(String[] args){

        String str1 = new String("Hello World");
        String str2 = new String("Learning Java");

        // 1. contains()
        boolean res = str1.contains("java");

        // 2. substring()
        String res = str1.substring(0, 4);

        // 3. join()
        String res = String.join(" ", str1, res, x);

        // 4. replace()
        String res = str1.replace('l', 'p');

        // 5. replaceAll()
        String res = str1.replaceAll("ll", "pn");

        // 6. replaceFirst()
        String res = str1.replaceFirst("\\+","#");

        // 7. charAt()
        char res = str1.charAt(0);

        // 8. getBytes()
        byte[] byteArray;
        byteArray = str1.getBytes();
        System.out.println(Arrays.toString(byteArray));

        // 9. indexOf()
        int res = str1.indexOf('x');

        // 10. compareTo()
        int res = str1.compareTo(str2);

        // 11. compareToIgnoreCase()
        int res = str1.compareToIgnoreCase(str2);

        // 12. trim()
        String res = str1.trim();

        // 13. format()
        String res = str1.format("Output : %s", str2);

        // 14. split()
        String[] res = str1.split(" ");
        for (String str : res){
            System.out.print(str, ", ");
        }

        // 15. toLowerCase()
        String res = str1.toLowerCase();

        // 16. toUpperCase()
        String res = str1.toUpperCase();

        // 17. valueOf()
        int a=325;
        String res = String.valueOf(a);
        System.out.print(res);

        // 18. toCharArray()
        String res = str1.toCharArray();
        System.out.println(result);

        // 19. matches()
        String regex = "^J..a$";
        System.out.println(str1.matches(regex));

        // 20. startsWith()
        System.out.println(str1.startsWith("J"));

        // 21. endsWith()
        System.out.println(str1.endsWith("J"));

        // 22. isEmpty()
        System.out.println(str1.isEmpty());

        // 22. intern()
        str1 = str1.intern();
        str2 = str2.intern();
        System.out.println(str1 == str2);

        // 23. contentEquals()
        String str1 = "Java";
        StringBuffer sb1 = new StringBuffer("Java");

        System.out.println(str1.equals(sb1));
        System.out.println(str1.contentEquals(sb1));

        // 24. hashCode()
        System.out.println(str1.hashCode());

        // 25. subSequence()
        System.out.println(str1.subSequence(3, 6));

    }
}
```
