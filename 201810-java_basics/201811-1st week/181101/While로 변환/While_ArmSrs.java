class While_ArmSrs
{
//1부터 더하다가, 합계가 4000이 넘어가면 스탑하기

	public static void main(String[] args) 
	{

/*
for 구문 조건식에, 꼭 i만 들어가야 하는 건 아니야.
for ( i = 1; s <= 4000; i = i + 1) 이렇게 해도 돼. 
초기값, 조건식, 증감식, 각각에 뭐가 들어갈지는 너무나 자유로워.
꼭 초기값, 조건식, 증감식 각각에 모두 하나의 변수만
들어갈 수 있는 건 아니야.
'초기값 또는 조건식 또는 증감식에 들어 있는 특정 변수' or '비어 있음'
이게 아니라, 모든 변수 뭐가 들어가든 상관 없어. 
비어있든, a가 들어가든, x가 들어가든, m 이 들어가든.
그저, 내가 알고 싶은 바로 그 녀석.
*/

/*
		int i, s;
		s = 0;
		for(i = 1; ; i = i + 1 )
		{
			s = s + i;
			if (s > 4000)
			{
				break;
			}
			i = i + 1;
		}
		System.out.println(i + "번째에서 합계" + s);
*/

//위의 for 구문을 while 구문 사용해서 나타내보기.
		int i, s;
		i = 0; s = 0;
		while ( s <= 4000)
		{
			i = i + 1;
			s = s + i;
		}
		System.out.println(i + "번째에서" + "합계 " + s);


		System.out.println("Hello World!");
	}
}
