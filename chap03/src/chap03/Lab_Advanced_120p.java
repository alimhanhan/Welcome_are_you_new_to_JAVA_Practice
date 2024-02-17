package chap03;
import java.util.*;

public class Lab_Advanced_120p {

	public static void main(String[] args) {
		int month;
		int days = 0;
		
		System.out.println("일수를 알고 싶은 월을 입력하시오:");
		Scanner scan = new Scanner(System.in);
		
		month = scan.nextInt();
		switch (month)
		{
		case 4:
		case 6:
		case 9:
		case 11:
			days = 30;
			break;
		case 2:
			if(month % 400 == 0)
			{
				days = 29;
			}
			else if((month % 4 == 0) && (month % 100 != 0))
			{
				days = 29;
			}
			else
			{
				days = 28;
			}
			break;
		default:
			days = 31;
			break;
		}
		System.out.println(month + "월의 날수는 " + days);
	}
}