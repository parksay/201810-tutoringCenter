
import java.util.Scanner;

//정수를 10번 반복 입력받아 그 중 3의 배수의 개수를 구한다.
public class CountTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n;
		int cnt = 0;
		
		for (int i = 0; i < 10; i++) {
			System.out.print("정수 입력 : ");
			n = input.nextInt();
			if (n % 3 == 0) {
				cnt++;
			}
		}
		
		System.out.println("3의 배수 개수 : " + cnt);

	}

}
