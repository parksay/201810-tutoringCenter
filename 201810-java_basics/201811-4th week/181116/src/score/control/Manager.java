package score.control;

import score.vo.Student;

//���� ó�� ���μ��� ��� Ŭ����
public class Manager {
	private Student array[];	//�������� �������
	private int count;			//���� ����� ����
	
	public Manager() {
		array = new Student[100];
	}

	//���޵� Student ��ü�� ������
	public void save(Student st) {
		array[count] = st;
		count++;
	}
	
	//����� Student��ü���� �迭�� ����
	public Student[] listAll() {
		return array;
	}
	
	//����� ���� ����
	public int getCount() {
		return count;
	}
}


