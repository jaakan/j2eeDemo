package pojos.j2eedemo;
import javax.persistence.*;
@Entity
@Table(name="TB_Person")
public class TB_Person {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	@Column(name="name")
	private String name;
	@Column(name="age")
	private String age;
	@Column(name="sex")
	private String sex;
	
	//setXXX and getXXX
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return this.name;
	}
	
	public void setAge(String age){
		this.age=age;
	}
	public String getAge(){
		return this.age;
	}
	
	public void setSex(String sex){
		this.sex=sex;
	}
	public String getSex(){
		return sex;
	}
}
