import java.util.Scanner;
class ReviewTest2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int k, e, m, tt;
		double avg;

		System.out.print("국어 점수: ");
		k = sc. nextInt();
		System.out.print("영어 점수: ");
		e = sc. nextInt();
		System.out.print("수학 점수: ");
		m = sc. nextInt();

		tt = k + e + m;
		avg = tt / (double)3;
		System.out.println("총점: " + tt + "\n평균: " + avg);		
		System.out.println("Hello World!");
	}
}
