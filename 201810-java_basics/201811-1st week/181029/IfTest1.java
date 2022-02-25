import java.util.Scanner;
class IfTest1
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		int score = sc. nextInt();
		
/*
동급으로, '앞에 나오는 연산부터 우선순위'에 의존해서 코딩

		if (score > 100 || score < 0)
		{
			System.out.println("0~100에 해당하는 점수를 입력해주세요.");
		}
		
		if (score <= 100 && score >= 70 )
		{
			System.out.println("통과");
		}
		
		if (score >= 0 && score < 70)
		{
			System.out.println("재시험");
		}
*/

/*
이분법으로 나누어서, 둘 중 특정한 경우를 다시 세분화 해서 이분법으로 나누고,
그 과정 반복하기. - 특정 경우가 세분화될 경우, 해당 괄호 안으로 포함시키기
*/
		if (score > 100 || score < 0)
		{
			System.out.println("0~100 써주세요");
		}
		else
		{if (score >= 70)
			{ 
				System.out.println("통과");
			}
		 else if (score < 70)
			{
				System.out.println("재시험");
			}
		}
		
		System.out.println("Hello World!");
	}
}
