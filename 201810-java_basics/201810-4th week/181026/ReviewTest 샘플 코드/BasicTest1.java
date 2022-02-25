
import java.util.Scanner;

//국영수 입력받아 합계 구하기 (산술연산자, 자료형)
public class BasicTest1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int kor, eng, mat, tot;
		double avg;
		
		System.out.print("국어 점수 : ");
		kor = input.nextInt();
		System.out.print("영어 점수 : ");
		eng = input.nextInt();
		System.out.print("수학 점수 : ");
		mat = input.nextInt();
		
		tot = kor + eng + mat;
		avg = tot / 3.0;
		
		System.out.println("총점 : " + tot + " 평균 : " + avg);
	}

}
