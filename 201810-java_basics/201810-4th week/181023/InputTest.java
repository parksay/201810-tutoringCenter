import  java.util.Scanner; //스캔 사용 준비해라
class InputTest
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in); //스캐너 생성
		char p;
		p = scan. nextLine();
		
		System.out.println(scan. nextLine() + "는 바보 똥개 멍청이");
		int x, y, z;
		x = scan. nextInt(); //정수 입력 받음
		y = scan. nextInt();
		z = x + y;
		System.out.println("둘이 더하면 " + z);

		int a, b, c;
		System.out.println("곱하기를 진행할 정수를 입력해 주세요.");
		a = scan. nextInt();
		System.out.println("곱하기를 진행할 또 하나의 정수를 입력해 주세요.");
		b = scan. nextInt();
		c = a * b;
		System.out.println("둘이 곱하면 " + c);
		
		int m, n, l;
		m = scan. nextInt();
		n = scan. nextInt();
		l = ++m * n; //이렇게 하면, 입력 받은 m에서 1을 더한 후, 입력 받은 n과 곱해라
		System.out.println("(앞 숫자 + 1) 한 거에 (뒤 숫자) 곱하면 " +l);
		
		System.out.println("Hello World!");
	}
}
