package test.dao;

import java.util.ArrayList;

import test.vo.Person;

/**
 * Mapper XML�� SQL�� ��� �޼��� ����
 */
public interface PersonMapper {
	//Person��ü ����
	public int insertPerson(Person p);
	//Person��ü ��� �б�
	public ArrayList<Person> selectPerson();
}
