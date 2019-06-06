package matrix;

public class MatchMatrix {
    private static final int HEIGHT = 3;
    private static final int WIDTH = 3;

    public static void main(String[] args) {
        int[][] matrixA = new int[][] {
                {1, 1, 1},
                {0, 1, 0},
                {1, 0, 0}
        };

        int[][] matrixB = new int[][] {
                {1, 0, 1},
                {1, 1, 1},
                {1, 0, 1}
        };

        int[][] matrixMatch = match(matrixA, matrixB);

        Main.print(matrixMatch);
    }

    public static int[][] match(int[][] matrixA, int[][] matrixB) {
        int[][] matrixC = new int[HEIGHT][WIDTH];
        for (int i = 0; i < HEIGHT; i++) {
            for (int j = 0; j < WIDTH; j++) {
                if (matrixA[j][i] * matrixB[j][i] == 1) {
                    matrixC[j][i] = 1;
                } else {
                    matrixC[j][i] = 0;
                }
            }
        }
        return matrixC;
    }
}
