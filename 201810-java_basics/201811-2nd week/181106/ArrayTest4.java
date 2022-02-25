class ArrayTest4
{
	public static void main(String[] args) 
	{
		int i;
		int arr[];
		arr = new int[30];
		for ( i = 0; i <= arr.length -1; i = i + 1)
		{
			arr[i] = (int)(Math.random()*10);
		}
		int s = 0;
		for (i = 0; i <= arr.length - 1; i = i + 1)
		{
			s = s + arr[i];
		}
		int max = arr[0];
		for ( i = 1; i < arr.length; i = i + 1)
		{
			max = Math.max(max,arr[i]);
		}
		int min = arr[0];
		for ( i = 1; i < arr.length; i = i + 1)
		{
			min = Math.min+(min,arr[i]);
		}


		System.out.print("합계 : " + s + "평균 : " + s/30 + 
		"최대값 : " + max + " 최소값 : " + min );

		System.out.println("Hello World!");
	}
}
