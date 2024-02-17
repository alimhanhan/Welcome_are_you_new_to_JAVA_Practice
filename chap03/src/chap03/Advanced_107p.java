package chap03;

import java.util.Scanner;

public class Advanced_107p {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x, y, min;
		
		Scanner input  = new Scanner(System.in);
		System.out.print("첫 번째 정수: ");
		x = input.nextInt();
		
		System.out.print("두 번째 정수: ");
		y = input.nextInt();
		
		if (x < y)
		{
			min = x;
		}
		else
		{
			min = y;
		}
		
		System.out.println("더 작은 수는 " + min);
	}
}
