package com.edu;

import java.util.Scanner;

class MyException extends Exception{
	public MyException(String s) {
		super(s);
	}
}
public class Source2 {
	public void checkAge(int age) {
		try {
			if(age<15) {
				throw new MyException("invalid");
			}
			else {
				System.out.println("Valid");
			}
		}
		catch(MyException e) {
			 e.printStackTrace();;
		}
		
		
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		Source2 obj=new Source2();
		obj.checkAge(age);
		
	}

}
