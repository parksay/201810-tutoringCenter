import java.util.Scanner;
class ReviewTest6 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("상품 가격을 입력하세요: ");
		int prc, ftt, ott, ft, ot, rm;
		prc = sc. nextInt();
		ftt = prc / 50000;
		rm = prc - 50000 * ftt;
		ott = rm / 10000 ;
		rm = prc - ftt * 50000 - ott * 10000 ;
		ft = rm / 5000;
		rm = prc - ftt * 50000 - ott * 10000 - ft * 5000;
		ot = rm / 1000;
		
		/*
		rm = prc - ftt * 50000 - ott * 10000 - ft * 5000 - ot * 1000;
		System.out.println(prc + "원은 5만원권 " + ftt
		+ "장, 만원권 " + ott + "장, 5천원권 " + ft + "장, 천원권 "
		+ ot + "장을 지불하고, " + rm + "원이 남습니다.");
	*/

		
		rm = ((((prc % 50000)%10000)%5000)%1000);
		System.out.println(rm);
		// 나머지 구하는 수식 % 로는 어떻게 구하지? 수식 길이 줄이려면?
		
		System.out.println("Hello World!");


	}
}
