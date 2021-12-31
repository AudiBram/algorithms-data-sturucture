package Medium;

import java.util.LinkedList;
import java.util.Queue;

public class One_Matrix {
    int[][] DIRECTIONS = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    public int[][] updateMatrix(int[][] mat) {
        int rows = mat.length;
        if (rows == 0) return mat;

        int cols = mat[0].length;

        Queue<int[]> queue = new LinkedList();

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (mat[r][c] == 0) queue.add(new int[]{r, c});
                else mat[r][c] = Integer.MAX_VALUE;
            }
        }

        while (!queue.isEmpty()) {
            int[] cell = queue.remove();

            for (int[] dir : DIRECTIONS) {
                int x = cell[0] + dir[0];
                int y = cell[1] + dir[1];

                if (x < 0 || x >= rows || y < 0 || y >= cols) continue;

                if (mat[x][y] > mat[cell[0]][cell[1]] + 1) {
                    mat[x][y] = mat[cell[0]][cell[1]] + 1;
                    queue.add(new int[]{x, y});
                }
            }
        }
        return mat;
    }
}
