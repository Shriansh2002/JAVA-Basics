package Arrays;

public class Array3D {
    public static void main(String[] args) {
        int[][][] test = {
                {
                        { 1, -2, 3 },
                        { 2, 3, 4 }
                },
                {
                        { -4, -5, 6, 9 },
                        { 1 },
                        { 2, 3 }
                }
        };

        for (int[][] Array2D : test) {
            for (int[] Array1D : Array2D) {
                for (int value : Array1D) {
                    System.out.print(value + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

    }
}
