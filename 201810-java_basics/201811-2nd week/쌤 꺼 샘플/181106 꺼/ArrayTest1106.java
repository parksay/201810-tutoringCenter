//배열의 합계, 평균, 최대, 최소값
class ArrayTest1106 {
	public static void main(String[] args) {
		int array[] = new int[10];
		init(array);
		print(array);
		System.out.println("합계 : " + sum(array));
		System.out.println("평균 : " + avg(array));
		System.out.println("최대값 : " + max(array));
		System.out.println("최소값 : " + min(array));
	}

	//배열 원소 초기화
	public static void init(int ar[]) {
		int i;
		for (i = 0; i < ar.length; i++) {
			ar[i] = (int)(Math.random() * 100);
		}
	}

	//배열 출력
	public static void print(int ar[]) {
		int i;
		System.out.print("[ ");
		for (i = 0; i < ar.length; i++) {
			System.out.print(ar[i]);
			System.out.print(i < ar.length - 1 ? ", " : " ]\n");
		}
	}

	//합계
	public static int sum(int ar[]) {
		int i, s;
		s = 0;
		for (i = 0; i < ar.length; i++) {
			s += ar[i];
		}
		return s;
	}

	//평균
	public static double avg(int ar[]) {
		double a;
		a = (double) sum(ar) / ar.length;
		return a;
	}

	//최대값
	public static int max(int ar[]) {
		int i, m;
		m = ar[0];
		for (i = 1; i < ar.length; i++) {
			if (m < ar[i]) {
				m = ar[i];
			}
		}
		return m;
	}
	 
	//최소값
	public static int min(int ar[]) {
		int i, m;
		m = ar[0];
		for (i = 1; i < ar.length; i++) {
			if (m > ar[i]) {
				m = ar[i];
			}
		}
		return m;
	}
	
}
