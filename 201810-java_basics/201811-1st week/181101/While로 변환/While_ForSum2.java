import java.util.Scanner;
class While_ForSum2
{
	public static void main(String[] args) 
	{
/*
5개의 정수를 받아서 합계를 구하지만,
음수는 계산에 포함하지 않으면서,
어찌됐든 간에, 정수 5개는 모두 받아 내기.

	Scanner sc = new Scanner(System.in);
	int a, i, s, n;
	i = 1;
	s = 0;

	for ( ; i <= 5; i = i + 1)
	{
		System.out.print(i + "번 째 정수 입력 : " );
		n = sc. nextInt();
		if(n < 0)
		{
			i = i - 1;
			n = 0;
		}
		s = s + n;
	}	

//또 다른 for 구문으로 나타내 보기.

	for ( ; i <= 5;)
	{
		System.out.print(i + "번 째 정수 입력 : " );
		n = sc. nextInt();

		if(n < 0)
		{
			continue;
		}
		i = i + 1;
		s = s + n;
	}	
	System.out.println("입력값들의 총 합은 : " + s);
/*
증감식을 비워놓고, for 구문의 실행문 안으로 넣어도 됨.
조건문을 만족할 때 실행되는 연산 안에 포함해 놓고, 증감식 자리는 비워 놔도 됨.
그럴 경우엔, for 구문 실행 중에 특정 조건을 만났을 때만 횟수를 인정하고
특정 조건일 때는 횟수를 인정해주지 않는(횟수에 포함해주지 않는) 코딩을 짜기가 쉽지
*/
	Scanner sc = new Scanner(System.in);
	int x, s, i;
	i = 1;
	s = 0;

	while (i < 6)
	{
		System.out.print(i + "번째 정수 입력 : ");
		x = sc. nextInt();
		if ( x > 0)
		{
			s = s + x;
			i = i + 1;
		}
	}
	System.out.println("입력한 값 모두 더하면 : " + s);

	System.out.println("Hello World!");
	}
}
