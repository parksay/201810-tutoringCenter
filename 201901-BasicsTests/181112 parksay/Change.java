import java.util.Scanner;
class Change
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("원 단위 금액 입력 : ");

		int money = sc. nextInt();	
		if (money < 1)
		{
			System.out.print("잘못 입력하셨습니다");
			return;
		}

		System.out.print("환전할 화폐 선택(1:달러, 2:엔화, 3:유로화): ");

		int choice;
		int change;
		choice = sc. nextInt();
		switch ( choice )
		{
		case 1 : System.out.print(money + "원은 " + money/1000*0.9 + "달러입니다"); break;
		case 2 : System.out.print(money + "원은 " + money/1000*102 + "엔화입니다"); break;
		case 3 : System.out.print(money + "원은 " + money/1000*0.78 + "유로화입니다"); break;
		default : System.out.println("잘못 입력하셨습니다"); return;
		}

		System.out.println("\nHello BIG World!");
	}
}
