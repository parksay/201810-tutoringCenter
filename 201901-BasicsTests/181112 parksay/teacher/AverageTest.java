

import java.util.Scanner;

//정수 10개를 입력받아, 평균과 10 이상 차이나는 정수들을 출력. (배열, 반복문)
public class AverageTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int array[] = new int[10];
		int tot;
		double avg, value;
		
		//입력 
		for (int i = 0; i < array.length; i++) {
			System.out.print("배열[" + i + "] : ");
			array[i] = input.nextInt();
		}

		//평균 구하기
		tot = 0;
		for (int i = 0; i < array.length; i++) {
			tot += array[i];
		}
		avg = (double) tot / array.length;
		
		//평균과 10 이상 차이나는 수 구하기
		System.out.println("평균 : " + avg);
		System.out.print("평균과 10 이상 차이나는 수 : ");
		
		for (int i = 0; i < array.length; i++) {
			value = array[i] - avg;
			if (value <= -10 || value >= 10) {
				System.out.print(array[i] + " ");
			}
		}
	}

}
