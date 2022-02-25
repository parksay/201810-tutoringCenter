import java.util.Scanner;
class SwitchTest3 
{
	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
	String opr;
	System.out.print("연산자를 선택해 주세요 (+, -, *, /) : ");
	opr = sc. nextLine();
	int x, y;
	System.out.print("첫 번째 정수를 입력해 주세요 : ");
	x = sc. nextInt();
	System.out.print("두 번째 정수를 입력해 주세요 : ");
	y = sc. nextInt();
	switch (opr)
	{
		case "+" :
			System.out.println(x + " " + opr + " " + y + " = " + (x + y));
		break;
		case "-" :
			System.out.println(x + " " + opr + " " + y + " = " + (x - y));
		break;
		case "*" :
			System.out.println(x + " " + opr + " " + y + " = " + (x * y));
		break;
		case "/" :
			if (y == 0)
			{
			System.out.println("수학적으로 불가능한 연산입니다");
			}
			else
			{
			System.out.println(x + " " + opr + " " + y + " = " + (x / y));
			}
		break;
		default :
			System.out.println("올바른 연산자를 선택해주세요.");

	}
		System.out.println("Hello World!");
	}
}
