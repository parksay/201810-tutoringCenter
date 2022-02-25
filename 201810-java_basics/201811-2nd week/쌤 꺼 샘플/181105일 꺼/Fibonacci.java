/*
	for문을 이용하여 Fibonacci 수열을 10개 출력하시오.
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
