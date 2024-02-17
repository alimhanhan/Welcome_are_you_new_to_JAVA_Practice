package chap03;

import java.util.*;

public class Lab_Advanced_148p {

	public static void main(String[] args) {
		int odds = 1;
        final int n = 45;
        final int k = 6;
        final int matchingNumbers = 3;

        for (int i = 1; i <= matchingNumbers; i++) {
            odds = odds * (k - i + 1) / i;
        }

        int remainingNumbers = k - matchingNumbers;
        int remainingBalls = n - k;

        for (int i = 1; i <= remainingNumbers; i++) {
            odds = odds * (remainingBalls - i + 1) / i;
        }

        System.out.println("로또 5등 당첨 확률: 1/" + odds);	
	}
}
