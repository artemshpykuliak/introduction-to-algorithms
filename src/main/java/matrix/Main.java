package matrix;

public class Main {

    private static final int HEIGHT = 3;
    private static final int WIDTH = 4;

    public static void main(String[] args) {

        int[][] matrix = fillingMatrixByRow(HEIGHT, WIDTH);
        print(matrix);
        System.out.println("------------");
        int[][] matrix1 = fillingMatrixByColumn(HEIGHT, WIDTH);
        print(matrix1);
    }

    private static int[][] fillingMatrixByRow(int height, int width) {
        var matrix = new int[height][width];
        for (int row = 0; row < height; row++) {
            for (int col = 0; col < width; col++) {
                matrix[row][col] = row + 1;
            }
        }
        return matrix;
    }

    private static int[][] fillingMatrixByColumn(int height, int width) {
        var matrix = new int[height][width];
        for (int col = 0; col < width; col++) {
            for (int row = 0; row < height; row++) {
                matrix[row][col] = col + 2;
            }
        }
        return matrix;
    }

    private static void print(int[][] matrix) {
        for (int[] ints : matrix) {
            for (int i : ints) {
                System.out.print(i + ", ");
            }
            System.out.println();
        }
    }
}
