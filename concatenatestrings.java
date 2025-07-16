import java.util.*;

public class ConcatenateStrings {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String s = s1.concat(s2);
        System.out.println(s.toLowerCase());
        sc.close();
    }
}
