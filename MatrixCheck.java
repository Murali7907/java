import java.util.Scanner;

public class MatrixCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of rows:");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns:");
        int cols = sc.nextInt();
        
        int[][] matrix = new int[rows][cols];
        
        System.out.println("Enter the elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        
        // Printing the input matrix
        System.out.println("Printing the input matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + "\t"); // Use print to avoid newlines
            }
            System.out.println(); // New line after each row
        }
        
        // Checking if the matrix is symmetric
        if (rows != cols) {
            System.out.println("The given matrix is not symmetric.");
        } else {
            // Directly check symmetry without using a boolean variable
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    if (matrix[i][j] != matrix[j][i]) {
                        System.out.println("The given matrix is not symmetric.");
                        return; // Exit if the matrix is not symmetric
                    }
                }
            }
            System.out.println("The given matrix is symmetric.");
        }
    }
}
