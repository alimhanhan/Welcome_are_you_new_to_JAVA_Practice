package chap03;

import java.util.*;
import java.util.Scanner;
import java.util.random.*;

public class Lab_Advanced_138p {

	public static void main(String[] args) {
		Random generator = new Random();
		
		int number = generator.nextInt(6) + 1;
		
		if (number % 2 == 0)
		{
			System.out.printf("뽑은 수 %d는 짝수입니다. 승리하였습니다.", number);
		}
		else
		{
			System.out.printf("뽑은 수 %d는 홀수입니다. 패배하였습니다.", number);
		}
	}
}