package java8;

public class Employee {
	
	private String name;
	private int age;
	private int salary;
	
	public Employee(String name, int age, int sal) {
		this.setName(name);
		this.setAge(age);
		this.setSalary(sal);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	
	
}
