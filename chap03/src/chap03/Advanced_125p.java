package chap03;
import java.util.*;

public class Advanced_125p {

	public static void main(String[] args) {
		int num;
		int i = 0;
		
		System.out.print("숫자를 입력하시오: ");
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();
		
		while (i <= num - 1)
		{
			if (i == num - 1)
			{
				System.out.print(i);
				i++;
			}
			else
			{
				System.out.print(i + ", ");
				i++;
			}
		}
	}
}