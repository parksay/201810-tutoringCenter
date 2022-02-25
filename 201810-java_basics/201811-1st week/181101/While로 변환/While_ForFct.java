import java.util.Scanner;
class While_ForFct
{
/*
입력한 두 수를 받아서, 두 수 사이의 숫자들을 모두 곱하는
팩토리얼을 구하고 싶어.
근데, 10만 넘어가도, 산술급수적으로 값이 증가하기 때문에,
말도 안 되게 커져. 따라서 자료형에 신경 써야 해.
그냥 두면 int로 기본 설정 돼 있어서, 범위 넘어감.
*/
	public static void main(String[] args) 
	{


/*
		Scanner sc = new Scanner(System.in);
		double x, y, z, ft;
		ft = 1.0;
		x =	sc. nextInt();
		y =	sc. nextInt();

		if( y > x)
		{
			z = x;
			x = y;
			y = z;
		}

		for ( ; y <= x; y = y + 1)	
		{
			ft = (double)(ft * y);
		}
		System.out.println(ft);
*/
//위의 for 구문을 while 구문으로 바꿨을 때 짜보기

		Scanner sc = new Scanner(System.in);
		int x, y, z;
		double ft;
		x = sc. nextInt();
		y = sc. nextInt();
		ft = 1.0;
		if(y > x)
		{
			z = x;
			x = y;
			y = z;
		}
			
		while(y <= x)
		{
			ft = ft * (double)y;
			y = y + 1;
		}
		System.out.println("두 수 사이의 모든 수를 곱하면 : " + ft);


		System.out.println("Hello World!");
	}
}
