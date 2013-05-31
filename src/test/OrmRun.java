package test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojos.j2eedemo.TB_Person;

import test.dao.IPersonDao;

public class OrmRun {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		IPersonDao personDao=(IPersonDao) context.getBean("personDao");
		TB_Person person=new TB_Person();
		person.setName("sunkai");
		person.setAge("26");
		person.setSex("M");
		personDao.createPerson(person);
		List<TB_Person> list=personDao.getPersons();
		for(TB_Person p:list){
			System.out.println("ÄÚÈÝ:"+p.getName());
		}
	}

}
