package test;

class Student{
	protected int id;
	protected int getId() {
		return id;
	}
	protected void setId(int id) {
		this.id = id;
	}
	protected String getName() {
		return name;
	}
	protected void setName(String name) {
		this.name = name;
	}
	protected String name;
	
}

public class CheckGetterSetter extends Student{

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s=new Student();
		s.setId(10);
		System.out.println(s.getId());
		s.setName("levin");
		System.out.println(s.getName());

	}

}
