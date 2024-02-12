package chap02;
import java.util.*;

public class Lab_Advanced_99p {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double w, h, area, perimeter;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("사각형 가로: ");
		w = input.nextInt();
		System.out.print("사각형 세로: ");
		h = input.nextInt();
		
		area = h * w;
		perimeter = 2.0 * (w + h);
		
		System.out.println("\ns" + "사각형 넓이: " + area);
		System.out.println("사각형 둘레: " + perimeter);
		
		System.out.println("사각형의 넓이는 " + area + "이고, 둘레는 " + perimeter + "이다.");
	}
}