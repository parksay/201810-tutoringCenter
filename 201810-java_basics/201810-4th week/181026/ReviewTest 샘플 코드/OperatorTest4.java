
import java.util.Scanner;

//센티미터를 인치로 환산 (산술연산자) 
public class OperatorTest4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int cm;
		double inch;
		
		System.out.print("길이 입력 (Cm단위) : ");
		cm = input.nextInt();
		
		inch = cm / 2.54;
		
		System.out.print(cm + " Cm = " + inch + " inch");
	}
}
