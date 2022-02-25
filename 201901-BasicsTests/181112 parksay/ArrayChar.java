class ArrayChar 
{
	public static void main(String[] args) 
	{

		int[] arrChar;
		arrChar = new int[10];
		int i;

		//배열의 각 값에 65~90 사이 숫자 랜덤으로 입력
		for (i = 0; i < 10;	i = i + 1)
		{
			arrChar[i] = (int)(26*Math.random() + 65);
		}

		//배열 출력
		System.out.print("변경 전: ");
		for (i = 0; i < 10;	i = i + 1)
		{
			System.out.print((char)arrChar[i] + "  ");
		}

		//65~70이거나 81~90인 숫자는 42로 변경
		for (i = 0; i < 10;	i = i + 1)
		{
			if(arrChar[i] > 64 && arrChar[i] < 71)
			{
				arrChar[i] = 42;
			}
			else if (arrChar[i] > 80 && arrChar[i] < 91)
			{
				arrChar[i] = 42;
			}
			
		}

		//배열 다시 출력
		System.out.print("\n변경 후: ");
		for (i = 0; i < 10;	i = i + 1)
		{
			System.out.print((char)arrChar[i] + "  ");
		}

		System.out.println("\nHello BIG World!");
	}
}
