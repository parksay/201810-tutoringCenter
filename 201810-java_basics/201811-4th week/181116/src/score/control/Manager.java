package score.control;

import score.vo.Student;

//성적 처리 프로세스 담당 클래스
public class Manager {
	private Student array[];	//성적정보 저장공간
	private int count;			//현재 저장된 개수
	
	public Manager() {
		array = new Student[100];
	}

	//전달된 Student 객체를 저장함
	public void save(Student st) {
		array[count] = st;
		count++;
	}
	
	//저장된 Student객체들의 배열을 리턴
	public Student[] listAll() {
		return array;
	}
	
	//저장된 개수 리턴
	public int getCount() {
		return count;
	}
}


