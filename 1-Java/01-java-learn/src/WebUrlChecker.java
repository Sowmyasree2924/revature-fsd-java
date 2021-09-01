import java.util.Scanner;

public class WebUrlChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the website address:");
		String url=sc.nextLine();
		if (url.startsWith("http://") || url.startsWith("https)://"))
		{
			System.out.println("This is a web URL");
			
		}else {
			System.out.println("This is a NOT a web URL");
		}
	}

}
