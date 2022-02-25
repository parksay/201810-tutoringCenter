class ArraySort1 {
	public static void main(String[] args) {
		int ar[] = {5,10,4,3,9,11,20,7,1,15};
		int n;

		print(ar);		//정렬 전 출력

		for (int i = 0; i < ar.length; i++) {		//원소 개수만큼 반복
			for (int j = i + 1; j < ar.length; j++) {	//현재 위치 이후 개수만큼 반복
				if (ar[i] > ar[j]) {
					n = ar[i]; ar[i] = ar[j]; ar[j] = n;
				}
			}
		}
		
		print(ar);		//정렬 후 출력
	}

	//배열 출력
	public static void print(int a[]) {
		int i;
		System.out.print("[ ");
		for (i = 0; i < a.length; i++) {
			System.out.print(a[i]);
			System.out.print(i<a.length-1 ? ", ":" ]\n");
		}
	}
}
