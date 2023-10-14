package tutorial;
import java.util.Scanner;
public class CalProfitLoss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int profit,loss;
		System.out.println("Enter selling price:");
		
		Scanner sc = new Scanner(System.in);
		int selling_price = sc.nextInt();
		System.out.println("Enter Cost price:");
		int cost_price = sc.nextInt();
		profit = selling_price - cost_price;
		loss =cost_price - selling_price;
		if(selling_price > cost_price) {
			System.out.println(profit+" Profit");
		}
		else if(cost_price >selling_price) {
			System.out.println(loss+" Loss");
		}
		else {
			System.out.println("There is neither profit or loss");
		}
		
		
	}

}
