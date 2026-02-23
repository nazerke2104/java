// tap-2
public class tap17 {
    public static void main(String[] args) {

        int[][] matrix = {
                {3, 8, 1},
                {9, 4, 6},
                {7, 2, 5}
        };

        for (int i = 0; i < matrix.length; i++) {
            int max = matrix[i][0];

            for (int j = 1; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }

            System.out.println(i + "-жолдың ең үлкен элементі: " + max);
        }
    }
}