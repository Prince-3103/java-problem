import java.util.Scanner;

public class reverse {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int num;
        int rev = 0;
        System.out.print("Enter number: ");
        num = scanner.nextInt();

        int temp = num;
        while(temp != 0){
            int digit = temp%10;
            rev = rev*10 + digit;
            temp /= 10;
        }
        System.out.printf("\nReverse number is %d",rev);

        scanner.close();
    }
}
