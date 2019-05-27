package matrix;

public class StrassenAlgorithm {
    public static void main(String[] args) {
        int height = 3;
        int width = 3;
        int[][] matrixA = new int[][]{
                {2, 3, 6},
                {4, 8, 5},
                {7, 9, 3}
        };
        int[][] matrixB = new int[][]{
                {12, 13, 16},
                {14, 18, 15},
                {17, 19, 13}
        };

        int[][] matrixC = new int[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                matrixC[i][j] = 0;
                for (int k = 0; k < width; k++) {
                    matrixC[i][j] = matrixC[i][j] + matrixA[i][k] * matrixB[k][j];
                }
            }
        }
        Main.print(matrixC);
    }
}
