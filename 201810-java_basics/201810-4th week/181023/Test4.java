class  Test4
{
	public static void main(String[] args) 
	{
		int a,b,c,d;
		a=b=c=d=0;
		++a; //전위형 증감연산자는 우선순위가 높지 -> a가 원래 0이었는데 1을 더해부러라 -> a=1
		System.out.println(a);
		b=a++; //후위형 증감연산자는 우선순위가 낮지 -> b를 a와 같게 한 후에, a에 1을 더해라 -> b=1, a=2
		System.out.println(b);
		c=++a; //전위형 증감연산자이므로 먼저 1 더해짐 -> a=3 된 후에 c가 a와 같아짐.
		System.out.println(c);
		d=++c;
		System.out.println(d);
		System.out.println("a= " + a + " b= " + b + " c= " + c + " d= " + d);
		//자 봐 신기한거 보여줄게
		System.out.println(a*8+7-1*5);
		//이렇게 해놓으면 a는 함수 안에서만 연산한 것 뿐이지, 함수 밖에서는 값이 변함이 없어.
		System.out.println("a= " + a);
		//이렇게 다시 출력하면, 원래 a 값으로 나오지.
		System.out.println("Hello World!");
		System.out.println(b-7);
		System.out.println("b=" - b);
	}
}
