//check reverse number
package loop;

import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int num;
		num=t;
		int rev=0,d;
		while(num!=0) {
			d=num%10;
			rev=rev*10+d;
			num=num/10;
		}
		System.out.println(rev);
		if(num==rev) {
			System.out.println(num+" is a pallindrome");
		}
		else {
			System.out.println("not pallindrome");
		}
	}

}
