import java.util.Scanner;

public class VoteEligibilityChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age:");
		age=sc.nextInt();
		if(age>=18) {
			System.out.println("can vote");	
		}
		else {
			System.out.println("cannot vote");
		}
	}

}
