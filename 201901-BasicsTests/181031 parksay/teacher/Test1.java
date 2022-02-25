import java.util.Scanner;

//문제1
public class Test1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int java, oracle, jsp, tot;
		double avg;
		String grade;
		
		System.out.print("Java 점수 : ");
		java = input.nextInt();
		System.out.print("Oracle 점수 : ");
		oracle = input.nextInt();
		System.out.print("JSP 점수 : ");
		jsp = input.nextInt();
		
		if (java < 0 || java > 100 || oracle < 0 || oracle > 100 || jsp < 0 || jsp > 100) {
			System.out.println("잘못 입력했습니다.");
		}
		else {
			tot = java + oracle + jsp;
			avg = tot / 3.0;
		

			if (avg >= 90)
				grade = "수";
			else if (avg >= 80)
				grade = "우";
			else if (avg >= 70)
				grade = "미";
			else if (avg >= 60)
				grade = "양";
			else
				grade = "가";		

			System.out.println("총점 : " + tot + " 평균 : " + avg + " 등급 : " + grade);
		}
	}

}
