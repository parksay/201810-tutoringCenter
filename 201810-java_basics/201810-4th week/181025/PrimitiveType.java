import java.util.Scanner;
class PrimitiveType
{
	public static void main(String[] args) 
	{
		byte a;
		short b;
		int c;
		long d;
		float e;
		double f;
		char g;
		boolean h;
		a=127; /*1byte 는 2^7까지. 127까지는 딱 되지만 128되는 순간 범위 넘어.
		이진수로 나타내면 01111111(2) 야. (맨 처음은 0은 양수 1은 음수)*/
		d = 10000000000L; /* long형은 2^63 까지 가능하다며. 왜 이게 안 돼.
		d는 내가 long으로 선언했어도, 정의하는 과정에서 상수 100억을 넣으면,
		그 상수 100억을 기본 자료형인 int 형식으로 처리해서 d에다가 박아. 그니까
		처리 과정에서 걸려버리는 거야. 그래서, 이거 상수이기는 하지만, 처리 과정에서부터,
		기본값인 int말고 long으로 처리해달라고 일부러 말 해줘야 해. 그래서 끝에
		' L '을 붙여. 10000000000L 이러면 long으로 처리.*/
		c = 010;
		System.out.println(c);
		c = 0x10;
		System.out.println(c);
		e=1.5f;
		System.out.println(e);
		f=1e5;
		System.out.println(f);
		g='A';
		System.out.println(g);
		g=65;
		System.out.println(g);
		g= '\u0041' ;
		System.out.println(g);
		g= 'B' -1 ;
		System.out.println(g);
		g = 0x41 ;
		System.out.println(g);
		g = 48 ;
		System.out.println(g);
		//0은 기본값 0으로 '0'하면 유니코드? 이런 걸로 등록된 48로, "0"은 string 문자

		Scanner testin = new Scanner(System.in);
		int test;
		test = testin. nextInt();
		System.out.println( (char) (test + 1) );
		/*(char) test = A
		(char) test + 1 = 66
		(char) test + (char) test +1 = 131
		(char) test (test + 1) = B
		/*
		System.out.println(c);
*/

		System.out.println("Hello World!");
	}
}
