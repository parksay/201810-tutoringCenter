import java.util.Scanner;
class DayCalcul2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int  x, y, d, date1, date2;
		System.out.print("���� ��¥�� �Է��ϼ���. �⵵: ");
		x = sc. nextInt();
		System.out.print(",  ��¥�� �Է��ϼ���. ��: ");
		y = sc. nextInt();
		System.out.print(",  ��¥�� �Է��ϼ���. ��: ");
		d = sc. nextInt();
		date1 =	DayCalcul.CalDay(x,y,d);

		System.out.print("\n���� ��¥�� �Է���td t����. �⵵: ");
		x = sc. nextInt();
		System.out.print("\n��¥�� �Է��ϼ���. ��: ");
		y = sc. nextInt();
		System.out.print("\n��¥�� �Է��ϼ���. ��: ");
		d = sc. nextInt();
		date2 =	DayCalcul.CalDay(x,y,d);

		System.out.println(date2 - date1 + 1);
		System.out.println("Hello World!");
	}
}
