package loop;

import java.util.Scanner;

public class SumOfFbSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float sum=0.0f;
		int i=1,fact=1;
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		for(i=1;i<=num;i++) {
			fact=fact*i;
			sum=sum+(float)1/fact;
			System.out.println(fact);
			
		}
		
		System.out.println(sum);
	}

}
