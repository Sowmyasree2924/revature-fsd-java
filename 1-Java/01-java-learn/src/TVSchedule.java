
public class TVSchedule {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int date = 2;
        while (date <= 31) {
        	System.out.println(date);
        	date = date + 3;
        }
        System.out.println("using do.. while loop");
        date = 2;
        do {
        	System.out.println(date);
        	date = date + 3;
        } 
        while (date <= 31);
        	System.out.println("using for loop");
        for(date = 2; date <= 31; date = date + 3) {
        	System.out.println(date);
        }
        	
	}

}
