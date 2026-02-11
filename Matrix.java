import java.util.Scanner;

public class Matrix{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int size;
        System.out.print("Enter order of square matrix: ");
        size = scanner.nextInt();
        int[][] matrix = new int[size][size];

        for(int i = 0; i<size; i++){
            System.out.printf("Enter %d row: ",i+1);
            for(int j = 0; j<size; j++){
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Matrix: ");
        for(int i = 0; i<size; i++){
            for(int j = 0; j<size; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }

        scanner.close();
    }
}