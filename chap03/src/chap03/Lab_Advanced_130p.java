package chap03;

import java.util.*;

public class Lab_Advanced_130p {

	public static void main(String[] args) {
		int x, y, r, w, z;
		
		System.out.print("두 개의 정수를 입하시오: ");
		Scanner scan = new Scanner(System.in);
		
		x = scan.nextInt();
		y = scan.nextInt();
		
		w = x;
		z = y;
		
		while(y != 0)
		{
			r = x % y;
			x = y;
			y = r;
		}
		
		System.out.println("최소 공배수: " + (w*z/x));
	}
}