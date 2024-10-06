package main.com.JavaProgrammingMasterclassUpdatedToJava17.NestedClasses;

import main.com.JavaProgrammingMasterclassUpdatedToJava17.NestedClasses.domain.Employee;
import main.com.JavaProgrammingMasterclassUpdatedToJava17.NestedClasses.domain.StoreEmployee;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Employee> employeeList = new ArrayList<>(List.of(new Employee(10001, "Ralph", 2015),
				new Employee(10005, "Caroline", 2020),
				new Employee(10007, "Jane", 2013),
				new Employee(13151, "Laura", 2020),
				new Employee(12345, "Jim", 2018)));

//        var comparator = new EmployeeComparator<>();
//        employeeList.sort(comparator);
		employeeList.sort(new Employee.EmployeeComparator<>("yearStarted").reversed());
		for (Employee e : employeeList) {
			System.out.println(e);
		}

		System.out.println();
		System.out.println("Store Members");
		List<StoreEmployee> storeEmployees=new ArrayList<>(List.of(
				new StoreEmployee(10015,"Megan",2019,"Target"),
				new StoreEmployee(10515,"John",2021,"Walmart"),
				new StoreEmployee(10105,"Tom",2020,"Macy's"),
				new StoreEmployee(10215,"Marty",2018,"Walmart"),
				new StoreEmployee(103222,"Bill",2016,"Target")));

//		var genericEmployee = new StoreEmployee();
		var comparator=new StoreEmployee().new StoreComparator<>();
		storeEmployees.sort(comparator);
		for (StoreEmployee e: storeEmployees) {
			System.out.println(e);
		}
	}
}
