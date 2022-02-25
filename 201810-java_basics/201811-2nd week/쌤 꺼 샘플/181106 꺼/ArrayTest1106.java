//�迭�� �հ�, ���, �ִ�, �ּҰ�
class ArrayTest1106 {
	public static void main(String[] args) {
		int array[] = new int[10];
		init(array);
		print(array);
		System.out.println("�հ� : " + sum(array));
		System.out.println("��� : " + avg(array));
		System.out.println("�ִ밪 : " + max(array));
		System.out.println("�ּҰ� : " + min(array));
	}

	//�迭 ���� �ʱ�ȭ
	public static void init(int ar[]) {
		int i;
		for (i = 0; i < ar.length; i++) {
			ar[i] = (int)(Math.random() * 100);
		}
	}

	//�迭 ���
	public static void print(int ar[]) {
		int i;
		System.out.print("[ ");
		for (i = 0; i < ar.length; i++) {
			System.out.print(ar[i]);
			System.out.print(i < ar.length - 1 ? ", " : " ]\n");
		}
	}

	//�հ�
	public static int sum(int ar[]) {
		int i, s;
		s = 0;
		for (i = 0; i < ar.length; i++) {
			s += ar[i];
		}
		return s;
	}

	//���
	public static double avg(int ar[]) {
		double a;
		a = (double) sum(ar) / ar.length;
		return a;
	}

	//�ִ밪
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
	 
	//�ּҰ�
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
