package chap04;

public class Lab_Advanced_160p {

	public static void main(String[] args) {
		int s[] = { 12, 3, 14, 2, 11 };
		int max_num;
		
		max_num = s[0];
		
		for(int i = 1; i < s.length; i++)
		{
			if(s[i] > max_num)
			{
				max_num = s[i];
			}
		}
		
		System.out.print("최댓값: " + max_num);
	}
}