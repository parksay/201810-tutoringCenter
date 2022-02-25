
import java.util.Scanner;

//int형 변수를 선언하고 정수를 입력받아 대입. 그 수가 0보다 큰지 비교하고 그 결과를  boolean변수에 저장 (자료형, 변수)
public class VarTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		boolean result;
		
		System.out.print("정수를 입력하세요 : ");
		num = input.nextInt();
		
		result = num > 0;
		
		System.out.println("num의 값 : " + num);
		System.out.println("result의 값 : " + result);
	}

}
