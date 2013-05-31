import java.util.List;

import utils.HibernateUtil;
import org.apache.commons.pool.impl.GenericObjectPool.Config;
import org.hibernate.Session;
import org.hibernate.Transaction;
import pojos.j2eedemo.*;

public class HibernateTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session=HibernateUtil.getSession();
		Transaction trans=session.beginTransaction();
		
		TB_Person p1=new TB_Person();
		p1.setAge("16");
		p1.setName("jim");
		p1.setSex("M");
		
		TB_Person p2=new TB_Person();
		p2.setAge("20");
		p2.setName("ÕÅÈý");
		p2.setSex("M");
		
		session.persist(p1);
		session.persist(p2);
		
		
		List<TB_Person> persons=session.createQuery("from TB_Person").list();
		for(TB_Person person:persons){
			System.out.println(person.getName());
		}
		
		trans.commit();
		session.close();

	}

}
