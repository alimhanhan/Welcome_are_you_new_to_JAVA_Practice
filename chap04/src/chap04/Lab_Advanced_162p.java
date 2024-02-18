package chap04;

import java.util.*;

public class Lab_Advanced_162p {

	public static void main(String[] args) {
		int s[] = { 1, 2, 3, 4, 5 };
		int value, index = -1;

		Scanner scan = new Scanner(System.in);
		System.out.print("탐색할 값을 입력하시오: ");
		value = scan.nextInt();

		// 이진 탐색을 위한 탐색 범위 초기화
		int low = 0; // 탐색 범위의 가장 왼쪽 인덱스
		int high = s.length - 1; // 탐색 범위의 가장 오른쪽 인덱스

		while (low <= high) 
		{
			int mid = (low + high) / 2; // 탐색 범위의 중간 인덱스 계산

			if (s[mid] == value) 
			{ // 찾고자 하는 값과 일치하는 경우
				index = mid; // 인덱스 저장
				break; // 탐색 종료
			} 
			else if (s[mid] < value) 
			{ // 중간 값이 찾고자 하는 값보다 작은 경우
				low = mid + 1; // 탐색 범위를 오른쪽 반쪽으로 좁힘
			} 
			else 
			{ // 중간 값이 찾고자 하는 값보다 큰 경우
				high = mid - 1; // 탐색 범위를 왼쪽 반쪽으로 좁힘
			}
		}

		if (index >= 0) { // 찾은 값이 있는 경우
			System.out.println(value + "값은 " + index + "위치에 있다.");
		}
	}
}