import java.util.Scanner;
class IfTest3 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int y = sc. nextInt();
		
		if (y % 400 ==0)
		{
			System.out.println("윤년");
		}
		else if ( y % 4 != 0)
		{
			System.out.println("평년");
		}
		else if ( y % 4 == 0)
		{
			if (y % 100 == 0)
				System.out.println("평년");
			else
				System.out.println("윤년");
		}

/* 가르기의 문제네. 우선 가장 큰 규모에서 생각할 때, A or B 이 두 가지 경우로 나눈다면,
무엇과 무엇으로 나눌 수 있는가?
그 나눈 B에서, 다시 세분화 한다면 무엇과 무엇으로 나눌 수 있는가?
B1 or B2로 나눈다면?
그니까, 사고 방식을, 큰 규모에서부터 작은 규모로 점진하든,
작은 규모로부터 큰 규모로 점진하든, 할 수 있는 건 우선
이분법에 능숙하게 사고하기.
*/
		System.out.println("Hello World!");
	}
}
