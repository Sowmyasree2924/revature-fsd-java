
public class LinePrinter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       printLine();
       printLine(15);
       printLine(20);
       printLine(30);
	}
	public static void printLine() {
		System.out.println("----------------");
	}
	public static void printLine(int numberOfCharacters) {
		for(int i = 0; i < numberOfCharacters; i++) {
			System.out.print ("-");
		}
		System.out.println();
	}
		

}
