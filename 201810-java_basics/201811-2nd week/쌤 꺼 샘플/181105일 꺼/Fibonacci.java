/*
	for���� �̿��Ͽ� Fibonacci ������ 10�� ����Ͻÿ�.
 */

public class Fibonacci {

	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 1;
		int i;
		int next = 0;
		for(i = 0; i < 10; i++) {
			next = num1 + num2;
			num1 = num2;
			num2 = next;
			System.out.print(num1 + "  ");
		}
	}
}
