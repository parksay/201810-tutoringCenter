import java.util.Scanner;
class  UCTable1
{
	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);

/*
//int로 받아서 출력할 때만 char로 변환해서 해당 부분만 char로 출력
	int fcr, scr, c;
	c = 0;
	fcr = sc. nextInt();
	scr = sc. nextInt();
	for ( ; fcr <= scr; fcr = fcr + 1)
	{
		System.out.print(fcr + ": " + (char)fcr + "  |  ");
		c = c + 1;
		if ( c % 5 == 0)
		{
			System.out.print("\n");
		}
	}
//for문 증감식은 등식으로 쓰기.

*/

//쌤 코드 
	char a, b, i;
	a = (char) sc. nextInt();
	b = (char) sc. nextInt();
	

	for ( ; a < b; a = (char)(a + 1))
	{
		System.out.println((int)a + " : " + a);
	}

		System.out.println("Hello World!");
	}
}
