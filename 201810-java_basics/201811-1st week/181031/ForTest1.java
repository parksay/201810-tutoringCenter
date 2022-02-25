import java.util.Scanner;
class ForTest1  
{
	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
	int i, n, s;
	i = 1;
	for ( ; i <= 6; i = i + 1)
	{
		System.out.print("정수" + i + "번 째 입력 : ");
		n = nextInt();
		s = s + n;
	}
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
