class ArrayTest1 
{
	public static void main(String[] args) 
	{
		int x = 99; 

		int a[];
		int []b = {1, 9, 4, 30, 3};	
		double c[] = {1.5, 3.14, 5.5};
		char d[] = {'A', 'B', 'C'};
		String e[] = {"aaa", "bbb", "ccc"};
		
		a = new int[5]; //배열은 여기서야 비로소 만들어진다능
		a[0] = 11;
		a[1] = 22;

for(int i = 0; i <= e.length; i = i + 1)
{
		System.out.println(e[i]);
}



//new 는 heap 에 저장할 때 쓰는 말
/* heap에 넣는 애들은 자동으로 0초기화
인덱스 첨자 맨 앞이 0 번, 그다음 1번, .... 4번 이런 식으로 총 5개
100개 방이면 0부터 세니까 99번 방까지 있겠지
a[2]의 뜻은, a 어레이의 2번 방
만약 어레이가 4까지밖에 없는데, 5까지 출력하래. 실행할 때 에러 떠.
이제는 실행하다가 에러 떠. 컴파일은 잘 돼. 이제 더 어렵.
그러면 '그 어레이의 갯수'를 나타내는 명령어, 'a.length; 가 있음.

int x;
x = 1;
이걸 줄여서
int x = 1;
(뒤에서 다시 int x = ~~ 하면, 이미 쓴 변수 이라서 선언이 안 돼.)
마찬가지로 어레이 선언과 정의를 줄여서 하는 방법
int a[];
a = new int[5]; //5개짜리 어레이 a를 heap에 생성해주세요
a[0] = 11;
a[1] = 22;
....
이걸 줄여서
int []a = {11, 22, 4, 65, 23);
이렇게.

어레이의 기능 중 하나 - 
nextInt의 경우 버퍼에 저장하므로, 다음 숫자 받으면 받아 놓은 숫자가
사라지는데, 어레이에 저장한다고 하면, 나머지 애들도 다 저장해놓을 수 있어

	*/

		System.out.println();
		System.out.println("Hello World!");
	}
}
