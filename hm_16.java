public class hm_16 {
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

        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                for (int k = 0; k < matrix[i][j].length; k++) {
                    sum += matrix[i][j][k];
                }
            }
        }

        System.out.println("三維陣列中所有元素的總和是: " + sum);
    }
}
