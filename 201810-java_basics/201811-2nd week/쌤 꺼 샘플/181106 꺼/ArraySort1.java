class ArraySort1 {
	public static void main(String[] args) {
		int ar[] = {5,10,4,3,9,11,20,7,1,15};
		int n;

		print(ar);		//���� �� ���

		for (int i = 0; i < ar.length; i++) {		//���� ������ŭ �ݺ�
			for (int j = i + 1; j < ar.length; j++) {	//���� ��ġ ���� ������ŭ �ݺ�
				if (ar[i] > ar[j]) {
					n = ar[i]; ar[i] = ar[j]; ar[j] = n;
				}
			}
		}
		
		print(ar);		//���� �� ���
	}

	//�迭 ���
	public static void print(int a[]) {
		int i;
		System.out.print("[ ");
		for (i = 0; i < a.length; i++) {
			System.out.print(a[i]);
			System.out.print(i<a.length-1 ? ", ":" ]\n");
		}
	}
}
