import java.util.Scanner;
class  PrintTest
{
	public static void main(String[] args) 
	{
		int a= 94;
		char b = 'b';
		System.out.println(a + b); //유니코드로 변환된 상수
		System.out.println(b + "" ); //유니코드에 해당하는 문자
		System.out.println("a= " + a); //" a= 문자"
		System.out.println("1" + 2 + 3); // " 123"
		System.out.println(3 + 2 + "2"); // " 5 + 2 " 
		System.out.println( (char) (a + b) ); // 유니코드에 해당하는 문자
		System.out.println( (char) a + "" + b ); // 문자 b
		System.out.println("" + a + b); // ab
		/* ' + ' 기준으로 
		-양쪽에 int면 그냥 진짜 더하기야
		-양쪽에 char면, ' + ' 연산을 수행하기 위해, 둘 다 int로 변환해서 처리.
		-String 타입이나 " " 안에 들어가 있는 문자열이 온다면 그냥 그대로 붙여서 읽어줌
		-' + ' 기준으로 양쪽에 char 와 " " 가 있어. 그러면 " " 로 인해서, 덧셈 연산을
		진행하는 게 아니므로, char는 그대로 문자로 나오고, 뒤에다가 문자열을 따라서 붙여 줌.
		-' + ' 기준으로 양쪽에 int 와 " " 가 있어. 그러면 " " 로 인해서, 덧셈 연산을
		진행하는 게 아니므로, int는 그대로 숫자로 나오고, 뒤에다가 문자열을 따라서 붙여 줌.
		-int + char 라면, 연산하려면 두 자료형 통일 시켜줘야. 둘 중 큰 자료형 쪽으로
		자동 변환. 즉, char에 해당하는 유니코드 숫자와 int를 ' + '연산 해서 int로 출력.
		-따라서 int였던 a를 char로 강제 변환해서 (char) a + b 이러면,
		a를 char로 강제 변환한 후에, b와 ' + ' 연산 수행하는 과정에서 둘이 다시
		int로 자동 변환됨. 즉, 처리 우선 순위가 다음과 같음
		a를 char로 강제 변환, a와 b를 +.
		*/
		
		//아래는 string 자료형 입력받아 오기
		Scanner sc = new Scanner(System.in);
		String m = "멍청이";
		String n;
		n = sc. nextLine();
		System.out.println(m +"  "+ n + "  이지롱~");
		System.out.println("Hello World!");
	}
}
