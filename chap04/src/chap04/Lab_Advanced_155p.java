package chap04;

import java.util.*;

public class Lab_Advanced_155p {

	public static void main(String[] args) {
		int STUDENTS = 1;
		int total = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("학생 수: ");
		STUDENTS = scan.nextInt();
		
		int[] scores = new int[STUDENTS];

		for (int i = 0; i < scores.length; i++)
		{
			System.out.print("성적을 입력하시오: ");
			scores[i] = scan.nextInt();
		}
		
		for (int i = 0; i < scores.length; i++)
		{
			total = total + scores[i];
		}
		
		System.out.println("평균: " + (total/STUDENTS));
	}
}