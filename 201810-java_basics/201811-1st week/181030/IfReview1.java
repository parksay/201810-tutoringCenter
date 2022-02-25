import java.util.Scanner;
class IfReview1
{
	public static void main(String[] args) 
	{
//세 정수를 받아서 그 중 가장 큰 수 출력하기
	Scanner sc = new Scanner(System.in);
	int a, b, c;
	a = sc. nextInt();
	b = sc. nextInt();
	c = sc. nextInt();
/*	
	if (a > b)
	{
		if (a > c)
		{
		System.out.println("가장 큰수는" + a);
		}
		else if (a < c)	
		{
		System.out.println("가장 큰 수는" + c);
		}
	}
	if ( a < b)
	{
		if (b > c)
		{
		System.out.println("가장 큰수는" + b);
		}
		else if (b < c)	
		{
		System.out.println("가장 큰 수는" + c);
		}
	}
이거는, 이분법. 우선 두 수만 뽑아서 비교해 보고, 작은 수는 버리고 큰 수만 가지고 와서
아직 비교하지 않은 나머지 한 수랑 아까 비교했던 큰 수랑 다시 비교. 총 4가지 경우.
*/

/*
	int d;
	d = a > b ? a : b ;
	if ( c > d)
	{
	System.out.println( "가장 큰 수는 " + c);
	}
	else if (c < d)
	{
	System.out.println( "가장 큰 수는 " + d);
	}

정수 하나 더 준비해서, 둘 중 큰 수를 거기다 넣고 나면,
클 때, 작을 때 두 경우만 서술하면 됨.
응용력이 중요하네. 뭐 하나 배웠다고 그거만 가지고 어떻게 해보려고 하면,
시야가 좁아짐. 사고의 범위? 폭이 좁아짐.
*/

	int d;
	d = a;
	if ( d < b);
	{
	d = b;
	}
	if ( d < c);
	{
	d = c;
	}
	System.out.println("가장 큰 수는 " + d);
	
/*
새로운 정수 하나 정의하고, if로 비교해서 비교 대상이 큰 경우일 때만 취하고
더 작은 경우일 때면 버리고, 그런 작업을 반복
*/
		System.out.println("Hello World!");
	}
}
