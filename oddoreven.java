import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = scan.nextInt();
        scan.close();

        int a = num % 2;

        switch (a) {
            case 0:
                System.out.println("Number is even");
                break;
            case 1:
                System.out.println("Number is odd");
                break;
            default:
                System.out.println("Invalid input");
        }
    }
}
