package score.vo;
//�л� 1���� ���� ������ ��� Ŭ����
public class Student {
	//�Ӽ� = ����
	//���� ���� : public > protected > (default) > private
	private String name;
	private int kor;
	private int eng;
	private int mat;
	
	//������
	public Student() {
		name = "�̸�����"; kor = -1;  eng = -1;  mat = -1;
	}
	public Student(String name) {
		this();	//���� Ŭ������ ������ ȣ��
		this.name = name;
	}
	public Student(int kor, int eng, int mat) {
		this.kor = kor; this.eng = eng; this.mat = mat;
	}
	public Student(String name, int kor, int eng, int mat) {
		this(kor, eng, mat);
		this.name = name;
//		this.kor = kor; this.eng = eng; this.mat = mat;
	}
	
	//��� = �޼ҵ�
	public int total() {
		int t = this.kor + this.eng + this.mat;
		return t;
	}
	
	public double average() {
		double a = this.total() / 3.0;
		return a;
	}
	
	public void print() {
		System.out.println(name + " " + kor + " " + eng + " " + mat 
				+ " " + total() + " " + average());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

}
