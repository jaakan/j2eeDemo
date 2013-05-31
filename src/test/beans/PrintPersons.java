package test.beans;
import java.util.List;

import utils.HibernateUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;

import pojos.j2eedemo.*;
public class PrintPersons {
	private Session session=null;
	private Transaction trans=null;
	private List<TB_Person> persons=null;
	public PrintPersons(){
		session=HibernateUtil.getSession();
		trans=session.beginTransaction();
	}
	
	public void addPerson(TB_Person person){
		session.persist(person);
		trans.commit();
	}
	
	public List<TB_Person> query(String hql){
		List<TB_Person> list=session.createQuery(hql).list();
		return list;
		
	}
	
	public void close(){
		session.close();
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
