
import java.util.Scanner;

//초단위를 시간,분,초로 환산 (산술 연산자) 
public class OperatorTest1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int time, hour, minute, sec;
		
		System.out.print("시간을 초 단위로 입력하세요 : ");
		time = input.nextInt();
		
		sec = time;
		hour = sec / 3600;
		sec = sec % 3600;
		minute = sec / 60;
		sec = sec % 60;
		
		System.out.println(time + "초는 " + hour + "시간 " + minute + "분 " + sec + "초입니다.");
	}
}
