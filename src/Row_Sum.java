import java.util.Arrays;
import java.util.Scanner;

public class Row_Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size= scanner.nextInt();
        int size2=scanner.nextInt();
        int[][] matrix = new int[size][size2];
        int [] result = new int[size];
        for(int i=0;i<size;i++) {
            for (int j = 0; j < size2; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        for(int i=0;i<size;i++) {
            for (int j = 0; j < size2; j++) {
                result[i]+=matrix[i][j];
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
