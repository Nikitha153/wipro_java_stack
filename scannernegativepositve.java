import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        System.out.println("enter a number:");
        int num = Scan.nextInt();
        Scan.close();
        int a=num;
        if(a>0){
        System.out.println("positive");
    }else if(a<0){
        System.out.println("negative");
    }else{
        System.out.println("zero");
    }
}
    }
