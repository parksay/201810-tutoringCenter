//로또 번호 생성
class Lotto {
	public static void main(String[] args) {
		int num[] = new int[6];
		int i, j;

		//중복되지 않는 번호 생성하여 초기화
		for (i = 0; i < num.length; i++) {
			num[i] = (int)(Math.random() * 45 + 1);
			for (j = 0; j < i; j++) {
				if (num[i] == num[j]) {
					i--;
					break;
				}
			}
		}

		//결과 출력
		for (i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();
	}
}
