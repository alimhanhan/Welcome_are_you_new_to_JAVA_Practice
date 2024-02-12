package chap02;

public class Lab_Advanced_73p {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double rocket_speed = 60000;
		double distance = 40e12;
		
		double secs;
		secs = distance/rocket_speed;
		
		double light_year = secs/(60.0*60.0*24.0*365.0);
		
		System.out.println("소요 시간은 " + light_year + "광년입니다.");
	}
}