import java.util.Scanner;
class StringTest 
{
	public static void main(String[] args) 
	{
		int a,b,c,d;
		double f;
		a=10; b=5; c=4; d= 7;
		f=(a+b+c+d)/(double)4;
		System.out.println(f);
		/*분자나 분모 중 하나라도 double로 바꿔주면 된다는 거잖아
		분모 double로 바꿔주는 방법 두 가지. 첫째는 4.0으로 써서 자동변환
		둘쨰는 (double)4로 써서 강제 변환
		*/

		Scanner sc = new Scanner(System.in);
		String name, bdtp;
		int age;
		byte ht;
		
		System.out.print("이름을 입력하시오: ");
		name = sc. nextLine();

		System.out.print("나이를 입력하시오: ");
		age = sc. nextInt();

		System.out.print("키를 입력하시오: ");
		ht = sc. nextByte();

		bdtp = sc. nextLine(); /*앞에서 byte로 스캔받았으므로 버퍼에
		엔터 \n가 남아 있음 nextByte는 숫자만 가져올 수 있고, 문자는 못 가져옴.
		따라서 nextLine을 한 번 넣어 줘서 버퍼에 남은 \n를 가져와야 함.
		버퍼를 비워줌.
		*/

		System.out.print("혈액형을 입력하시오: ");
		bdtp = sc. nextLine();

		System.out.println("이름: " + name + "\n나이: " + age
		+ "\n키: "	+ ht + "\n혈액형: " + bdtp );
		//a+b+c+d/(double)4
		//stack이 포인터, heap이 메모리, heap 에 저장된 정보가 '객체'
		//char + char 는 int로 나오더니, string + string은 그대로 이어붙여줌
		/*buffer에서 정수만 쏙 가져다 쓰는 게 nextInt 근데 정수 90 쓰고 엔터
		누르면, 그 엔터까지 버퍼에 있어. 근데 숫자만 가져다 쓰니까 버퍼에 엔터가
		남아 있어. 그래서 다음 스캔 nextLine에서 버퍼 안이 비어 있지 않고 엔터가 있길래
		그 엔터를 바로 가져다가 씀. 즉, 결론적으로, nextInt 이후에 나온 nextLine은
		바로 엔터키를 가져오게 됨.
		반면에, nextLine은 문자열 " "를 가져오고, 그 뒤의 엔터를 지워주고 나와.
		따라서 nextInt 이후에 nextLine으로 스캔 받고 싶으면, nextLine을 중간에
		한번 더 넣어줘서 버퍼를 비워주는 과정을 추가해야 함.
		어떤 변수를 내보내서 버퍼를 지우고 오라고 할 것인가? 이 전에 썼던 변수라면
		그 변수가 '엔터키'로 초기화 돼서, 사라져 버림. 그니까 이번에 버퍼를 지우는
		데에 사용하는 녀석은 이제 앞으로 변수를 또 다시 받게 될 애를 가져와야 함.
		*/
		System.out.println("Hello World!");

	}
}
