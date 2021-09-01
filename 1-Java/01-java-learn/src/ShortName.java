import java.util.Scanner;

public class ShortName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Text Input is:");
		String name=sc.nextLine();
		
		if((name.length()>=2) && (name.length()<=6))
		{
			System.out.println("This is a valid shortname");
		}
		else
		{
			System.out.println("This is NOT a valid shortname");
		}

	}

}
