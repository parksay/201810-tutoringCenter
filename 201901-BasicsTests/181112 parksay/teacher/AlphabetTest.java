S

//char형 배열에 알파벳 임의로 저장하고 A~F, Q~Z 사이의 문자는 모두 *로 변경
public class AlphabetTest {

	public static void main(String[] args) {
		char array[] = {'A','I','D','G','U','B','J','S','T','H'};
		
		System.out.print("* 변경 전 : ");
		System.out.println(array);
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] >= 'A' && array[i] <= 'F' || array[i] >= 'Q' && array[i] <= 'Z') {
				array[i] = '*';
			}
		}
		
		System.out.print("* 변경 후 : ");
		System.out.println(array);
	}
}
