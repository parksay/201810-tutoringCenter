import java.util.Scanner;
class DayCalcul2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int  x, y, d, date1, date2;
		System.out.print("시작 날짜를 입력하세요. 년도: ");
		x = sc. nextInt();
		System.out.print(",  날짜를 입력하세요. 월: ");
		y = sc. nextInt();
		System.out.print(",  날짜를 입력하세요. 일: ");
		d = sc. nextInt();
		date1 =	DayCalcul.CalDay(x,y,d);

		System.out.print("\n현재 날짜를 입력하td t세요. 년도: ");
		x = sc. nextInt();
		System.out.print("\n날짜를 입력하세요. 월: ");
		y = sc. nextInt();
		System.out.print("\n날짜를 입력하세요. 일: ");
		d = sc. nextInt();
		date2 =	DayCalcul.CalDay(x,y,d);

		System.out.println(date2 - date1 + 1);
		System.out.println("Hello World!");
	}
}
