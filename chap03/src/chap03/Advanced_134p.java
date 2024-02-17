package chap03;

import java.util.*;

public class Advanced_134p {

	public static void main(String[] args) {
		long fact = 1;
		int n;
		
		System.out.println("정수를 입력하시오: ");
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		
		for (int i = 1; i <= n; i++)
		{
			fact = fact * i;
		}
		
		System.out.printf("%d!의 결과: %d", n, fact);
	}

}
