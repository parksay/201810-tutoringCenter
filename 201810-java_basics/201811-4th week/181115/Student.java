package score.vo;

public class Student {
	private String name;
	private int kor;
	private int eng;
	private int mat;
	
	public Student(String name) {
		this.name = name;
	//�̸� �־��ָ� �Ʒ��� ����, �� �־��ָ� ������ ����.
	//���� �Ȱ��� �ް� this ���η� ������ �� ����. ���߿� ���� �ִ� ������ ���� ���� �򰥸�.
		
	}
	public Student() {
	}
	
	public Student(int kor, int eng, int mat) {
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	public void print() {
		System.out.print("\n"+this.name+"\t");
		System.out.print(this.kor+"\t");
		System.out.print(this.eng+"\t");
		System.out.print(this.mat+"\t");
	}
	
	public Student(String name, int kor, int eng, int mat) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
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
