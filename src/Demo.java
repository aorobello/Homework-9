import java.util.ArrayList;
import java.util.Scanner;

public class Demo {


	private static Scanner input;

	public static void main(String[] args) {

		input = new Scanner(System.in);
		ArrayList<String> numberList = new ArrayList<String>();


		System.out.println("Enter a set of numbers to calculate the Mean, Median and Mode on. "
				+ "When you're finished, please enter 'done' ");

		while(input.next() != "done"){
			System.out.print("Please enter a number: ");
			numberList.add(input.next());
		}



		double[] numberArray = new double[numberList.size()];
		 for (int i = 0; i < numberArray.length; i++) {
		 	 numberArray[i] = Double.parseDouble(numberList.get(i));
		 }

		System.out.println("The Mean of the set of numbers you input is : " + MeanMedianMode.getMean(numberArray));
		System.out.println("The Median of the set of numbers you input is : " + MeanMedianMode.getMedian(numberArray));
		System.out.println("The Mode of the set of numbers you input is: " + MeanMedianMode.getMode(numberArray));


	}

}
