package wrapper;
import java.util.Scanner;
public class Wrapper1 {

	public static void main(String[] args) {
				Scanner sc=new Scanner(System.in);   
				      System.out.print("Enter an integer: ");
				     int a = sc.nextInt();

				     if (a < -25 || a > 255) {
				           System.out.println("Invalid input.");
				     }
				      else {
				        String binary = String.format("%8s",Integer.toBinaryString(a)).replace(' ','0');
				        System.out.println("Binary:" + binary);
				     }
				        sc.close();
				   }
				}

