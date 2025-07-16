import java.util.Scanner;
    public class palindromecheck{
    public static void main(String[] args) {
        Scanner Sc = new Scanner (System.in);
        System.out.print("enter a string:");
        String a = Sc.nextLine();
        String b =a;
        String c = "";
        for (int i = b.length()-1;i>=0;i--){
            c +=b.charAt(i);
        }
        if (b.equals(c)){
            System.out.println("the string is palindrome");
        }else{
            System.out.println("the string is not a palindrome");
        }
    }
}
