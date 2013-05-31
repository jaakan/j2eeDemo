package test.actions;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pojos.j2eedemo.*;
import test.dao.IPersonDao;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class PersonAction extends AbstractController{
	private IPersonDao personDao;
	private TB_Person person;
	private List<TB_Person> list;
	private HttpServletRequest request;
	private HttpServletResponse response;
	
	
	
	
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		// TODO Auto-generated method stub
		ModelAndView mav=null;
		String action=arg0.getParameter("action");
		if(action.equals("add")){
			TB_Person person=new TB_Person();
			this.add(person);
			mav=new ModelAndView("test","person",person);
		}else if(action.equals("getAll")){
			mav=new ModelAndView("test","list",this.getList());
		}
		personDao.close();
		return mav;
	}
	
	public void add(TB_Person person){
		personDao.createPerson(person);
	}
	
	public List<TB_Person> getList(){
		return personDao.getPersons();
	}
	
	public void setPersonDao(IPersonDao personDao){
		this.personDao=personDao;
	}
	public IPersonDao getIPersonDao(){
		return personDao;
	}
	
}
