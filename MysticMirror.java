import java.util.Scanner;

public class MysticMirror {

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        
        int[][] matrix = new int[rows][cols];

      
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        
        int[][] reversedMatrix = new int[rows][cols];
        
       
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                reversedMatrix[i][j] = matrix[rows - 1 - i][cols - 1 - j];
            }
        }

      
        System.out.println("The reversed matrix is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(reversedMatrix[i][j] + " ");
            }
            System.out.println();
        }

        
        scanner.close();
    }
}
