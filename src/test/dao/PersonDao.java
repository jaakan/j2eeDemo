package test.dao;

import java.util.List;

import pojos.j2eedemo.TB_Person;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
public class PersonDao implements IPersonDao {
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory){
		this.sessionFactory=sessionFactory;
	}
	public SessionFactory getSessionFactory(){
		return this.sessionFactory;
	}
	
	@Override
	public void createPerson(TB_Person table) {
		// TODO Auto-generated method stu
		Session s=sessionFactory.openSession();
		Transaction trans=s.beginTransaction();
		s.persist(table);
		trans.commit();
		s.close();
	}

	@Override
	public List<TB_Person> getPersons() {
		// TODO Auto-generated method stub
		return sessionFactory.openSession().createQuery("select p from TB_Person p").list();
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		Number n=(Number)sessionFactory.openSession()
				.createQuery("select count(p) from TB_Person p")
				.uniqueResult();
		return n.intValue();
	}

	@Override
	public TB_Person findByName(String name) {
		// TODO Auto-generated method stub
		String HQL="select p from TB_Persion p where p.name="+name;
		List<TB_Person> list=sessionFactory.openSession().createQuery(HQL).list();
		if(list.size()>0){
			return list.get(0);
		}
		return null;
	}
	
	public void close(){
		this.sessionFactory.openSession().close();
	}
}
