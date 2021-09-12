
public class AccountManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String accountNumber = "01302343794";
        double balance = 5000.0;
   
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        System.out.println("Account statement of" + accountNumber);
        System.out.println("Initial Balance:" + balance);
        
        System.out.println("\n----------------------");
        System.out.println(" type transaction balance");
        System.out.println("----------------------");
        
        char type = 'W';
        double transaction =2000.0;
        balance = balance - transaction;
        System.out.printf("%4c %12.2f %8.2f\n", type, transaction,balance);
        
        type = 'D';
         transaction =2000.0;
        balance = balance - transaction;
        System.out.printf("%4c %12.2f %8.2f\n", type, transaction,balance);
        
        type = 'D';
        transaction =500.0;
       balance = balance - transaction;
       System.out.printf("%4c %12.2f %8.2f\n", type, transaction,balance);
       
       type = 'W';
       transaction =15500.0;
      balance = balance - transaction;
      System.out.printf("%4c %12.2f %8.2f\n", type, transaction,balance);
      
      type = 'W';
      transaction =10000.0;
     balance = balance - transaction;
     System.out.printf("%4c %12.2f %8.2f\n", type, transaction,balance);
     
     System.out.println("----------------------");
	}
	

}
