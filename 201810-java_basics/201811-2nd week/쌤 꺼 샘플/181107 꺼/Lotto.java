//�ζ� ��ȣ ����
class Lotto {
	public static void main(String[] args) {
		int num[] = new int[6];
		int i, j;

		//�ߺ����� �ʴ� ��ȣ �����Ͽ� �ʱ�ȭ
		for (i = 0; i < num.length; i++) {
			num[i] = (int)(Math.random() * 45 + 1);
			for (j = 0; j < i; j++) {
				if (num[i] == num[j]) {
					i--;
					break;
				}
			}
		}

		//��� ���
		for (i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();
	}
}
