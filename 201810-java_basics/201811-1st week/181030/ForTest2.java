import java.util.Scanner;
class ForTest2 
{
	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
	int x, y, m, n;
	x = sc. nextInt();
	y = sc. nextInt();
	m = x > y ? x : y;
	n = x < y ? x : y;

/*
아니면
if (x < y)
{
	z = x;
	x = y;
	y = z;
}
요래 해서 얘가 더 크다면, 둘이 자리 바꾸는 것까지 연산한 후에
다음 for구문 진행하라! 요렇게
*/
	for (; n < m; n = n + 1)
	{
	System.out.print(n + " ");
	}
		System.out.println("Hello World!");
	}
}
