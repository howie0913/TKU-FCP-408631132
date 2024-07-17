public class hm_18 {
    public static void main(String[] args) {
        int[][][] matrix = {
            {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
            },
            {
                {10, 11, 12},
                {13, 14, 15},
                {16, 17, 18}
            },
            {
                {19, 20, 21},
                {22, 23, 24},
                {25, 26, 27}
            }
        };

        for (int z = 0; z < matrix.length; z++) {
            double sum = 0;
            for (int i = 0; i < matrix[z].length; i++) {
                for (int j = 0; j < matrix[z][i].length; j++) {
                    sum += matrix[z][i][j];
                }
            }
            double average = sum / (matrix[z].length * matrix[z][0].length);
            System.out.println("第 " + (z + 1) + " 層的平均值是: " + average);
        }
    }
}
