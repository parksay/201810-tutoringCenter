import java.util.Scanner;
class DoubleArray1 
{
	public static void main(String[] args) 
	{
		int arr[][];
		arr = new int[4][4];
		int i, j;
		Scanner sc = new Scanner(System.in);
		for (i = 0; i < arr.length; i = i + 1)
		{
			for(j = 0; j < arr[i].length-1; j = j + 1)
			{
				System.out.print("\n"+i+"행"+j+"열 입력: ");
				arr[i][j] = sc. nextInt();
			}
		}
		
		for (i = 0; i < arr.length; i = i + 1)
		{
			for(j = 0; j < arr[i].length-1; j = j + 1)
			{
				arr[i][ (arr[i].length-1) ]=arr[i][3] + arr[i][j];
			}
			System.out.println(arr[i][3]);
		}


		System.out.println("Hello World!");
	}
}
