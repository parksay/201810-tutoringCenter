import java.util.Scanner;

class Operator
	{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int x, y;
		x = scan. nextInt();
		y = scan. nextInt();
		
		boolean m;
		//관계연산자
			m = y == 2*x;
		System.out.println("두 배?" + m);
			m = x%2 == 0;
		System.out.println("짝수?" + m);
			m = x%2 == 1;
		System.out.println("홀수?" + m);
		//논리연산자
			m = x > 0 && y > 0;
		System.out.println("x가 양수이고, y가 양수이다?" + m);
			m = x > 0 || y > 0;
		System.out.println("x가 양수이거나, y가 양수이다?" + m);
			m = x % 2 == 0 || x % 3 == 0 || x % 5 == 0;
		System.out.println("x가 2or3or5의 배수이다?" + m);
			m = x % 3 == 0 && x % 5 == 0 ;
		System.out.println("x는 3and5의 배수이다?" + m);
			m = 0 < x && x < 100 ;
		System.out.println("x는 0과 100 사이이다?" + m);
			m = 10 > x || x > 20;
		System.out.println("x는 10과 20 사이가 아니다?" + m);
		
		int z;
		z = scan. nextInt();
			m = (z % 4 == 0 && z % 100 != 0) || (z % 400 == 0);
			/* 수학 문제랑 똑같네. 일단 문제를 명확히 이해 하고, 내가 하고 싶은 말을
			풀어서 가장 작은 논리 단위로 쪼개서 설명할 수 있도록 하고, 그걸
			수식으로 표현만 해내면 되네. */
		System.out.println("z는 윤년이냐?" + m);
		int a, b, c, d;
		
		a = 11;
		b = 5;
		c = a & b ; //이거는 비트 연산자, 2진수 비트 정보로 환원한 다음, 각 자리수의 관계에 따라
		System.out.println(c);
		d = a > b ? 1 : 0; //삼항 연산자.  조건식 ? 참일 때 : 거짓일 때
		System.out.println(d);
		System.out.println(a > b ? "크다" : "작다");
	}
}
