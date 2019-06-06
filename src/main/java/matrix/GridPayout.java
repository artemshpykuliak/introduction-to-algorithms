package matrix;

import java.util.ArrayList;

public class GridPayout {
    public static void main(String[] args) {
        int[][] grid = new int[][]{
                {2, 2, 2, 4},
                {5, 2, 2, 4},
                {4, 4, 4, 4}
        };

        int[][] lines = new int[][]{
                {0, 0, 0, 0},
                {2, 2, 2, 0},
                {1, 1, 1, 1}
        };

        ArrayList<Integer> integers = winLines(grid, lines);
        System.out.println(integers.toString());
    }

    public static ArrayList<Integer> winLines(int[][] grid, int[][] lines) {
        ArrayList<Integer> winLines = new ArrayList<>();
        int row = 0;
        for (int lineIndex = 0; lineIndex < lines.length; lineIndex++) {
            int count = 0;
            int[] line = lines[lineIndex];
            int firstSymbol = grid[line[0]][0];
            for (int column = 0; column < line.length; column++) {
                row = line[column];
                int currentSymbol = grid[row][column];
                if (firstSymbol == currentSymbol) {
                    count++;
                    if (count >= 3) {
                        winLines.add(row);
                        break;
                    }
                }
            }
        }
        return winLines;
    }
}
