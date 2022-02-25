import java.util.Scanner;
class IfTest2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int score = sc. nextInt();
		
		if(score < 0 || score > 100)
		{
			System.out.println("1~100");
		}
		else if(score >= 90)
		{
			System.out.println("수");
		}
		else if(score >= 80)
		{
			System.out.println("우");
		}
		else if(score >= 70)
		{
			System.out.println("미");
		}
		else if(score >= 60)
		{
			System.out.println("양");
		}		
		else
		{
			System.out.println("가");
		}		
		System.out.println("Hello World!");
	}
}
