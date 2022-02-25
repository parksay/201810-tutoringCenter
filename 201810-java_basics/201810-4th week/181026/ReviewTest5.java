import java.util.Scanner;
class ReviewTest5 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int h, m, fs, as;
		fs = sc. nextInt();
		h = fs / 3600;
		as = fs - h * 3600;
		m = as / 60;
		as = fs - h * 3600 - m * 60;
		System.out.println(fs + "초는 " + h
			+ "시간 " + m + "분 " + as + "초 입니다.");

		/*
		sec = time;
		hour = sec / 3600;		//sec을 3600으로 나누고 난 몫을 취하고
		sec = sec % 3600;		//sec을 3600으로 나누고 난 나머지를 가지고 계속
		minute = sec / 60;			연산을 진행하겠다! 는 의미로 다시 정의하는 거지
		sec = sec % 60;
		*/


		System.out.println("Hello World!");
	}
}
