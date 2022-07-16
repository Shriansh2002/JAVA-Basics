package Arrays;

import java.util.Arrays;

public class cpyArr2D {
    public static void main(String[] args) {
        int[][] source = {
                { 1, 2, 3, 4 },
                { 5, 6 },
                { 0, 2, 42, -4, 5 }
        };
        int[][] n1 = new int[source.length][];
        int[][] n2 = new int[source.length][];

        // Using looping
        for (int i = 0; i < n1.length; ++i) {
            n1[i] = new int[source[i].length];
            for (int j = 0; j < n1[i].length; ++j) {
                n1[i][j] = source[i][j];
            }
        }
        System.out.println("n1 = " + Arrays.deepToString(n1));

        // Using System.arrayCopy()
        for (int i = 0; i < source.length; ++i) {
            n2[i] = new int[source[i].length];
            System.arraycopy(source[i], 0, n2[i], 0, n2[i].length);
        }
        System.out.println("n2 = " + Arrays.deepToString(n2));
    }
}
