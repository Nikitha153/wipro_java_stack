import java.util.Scanner;
public class ArraysDemo{
    public static void main(String[]args){
        int[]x;
        x=new int[5];
        x[0]=11;
        x[4]=22;
        // System.out.println("Element at index 0:"+x[0]);
        // System.out.println("Element at index 1:"+x[1]);
        // System.out.println("Element at index 4:"+x[4]);
        for(int i=0;i<x.length;i++){
            System.out.println(x[i]);
        }    
     Scanner Scan=new Scanner(System.in);
     for(int i=0;i<x.length;i++){
         int a=Scan.nextInt();
         System.out.println("enter the value"+i);
         x[i]=Scan.nextInt();
     }
    }
}
