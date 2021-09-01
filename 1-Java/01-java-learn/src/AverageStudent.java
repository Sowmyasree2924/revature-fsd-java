import java.util.Scanner;

public class AverageStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int score;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the score:");
score=sc.nextInt();
if (score >= 60 && score <= 70) {
	System.out.println("Average student");
}
	else
	{
		System.out.println("not an average student");
	}

	
	}

}
