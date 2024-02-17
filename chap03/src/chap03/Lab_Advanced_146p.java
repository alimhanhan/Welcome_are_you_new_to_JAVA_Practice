package chap03;

import java.util.*;
import java.util.Scanner;
import java.util.random.*;

public class Lab_Advanced_146p {

	public static void main(String[] args) {
		Random generator = new Random();
		int answer = generator.nextInt(100);
		int guess;
		
		Scanner scan = new Scanner(System.in);
		int tries = 0;
		
		do {
			System.out.print("정답을 추측해보세요: ");
			guess = scan.nextInt();
			tries++;
			
			if(guess > answer)
			{
				System.out.println("제시한 정수가 높습니다.");
			}
			
			if (guess < answer)
			{
				System.out.println("제시한 정수가 낮습니다.");
			}
		} while (guess != answer);
		
		System.out.printf("%d번의 시도 끝에 정답을 맞히셨습니다!", tries);
	}
}