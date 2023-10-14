package tutorial;
import java.util.Scanner;
public class CheckTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Sides of Triangle:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(a==b && b==c) {
			System.out.println("Triangle is Equilateral Triangle");
			//All the sides are equal
		}
		else if(a==b||b==c||c==a) {
			System.out.println("Triangle is isosceles Triangle");
			//Two or more sides are equal
		}
		else {
			System.out.println("Triangle is scalene Triangle");
			//none of the side are equal
		}
	}

}
