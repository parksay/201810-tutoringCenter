package score.view;

import java.util.Scanner;

import score.control.Manager;
import score.vo.Student;

//����ó�� ȭ�� UI �� ���� Ŭ����
public class UI {
	Manager manager;	//����ó�� ��� Ŭ����
	//UI�� ������
	public UI() {
		manager = new Manager();
	}
	//�޴� ��� �� ��ȣ �Է¹���
	public int menu() {
		Scanner scan = new Scanner(System.in);
		int num;
		System.out.println("\n[ ���� ���� ���α׷� ]");
		System.out.println("1. �Է�");
		System.out.println("2. ���");
		System.out.println("�׿�. ����");
		System.out.print("��ȣ ���� : ");
		num = scan.nextInt();
		return num;
	}
	
	//�л� 1���� ���� �Է¹���
	public void input() {
		Scanner scan = new Scanner(System.in);
		String n;
		int k,e,m;

		System.out.print("�̸�:");
		n = scan.nextLine();
		System.out.print("����:");
		k = scan.nextInt();
		System.out.print("����:");
		e = scan.nextInt();
		System.out.print("����:");
		m = scan.nextInt();
		Student s = new Student(n,k,e,m); //�Է¹��������� ��ü�����Ͽ� �迭�� ����
		manager.save(s);
		System.out.println("����Ǿ����ϴ�.");
	}
	
	//��ü �л� ���� ���
	public void output() {
		Student sa[] = manager.listAll();
		for (int i = 0; i < manager.getCount(); i++) {
			sa[i].print();
		}
	}
	
	public static void main(String[] args) {
		UI ui = new UI();	//UI��ü ����
		while (true) {
			int m = ui.menu();
			switch (m) {
				case 1: ui.input(); break;
				case 2: ui.output(); break;
				default: System.out.println("�����մϴ�."); return;
			}
		}
	} //main() ��
} //UI Ŭ���� ��
