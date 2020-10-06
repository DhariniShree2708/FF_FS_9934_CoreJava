package com.hcl.day7;

import com.hcl.day6.Employee;

/**
 * Day # : 7. Topic : Core Java.
 * 
 * This class is used to define 3 types of constructors and its working.
 * 
 * @author Dharini
 *
 */
public class EmployeeMain {

	/**
	 * 
	 * This method is used to call the default constructor and print the default
	 * values assigned to its employee number and employee name.
	 * 
	 * This method is used to call the parameterized constructors and print the
	 * default values assigned to its employee number and employee name.
	 * 
	 * This method is used to call the default constructor and print the default
	 * values assigned to its employee number and employee name.
	 * 
	 * @param args - Command line argument.
	 * @return void
	 */
	public static void main(String[] args) {
		// Create object using Default constructor
		Employee emp1 = new Employee();
		System.out.println(emp1.empNo);
		System.out.println(emp1.empName);

		// Create object using 2 parameter constructor
		Employee emp2 = new Employee(100, "Dharini");
		System.out.println(emp2.empNo);
		System.out.println(emp2.empName);

		// Create object using empNo parameter constructor
		Employee emp3 = new Employee(50);
		System.out.println(emp3.empNo);
		System.out.println(emp3.empName);

		// Create object using 2 parameter constructor
		Employee emp4 = new Employee("Dharini");
		System.out.println(emp4.empNo);
		System.out.println(emp4.empName);

		// Create object using copy constructor
		Employee emp5 = new Employee(emp2);
		System.out.println(emp5.empNo);
		System.out.println(emp5.empName);

		//Cloning
		try {
			Employee emp = (Employee) emp2.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

	}
}
