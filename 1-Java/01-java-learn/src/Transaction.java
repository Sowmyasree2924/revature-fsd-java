
public class Transaction {
    
	private char type;
	private double amount;
	
	//constructor
	public Transaction(char type, double amount) {
		this.type = type;
		this.amount = amount;
		
	}
	public void displayTransaction(double balance) {
		System.out.printf("%4c %12.2f %8.2f\n", type,amount,balance);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
        Transaction transaction = new Transaction('W',5000);
        transaction.displayTransaction(2000);
	}

}
