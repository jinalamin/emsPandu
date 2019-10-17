package java8;

import java.util.ArrayList;
import java.util.List;

public class Assignment1 {	
	
	void age40Filter(List<Employee> al) {
		List<Employee> newAl = new ArrayList<>();
		for(int i = 0;i<al.size();i++) {
			//System.out.println(al.get(i).getAge());	
		if(al.get(i).getAge() > 40) {
				newAl.add(al.get(i));
			}
		}
					System.out.println("Age Greater 40 Employee List :::::::");
		System.out.println(newAl.toString());
		newAl=null;
	}
	
	void salaryFilter(List<Employee> al) {
		List<Employee> salAl = new ArrayList<>();
		for(int i=0;i<al.size();i++) {
			if(al.get(i).getSalary() < 40000) {
				salAl.add(al.get(i));
			}
		}
		System.out.println("Salary less than 40000 Employee List :::::::");
		System.out.println(salAl.toString());
		salAl=null;
	}
	
	void ageSalFilter(List<Employee> al) {
		List<Employee> salAl = new ArrayList<>();
		for(int i=0;i<al.size();i++) {
			if(al.get(i).getSalary() < 40000 && al.get(i).getAge() > 40) {
				salAl.add(al.get(i));
			}
		}
		System.out.println("Salary less than 40000 Employee List :::::::AND Age Greater 40 Employee List :::::::");
		System.out.println(salAl.toString());
		salAl=null;
	}

	public static void main(String[] args) {
		
		List<Employee> al = new ArrayList<Employee>();
		al.add(new Employee("Pandurang",28,50000));
		al.add(new Employee("Poonam",27,40000));
		al.add(new Employee("Datta",40,60000));
		al.add(new Employee("Mahesh",45,35000));
		al.add(new Employee("Ashwini",35,40000));
		al.add(new Employee("Monika",50,50000));
	
		//System.out.println("Original Data  "+al);	
		Assignment1 as = new Assignment1();
		as.age40Filter(al);
		as.salaryFilter(al);
		as.ageSalFilter(al);

	}

}
