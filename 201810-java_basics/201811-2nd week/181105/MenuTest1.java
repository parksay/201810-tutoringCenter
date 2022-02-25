import java.util.Scanner;
class MenuTest1 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int x, y;
		y = 0;
		while( y < 1)
		{
			System.out.println("[ 점심 뭐 먹을래? ]\n1.한식\n2.중식\n3.일식\n4.양식\n0.아무거나");
			x = sc. nextInt();
			switch	(x)
			{
				case 1 : System.out.println("콜"); break;
				case 2 : System.out.println("콜"); break;
				case 3 : System.out.println("콜"); break;
				case 4 : System.out.println("콜");  break;
				case 0 : y = 1; break;
			}
		}
		System.out.println("맛점하세용~");
		x = menu();
		System.out.println(x);
		System.out.println("\n");
		
		System.out.println("Hello World!");
	}
/*
메서드 이름, 특수문자는 달라, 언더바만 가능, but 웬만하면 쓰지 말긔
숫자는 맨 앞 아니면 가능, class랑 비슷
메서드는 독립적으로 성립 못해, 그 상위 개념인 class가 선행 되어야 함.
어떤 class에든지 종속돼 있어야 함.
같은 class 안에 있는 애들은 그냥 부르면 되고,
다른 class 안에 있는 애들은, class까지 포함해서 불러 줘야 하고.
*/
	public static int menu()
	{
	System.out.println("[ 점심 뭐 먹을래? ]\n1.한식\n2.중식\n3.일식\n4.양식\n0.아무거나");
	Scanner sc = new Scanner(System.in);

	int z;
	z = sc. nextInt();
	return z;
	}
}
