package chap03;
import java.util.Date;

public class Lab_Advanced_112p {

	public static void main(String[] args) {
		Date date = new Date();
		int currentMonth = date.getMonth();
		
		System.out.println("현재는 " + date + "월입니다.");
		if (currentMonth == 3 | currentMonth == 4 | currentMonth == 5)
		{
			System.out.println("봄입니다!");
		}
		else if(currentMonth == 6 | currentMonth == 7 | currentMonth == 8)
		{
			System.out.println("여름입니다!");
		}
		else if(currentMonth == 9 | currentMonth == 10 | currentMonth == 11)
		{
			System.out.println("가을입니다!");
		}
		else
		{
			System.out.println("겨울입니다!");
		}
	}
}