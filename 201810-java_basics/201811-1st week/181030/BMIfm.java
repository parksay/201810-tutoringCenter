import java.util.Scanner;
class BMIfm
{
	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
	
	double wt, ht, bmi;
	System.out.print("체중 : ");
	wt = sc. nextDouble();
	System.out.print("키 : ");
	ht = sc. nextDouble();
	ht = ht / 100;
	bmi = wt / (ht*ht);
	if (bmi < 18.5)
	{
		System.out.println("저체중");
	}
	if (bmi >= 18.5 && bmi < 23)
	{
		System.out.println("정상");
	}
	if (bmi >= 23 && bmi < 25)
	{
		System.out.println("과체중");
	}
	if (bmi >= 25)
	{
		System.out.println("비만");
	}

/*
	if (bmi < 18.5)
	{
		System.out.println("저체중");
	}
	else if (bmi >= 18.5 && bmi < 23)
	{
		System.out.println("정상");
	}
	else if (bmi >= 23 && bmi < 25)
	{
		System.out.println("과체중");
	}
	else 
	{
		System.out.println("비만");
	}
이것도 가능. else 는 default 랑 같은 거라서, 조건을 따로 달아주지 않아도 됨.
아니, 넣으면 안 됨
*/
	System.out.println("Hello World!");
	}
}
