package Arrays;

public class Array2D {
    public static void main(String[] args) {
        int[][] ARR = {
                { 1, 2, 3 },
                { 4, 5 },
                { 6 }
        };

        System.out.println("Length of Row 1: " + ARR[0].length);
        System.out.println("Length of Row 2: " + ARR[1].length);
        System.out.println("Length of Row 3: " + ARR[2].length);

        // for (int i = 0; i < ARR.length; i++) {
        //     for (int j = 0; j < ARR[i].length; j++) {
        //         System.out.print(ARR[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        for (int[] row : ARR) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }

    }
}
