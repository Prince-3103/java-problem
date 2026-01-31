import java.util.Scanner;

public class sum{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int num1, num2;

        System.out.print("Enter first number: ");
        num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        num2 = scanner.nextInt();

        int result = num1 + num2;

        System.out.printf("\n%d + %d = %d",num1,num2,result);

        scanner.close();
    }
}