package chap04;

public class Lab_Advanced_158p {

	public static void main(String[] args) {
		double[] numbers = { 0.0, 0.1, 0.2, 0.3, 0.4, 0.5, 0.6, 0.7, 0.8, 0.9 };
		
		for ( int i = 0; i < numbers.length; i++)
		{
			if (numbers[i] == 0.9)
			{
				System.out.print(numbers[i]);
			}
			else
			{
				System.out.print(numbers[i] + ", ");
			}
		}
	}
}