package loop;

import java.util.Scanner;

public class SumOfFibEvenOddSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float sum=0.0f;
		int i=1,fact=1;
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		for(i=1;i<=num;i++) {
			fact=fact*i;
			
			if(i%2==0) {
				sum=sum-(float)1/fact;
			}
			else {
				sum=sum+(float)1/fact;
			}
			
		}
		
		System.out.println(sum);
	}

}
