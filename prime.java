import java.util.Scanner;

public class prime {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int num;
        boolean check = true;
        System.out.print("Enter number: ");
        num = scanner.nextInt();

        for(int i = 2; i<=(num/2); i++){
            if(num%i == 0){
                System.out.printf("%d is not a prime number.",num);
                check = false;
                break;
            }
        }

        if(check){
            System.out.printf("\n%d is Prime Number.",num);
        }

        scanner.close();
    }
}
