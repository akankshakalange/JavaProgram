package loop;

import java.util.Scanner;

public class SumOfSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float sum=0.0f;
		int i=1;
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		for(i=1;i<=num;i++) {
			if (i%2==0) {
				sum=sum-(float)1/i;
			}
			else {
				sum=sum+(float)1/i;
			}
			
			
		}
		System.out.println(sum);
	}

}
