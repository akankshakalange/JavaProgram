package tutorial;
import java.util.Scanner;
public class TriangleValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Sides of Triangle:");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(a+b>=c && a+c>=b && b+c>=a) {
			System.out.println("The triangle with sides "+a+" , "+b+" , "+c+" is valid");
		}
		else {
			System.out.println("The triangle with sides "+a+" , "+b+" , "+c+" is not valid");
		}
		
	}

}
