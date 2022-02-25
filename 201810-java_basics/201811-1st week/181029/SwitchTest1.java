import java.util.Scanner;
class SwitchTest1
{
	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.out);
	int x = sc. nextInt();
	
/*
	if (x == 1)
	{
		System.out.println("1번을 선택하였습니다.");
	}
	else if (x == 2)
	{
		System.out.println("2번을 선택하였습니다.");
	}
	else if (x == 3)
	{
		System.out.println("3번을 선택하였습니다.");
	}
	else
	{
		System.out.println("기타를 선택하였습니다.");
	}
아래랑 똑같은 기능의 코딩
*/

	switch (x) //int 또는 string의 결과를 내는 식.
	{
		case 1 :
			System.out.println("1번을 선택하였습니다.");
		break;
		case 2 :
			System.out.println("2번을 선택하였습니다.");
		break;
		case 3 :
			System.out.println("3번을 선택하였습니다.");
		break;
		default :
			System.out.println("기타를 선택하였습니다.");
/*default 이후 break;는 있어도 되고 없어도 되고~
switch 메서드 안에서는 case들 간의 순서는 상관 없음.
오히려 반대로 default부터 나와도 똑같음.
case 1 : 
Case 2 :
	{ A }
이러면 'case 1 또는 case 2 일 때 { A }하라.' 라는 뜻
*/
		System.out.println("Hello World!");
	}
}
