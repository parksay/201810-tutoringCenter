package score.vo;

public class Student {
	private String name;
	private int kor;
	private int eng;
	private int mat;
	
	public Student(String name) {
		this.name = name;
	//이름 넣어주면 아래꺼 실행, 안 넣어주면 위에꺼 실행.
	//변수 똑같이 받고 this 여부로 구분이 더 편함. 나중엔 뭐에 넣는 변순지 뭐가 뭔지 헷갈림.
		
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
