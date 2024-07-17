public class hm_17 {
    public static void main(String[] args) {
        int[][][] matrix = {
            {
                {1, 2},
                {3, 4}
            },
            {
                {5, 6},
                {7, 8}
            }
        };

        System.out.println("修改前的三維陣列:");
        printMatrix(matrix);

        int newValue = 10;
        matrix[0][1][1] = newValue;

        System.out.println("\n修改後的三維陣列:");
        printMatrix(matrix);
    }

    public static void printMatrix(int[][][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                for (int k = 0; k < matrix[i][j].length; k++) {
                    System.out.print(matrix[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
