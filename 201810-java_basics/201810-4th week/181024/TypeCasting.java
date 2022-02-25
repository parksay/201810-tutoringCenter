import java.util.Scanner;
class  TypeCasting //자료형 변환
{
	public static void main(String[] args) 
	{
		Scanner hi = new Scanner(System.in);
		int a, b, c, d;
		double m;
		a = hi. nextInt();
		b = hi. nextInt();
		c = hi. nextInt();
		d = hi. nextInt();
		m = (double)(a + b + c +d) / 4 ; //분자 강제 변환
		m = (a + b + c + d) / (double)4; //분모 강제 변환
		m = (a + b + c + d) / 4.0 ; //분모 자동 변환

			/*이렇게 하면, m의 값은, 지도 double로 표현하고 싶지만, 우변에서 모든 값이
		 int야. a,b,c,d 다 int로 받았고, 나누는 수도 자동으로 기본 설정 int이고. 그래서
		 소수점 이하가 나올 수 있는 수라도, 소수점 이하가 절사돼서 나와. (나오는 값은
		 마치 double 처럼 나올 거야. x.0 이런 식으로. 근데 그게 소수점 이하가 잘려 있는
		 상태로, ' .0 ' 만 붙는 거야.) 따라서 우변도 double로 바꿔 줘야 해.
		 방법이 두 가지야. 첫째, 나누는 수를 4.0 이런 식으로 써서, 기본 설정 double로
		 되도록 만드는 거. 그럼 연산하는 과정에서 자료형을 double 로 맞춰서 계산.
		 둘째, 나눠지는 수를 double 로 강제 변환. (double)(a + b + c + d)/4 이런 식으로.
		 */
		System.out.println(m);
		System.out.println("Hello World!");
	}
}
