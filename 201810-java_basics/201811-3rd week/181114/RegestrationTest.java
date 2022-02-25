package Fourteenth;
import java.util.Scanner;

public class RegestrationTest {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String regestNum;
	regestNum = sc. next();
	int cut;
	
	if(regestNum.length() == 13 || regestNum.charAt(6) != '-')
	{
		System.out.println("제대로 좀 입력하세요");
		return;
	}
	for(int i = 0; i < regestNum.length();)
	{
		if(i==6)
		{
			i=i+1;
			continue;
		}
		if(regestNum.charAt(i)>'9' || regestNum.charAt(i)<'0')
		{
			System.out.println("제대로 좀 입력하세요");
			return;	
		}
		i = i + 1;
	}
	
	int month = Integer.parseInt(regestNum.substring(2,4));
	if(month>12)
	{
		System.out.println("제대로 좀 입력하세요");
		return;
	}		
	
	int day = Integer.parseInt(regestNum.substring(4,6));
	if(day>31 || day < 1)
	{
		System.out.println("제대로 좀 입력하세요");
		return;
	}		
	
	int year = Integer.parseInt(regestNum.substring(0,2));
	int gender = Integer.parseInt(regestNum.substring(7,8));
	
	if(gender == 0 || gender == 9)
	{
		year = 1800 + year;
	}
	else if (gender == 1 || gender == 2)
	{
		year = 1900 + year;
	}
	else if (gender == 3 || gender == 4)
	{
		year = 2000 + year;
	}
	
	char g; g='l';
	if (gender == 9 || gender == 1 || gender == 3)
	{
		g = '남';
	}
	if (gender == 0 || gender == 2 || gender == 4)
	{
		g = '여';
	}
	
	System.out.printf("\n%d년 %d월 %d일생 %c자 (%d세)",year,month,day,g,2018-year);
	

	System.out.println();
	}

}
