
public class AverageCalculatorLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub[] 
		 float[] scores = {48, 55, 92, 78, 64};
		 float total = 0.0f;
		 for (int i = 0; i <scores.length; i++) {
			total += scores[i];
		 }
		 System.out.println("Average = " + (total / scores.length)); 
		 }

	}


