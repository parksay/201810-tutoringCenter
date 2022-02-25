import java.util.Scanner;
class ArrayAvg
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		int[] arrinput;
		int i;
		arrinput = new int[10];

		//사용자로부터 정수 10개 입력 받기
		for(i = 0; i < 10; i = i + 1)
		{
			arrinput[i] = sc. nextInt();
		}

		//평균 구하기 위해 각 배열값들의 총합 구하기
		int sum = 0;
		for(i = 0; i < 10; i = i + 1)
		{
			sum = sum + arrinput[i];
		}
		double avg = (double)sum/10;


		//입력 받은 배열값들 모두 출력
		for(i = 0; i < 10; i = i + 1)
		{
			System.out.println("배열[" + i + "]: " + arrinput[i]);
		}


		System.out.println("\n평균: " + avg + "\n");
		System.out.print("평균과 10 이상 차이나는 수 : ");

		//평균값보다 10이상 크거나, 10이상 작은 배열값들 출력
		for(i = 0; i < 10; i = i + 1)
		{
			if(arrinput[i] >= avg + 10 || arrinput[i] <= avg + 10 )
			{
				System.out.print(arrinput[i] + "\t");
			}
		}	//뒤로 갈수록 "\t"이 많이 출력되는 이유를 모르겠습니당 ㅠㅠ

		System.out.println("\nHello BIG World!");
	}
}
