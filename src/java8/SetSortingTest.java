package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetSortingTest {
	
	int id;
	String name;
	String jobTitle;
	int salary;	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public SetSortingTest(int id,String name,int salary,String jobTitle){
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.jobTitle=jobTitle;
	}

	@Override
	public String toString() {
		return "SetSortingTest [id=" + id + ", name=" + name + ", jobTitle=" + jobTitle + ", salary=" + salary + "]\n";
	}

	public static void main(String[] args) {
		
		//Set<SetSortingTest> set = new LinkedHashSet<>();
		Set<SetSortingTest> set = new TreeSet<>();
		//List<SetSortingTest> lst = new ArrayList<SetSortingTest>();
		
		set.add(new SetSortingTest(1,"D",40000,"SE"));
		set.add(new SetSortingTest(2,"A",11000,"SE"));
		set.add(new SetSortingTest(4,"B",50000,"SE"));
		set.add(new SetSortingTest(3,"D",30000,"SE"));
		set.add(new SetSortingTest(5,"C",20000,"SE"));
		set.add(new SetSortingTest(7,"G",60000,"SE"));
		set.add(new SetSortingTest(6,"J",10000,"SE"));
		set.add(new SetSortingTest(8,"H",70000,"SE"));
		set.add(new SetSortingTest(9,"U",90000,"SE"));
		System.out.println(set.toString());

	}


}
