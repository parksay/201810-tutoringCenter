import java.util.Scanner;

//입력받은 년,월의 달력 출력하기 (배열, 반복문)
public class CalendarView {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int month[] = {31,28,31,30,31,30,31,31,30,31,30,31};	//월별 날짜수
		int y, m, d;
		int i, tot = 0;
		
		System.out.print("년 : ");
		y = input.nextInt();
		System.out.print("월 : ");
		m = input.nextInt();

		//입력년도가 윤년이면 2월을 29일로.
		if (leap(y)) month[1] = 29;

		//입력받은 월의 1일까지의 날짜수 구하기 
		//작년까지
		for (i = 1; i < y ; i++) {
			if (leap(i))	tot += 366;
			else tot += 365;
		}
		//전월까지
		for (i = 0; i < m - 1; i++) {
			tot += month[i];
		}
		//해당월의 1일더하기
		tot++;
		
		//해당월 1일의 요일 구하기. 나머지가 1이면 월요일
		d = tot % 7;

		//달력제목 출력
		System.out.println("\n\t\t\t  " + y + "년 " + m + "월\n");
		System.out.println("\t일\t월\t화\t수\t목\t금\t토");

		//1일의 출력위치를 요일만큼 띄우기
		for (i = 0; i < d; i++) System.out.print("\t");

		//해당월 달력 출력
		for (i = 1; i <= month[m - 1]; i++) {
			System.out.print("\t" + i);
			if (d++ % 7 == 6) {		//토요일까지 출력후 줄바꿈
				System.out.println();
			}
		}
		System.out.println("\n");
	}

	//윤년 여부 검사
	public static boolean leap(int y) {
		if (y%4==0 && y%100!=0 || y%400==0)
			return true;
		else
			return false;
	}
}
