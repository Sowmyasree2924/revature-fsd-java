import java.util.Scanner;
public class ProfitCalculatorScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner scanner=new Scanner(System.in);
System.out.println("Enter the buying price");
int buyingPrice=scanner.nextInt();
System.out.println("Enter the selling price");
int sellingPrice=scanner.nextInt();
int profit=sellingPrice-buyingPrice;

System.out.println("Profit = " + profit);
	}

}
