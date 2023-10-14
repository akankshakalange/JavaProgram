/*
 * Write a Java program to input basic salary of an employee and calculate its Gross salary according to following:
Basic Salary <= 10000 : HRA = 20%, DA = 80%
Basic Salary <= 20000 : HRA = 25%, DA = 90%
Basic Salary > 20000 : HRA = 30%, DA = 95%
 */


package tutorial;
import java.util.Scanner;

public class GrossSalaryEstimation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int HRA,DA,grosssalary;
		System.out.print("Enter Basic salary:");
		Scanner sc = new Scanner(System.in);
		int basicsalary = sc.nextInt();
		System.out.print("Enter HRA:");
		int hra_rate = sc.nextInt();
		System.out.print("Enter DA:");
		int da_rate = sc.nextInt();
		HRA = (basicsalary*hra_rate)/100;
		DA = (basicsalary * da_rate)/100;
		grosssalary = basicsalary + HRA +DA;
		System.out.println("The Gross salary of Basic salary:"+basicsalary+" ,HRA:"+HRA+" ,DA:"+DA+" is "+grosssalary);
				
				
	}

}
