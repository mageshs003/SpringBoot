package springbootproject.VerizonSpringBoot;

import java.util.ArrayList;

import javax.persistence.Entity;

@Entity
public class Employee {
		//private @Id @GeneratedValue Long id;
	private int userId;
	private String name;
		Employee(){}
		public int getUserId()
		{
			return this.userId;
		}
		public String getName()
		{
			return this.name;
		}
		Employee(String name) {
			this.name=name;
		}
		Employee(String name,int id) {
			this.name=name;
			this.userId=id;
		}
		public void test()
			{
			System.out.println("Test  Method");
			}
		ArrayList<String>getCatalogList()
		{
		ArrayList<String> data=new ArrayList<String>();
		data.add("clothes");
		data.add("shoes");
		return data;
		}
}
