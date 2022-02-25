import java.util.Scanner;
class SwitchReview1
{
	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
	int yy, bth;
	System.out.print("ÅÂ¾î³­ ³âµµ ³×ÀÚ¸® : ");
	yy = sc. nextInt();
	bth = (yy - 4) % 12;
	switch (bth)
	{
	case 0 : 
	System.out.println("Áã¶ì³Ä");
	break;
	case 1 : 
	System.out.println("¼Ò¶ì³Ä");
	break;
	case 2 : 
	System.out.println("È£¶ûÀÌ¶ì³Ä");
	break;
	case 3 : 
	System.out.println("Åä³¢¶ì³Ä");
	break;
	case 4 : 
	System.out.println("¿ë¶ì³Ä");
	break;
	case 5 : 
	System.out.println("¹ì¶ì³Ä");
	break;
	case 6 : 
	System.out.println("¸»¶ì³Ä");
	break;
	case 7 : 
	System.out.println("¾ç¶ì³Ä");
	break;
	case 8 : 
	System.out.println("¿ø¼şÀÌ¶ì³Ä");
	break;
	case 9 : 
	System.out.println("´ß¶ì³Ä");
	break;
	case 10 : 
	System.out.println("°³¶ì³Ä");
	break;
	case 11 : 
	System.out.println("µÅÁö¶ì³Ä");
	}

/*
String str;
switch (yy%12)
{
case 1 :
	str = "Áã¶ì";
break;
case 2 :
	str = "¼Ò¶ì";
brea;
........
}
System.out.println("´ç½ÅÀº " + str + "¶ì ÀÔ´Ï´Ù");

ÀÌ·¸°Ô ÇÏ¸é Ãâ·Â ±¸¹®Àº ÇÑ ¹ø¸¸ ½áµµ µÊ. À§¿¡ °Å¶û ¹¹°¡ ´õ ÁÁÀº °Å·Á³ª.
*/
		System.out.println("Hello World!");
	}
}
