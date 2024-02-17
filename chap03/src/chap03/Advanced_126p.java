package chap03;
import java.util.Scanner;

public class Advanced_126p {

	public static void main(String[] args)
	{
		int num;
		int sum = 0;
		int i = 1;
		
		System.out.print("숫자를 입력하시오: ");
		Scanner scan2 = new Scanner(System.in);
		num = scan2.nextInt();
		
		while(i <= num)
		{
			sum += i;
			i++;
		}
		
		System.out.println("1에서 " + num + "까지의 합은 " + sum + "입니다.");
	}
}