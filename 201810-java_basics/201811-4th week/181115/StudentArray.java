package Fifteenth;

public class StudentArray {

	public static void main(String[] args) {

		Student[] sa = new Student[10];
		sa[0] = new Student("��", 90, 80, 85);
		sa[1] = new Student("��", 80, 80, 75);
		sa[2] = new Student("��", 90, 55, 70);
		sa[3] = new Student("��", 60, 80, 75);
		sa[4] = new Student("��", 70, 95, 60);
	int i = 0;
	for(i = 0; i < 10;  i= i + 1)
	{
		if(sa[i] == null)
		{
			break;
		}
		sa[i].print();
	}
	}

}
