
//int형 변수에 대입한 값을 서로 교환하기
public class BasicTest2 {

	public static void main(String[] args) {
		int x, y, z;
		
		x = 100;
		y = 200;
		
		System.out.println("교환 전 : x=" + x + ", y=" + y);
		
		z = x;
		x = y;
		y = z;
		
		System.out.println("교환 후 : x=" + x + ", y=" + y);
	}

}
