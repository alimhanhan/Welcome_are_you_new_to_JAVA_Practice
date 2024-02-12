package chap02;

public class Lab_Advanced_88p {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 1.0;
		double b = -3.0;
		double c = 2.0;
		
		double disc = b * b - (4.0 * c * a);
		double sqr = (double)Math.sqrt(disc);
		
		double r1 = (-b + sqr) / 2.0 * a;
		double r2 = (-b - sqr) / 2.0 * a;
		
		System.out.println("첫 번째 근: " + r1);
		System.out.println("두 번째 근: " + r2);
	}
}