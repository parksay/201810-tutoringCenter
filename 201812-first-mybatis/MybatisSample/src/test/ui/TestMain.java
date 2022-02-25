package test.ui;

import java.util.ArrayList;

import test.dao.PersonDAO;
import test.vo.Person;

public class TestMain {

	public static void main(String[] args) {
		PersonDAO dao = new PersonDAO();
		
		//ÀÔ·Â
		Person pe = new Person("±èÃ¶¼ö", 30);
		dao.insertPerson(pe);
		
		//°Ë»ö
		ArrayList<Person> list = dao.selectPerson();
		for (Person p : list) {
			System.out.println(p);
		}
	}

}
