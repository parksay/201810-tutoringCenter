import java.util.Scanner;
class  ReviewTest4
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("길이 입력 (Cm단위): ");
		int cm;
		cm = sc. nextInt();
		double inch;
		inch = cm * 0.393;
		System.out.println(cm + " Cm= " + inch + " inch");
		System.out.println("Hello World!");
	}
}
