package test.dao;

import java.util.List;


import pojos.j2eedemo.TB_Person;

public interface IPersonDao {
	public void createPerson(TB_Person table);
	public List<TB_Person> getPersons();
	public int getCount();
	public TB_Person findByName(String name);
	public void close();
}
