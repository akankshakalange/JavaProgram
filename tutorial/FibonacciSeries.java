package loop;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, f1=1,f2=1,fib;
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		System.out.print(f1);
		System.out.print(f2);
		for(i=1;i<num-2;i++) {
			fib=f1+f2;
			f1=f2;
			f2=fib;
			System.out.print(fib);
		}
	}

}
