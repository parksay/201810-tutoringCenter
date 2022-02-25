import java.util.Scanner;
class SwitchTest2 
{
	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
	String str;
	str = sc. nextLine();
	switch (str)
		{
		case "±è" :
			System.out.println("±è¾¾±º¿ä.");
		break;
		case "¹Ú" :
			System.out.println("¹Ú¾¾±º¿ä.");
		break;
		case "ÃÖ" :
			System.out.println("ÃÖ¾¾±º¿ä.");
		break;
		case "ÀÌ" :
			System.out.println("ÀÌ¾¾±º¿ä.");
		break;
		default : 
			System.out.println("±×¹ÛÀÇ ¼º¾¾±º¿ä.");
		}
		System.out.println("Hello World!");
	}
}
