import java.util.Scanner;
class ForSum1  
{
	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
	int i, n, s;
	i = 1;
	s = 0;
	for ( ; i <= 5; i = i + 1)
	{
		System.out.print("정수" + i + "번 째 입력 : ");
		n = sc. nextInt();
		if (n == 0)
		{
			i = 6;
		}
		if (n < 0)
		{
			n = 0;
		}
/* 음수를 입력 받으면, 합계 내는 데에서 제외.
만약 끝내는 if구문과 제외하는 if구문의 자리를 서로 바꾸면,
합계에서 제외하기 위해 n = 0으로 바꿔 버려서,
아래 끝내는 if 구문의 조건을 충족해버리기 때문에,
음수 입력 -> 끝내기 가 되어버림.
*/
		s = s + n;
	}
/*
입력 받다가 0 입력하면 반복문을 끝내도록.
if 실행문 안에 break; 넣어도 됨
*/
	System.out.println("합계는" + s);
/* 
사고 방식이, n1, n2, n3.... 모두 구해서 다 더한다!
이런 것에만 익숙해져 있는데, 우리가 for 구문 쓸 때는
매 회마다 반복하는 형태로는 어떻게 나타낼 수 있을까
하는 방식으로 생각해 봐야 함.
*/
		System.out.println("Hello World!");
	}
}
