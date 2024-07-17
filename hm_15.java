public class hm_15 {
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

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                for (int k = 0; k < matrix[i][j].length; k++) {
                    System.out.println("matrix[" + i + "][" + j + "][" + k + "] = " + matrix[i][j][k]);
                }
            }
        }
    }
}
