import java.util.Scanner;
class JvTest2 
{
	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
	int x, n, i;
	i = 1;
	n = 0;
	for ( ; i <= 10; i = i + 1)
	{
		System.out.print("정수 입력 : ");
		x = sc. nextInt();
		if (x % 3 == 0)
		{
			n = n + 1;
		}
	}
	System.out.println("3의 배수의 개수" + n + "개");
		System.out.println("Hello World!");
	}
}
