import java.util.Scanner;
class JvTest1
{
	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
	int jv, oc, jsp;
	double avg;
	System.out.print("Java 점수 : ");
	jv = sc. nextInt();
	if (jv < 0 || jv > 100)
	{
		System.out.println("잘못 입력했습니다."); return;
	} 
	System.out.print("Oracle 점수 : ");
	oc = sc. nextInt();
	if (oc < 0 || oc > 100)
	{
		System.out.println("잘못 입력했습니다."); return;
	} 
	System.out.print("JSP 점수 : ");
	jsp = sc. nextInt();
	if (jsp < 0 || jsp > 100)
	{
		System.out.println("잘못 입력했습니다."); return;
	} 
	avg = (jv + oc + jsp)/(double)3 ;
	if ( avg <= 100 && avg >= 90 )
	{
		System.out.println("총점 : " + (jv + oc + jsp) + " 평균 : " + avg + " 등급 : 수");
	}
	else if ( avg < 90 && avg >= 80 )
	{
		System.out.println("총점 : " + (jv + oc + jsp) + " 평균 : " + avg + " 등급 : 우");
	}
	else if ( avg < 80 && avg >= 70 )
	{
		System.out.println("총점 : " + (jv + oc + jsp) + " 평균 : " + avg + " 등급 : 미");
	}
	else if ( avg < 70 && avg >= 60 )
	{
		System.out.println("총점 : " + (jv + oc + jsp) + " 평균 : " + avg + " 등급 : 양");
	}
	else
	{
		System.out.println("총점 : " + (jv + oc + jsp) + " 평균 : " + avg + " 등급 : 가");
	}
	System.out.println("Hello World!");
	}
}
