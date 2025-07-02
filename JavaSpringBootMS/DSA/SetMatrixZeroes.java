package JavaSpringBootMS.DSA;

public class SetMatrixZeroes {
    public static void main(String[] args) {
        int [][] matrix = {
            {1,1,1},
            {1,0,1},
            {1,1,1}
        };

        int m = matrix.length;
        int n = matrix[0].length;

        int[] row = new int[m];
        int[] col = new int[n];

        for(int i : col){
            System.out.println(i);
        }

        for(int j : row){
            System.out.println(j);
        }
    }
}
