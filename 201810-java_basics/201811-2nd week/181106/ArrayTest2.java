import java.util.Scanner;
class ArrayTest2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int array[];
		int i, sum;
		array = new int[10];
		for(i = 0; i <= 9; i = i + 1)
			{
				array[i] = sc. nextInt();
			}
		for(i = 0; i <= 9; i = i + 1)
			{
				System.out.println(array[i]);
			}	
		System.out.println("\n");
//위는 10개 정의 받기 + 10개 출력

		for(i = 0; i <= array.length - 2; i = i + 1)
		{
			System.out.print(array[i] + " + ");
		}
/*
			System.out.print(array[i]);
			System.out.print(i == array.length - 1 ? " + " : " = ");
or
			System.out.print(array[i] + " + ");
			해서 10개까지 다 찍고, 다음 프린트에서 \b 하나 넣어주고 시작하기
*/

		sum = 0;
		for(i = 0; i <= array.length-1; i = i + 1)
		{
			sum = sum + array[i];
		}
		System.out.print(array[array.length-1] + " = " + sum);
		System.out.println("\n");
//위는 10개 모두 더하기 + 10개 모두 출력 + 10개 합계 출력
/*
array.length 라고 하면, 해당 어레이에 10개의 데이터를 저장해 놓았다고 했을 때,
'번호'만 놓고 보자면 0 ~ 9번까지밖에 없는 것이여. 긍께 array[array.length]하면
array[10]이 되는 거지. 따라서 array[array.length]는 없는 데이터지.
*/
		System.out.println("Hello World!");
	}
}
