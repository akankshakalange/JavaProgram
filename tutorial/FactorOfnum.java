package loop;

import java.util.Scanner;

public class FactorOfnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc=new Scanner(System.in);
		//int num=sc.nextInt();
		int count=0;
		int k=0;
		for(int j=100;j>=1;j--) {
			count=0;
		for(int i=1;i<=j;i++) {
			if(j%i==0) {
				//System.out.println(i);
				count=count+1;
				//System.out.println("count ="+count);
			}
			
		}
		if(count==2) {
			System.out.print(j+" ");
			k++;
			
			if(k==5) {
				break;
			}
			
		}
		
		}
	}
		

}
