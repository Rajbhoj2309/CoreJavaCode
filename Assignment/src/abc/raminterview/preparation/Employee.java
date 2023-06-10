package abc.raminterview.preparation;

public class Employee {
	
	private int id;
	private String name;
	private int age;
	private String gender;
	private Double salary;
	private String department;
	private int doj;
	public Employee() {
	
	}
	public Employee(int id, String name, int age, String gender, Double salary, String department, int doj) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.salary = salary;
		this.department = department;
		this.doj = doj;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getGender() {
		return gender;
	}
	public Double getSalary() {
		return salary;
	}
	public String getDepartment() {
		return department;
	}
	public int getDoj() {
		return doj;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public void setDoj(int doj) {
		this.doj = doj;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", salary=" + salary
				+ ", department=" + department + ", doj=" + doj + "]";
	}
	
	
}
