//program to find armstrong no
package loop;
import java.lang.Math;
import java.util.Scanner;

public class ArmstrongNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc=new Scanner(System.in);
		//int num=sc.nextInt();
		int t,d,sum,count=0;
		//t=num;
		int k=0;
		for(int i=1;i<1000;i++) {
			t=i;
			count=0;
			sum=0;
		while(t>0) {
			t=t/10;
			count++;
			//count will found how many digits in number
		}
		t=i;
		while(t>0) {
			d=t%10;
			sum+=(Math.pow(d, count));
			t=t/10;
			
		}
		if(i==sum) {
			System.out.println(i+" is a armstrong no");
			k++;
			if(k==1000)
				break;
		}
		
	}

}
}
