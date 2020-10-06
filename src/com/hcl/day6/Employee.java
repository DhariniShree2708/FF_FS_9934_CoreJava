package com.hcl.day6;

/**
 * Day #:6 Topic : Core Java
 *
 * This class is used to store the details of the employee.
 * 
 * @author Dharini
 *
 */
public class Employee implements Cloneable {
	public int empNo;
	public String empName;
	//private Object Employee;

	/**
	 * Default Constructor.
	 */
	public Employee() {
		super(); // Calling the constructor
		this.empNo = 51888474;
		this.empName = "HCL Technologies";
	}

	/**
	 * This method clones the data and object of employee.
	 */
	public Object clone() throws CloneNotSupportedException {
		return (Employee) super.clone();
	}

	/**
	 * Parameterized Constructor.
	 * 
	 * @param empName, empno
	 */
	public Employee(int empNo, String empName) {
		super(); // Calling the Constructor
		this.empNo = empNo;
		this.empName = empName;
	}

	/**
	 * Parameterized Constructor.
	 * 
	 * @param empName
	 */
	public Employee(String empName) {
		super();
		this.empName = empName;
	}

	/**
	 * Parameterized Constructor.
	 * 
	 * @param empNo
	 */
	public Employee(int empNo) {
		super();
		this.empNo = empNo;
	}

	/**
	 * Copy Constructor.
	 * 
	 * @param employee
	 */
	public Employee(Employee employee) {
		this.empNo = employee.empNo;
		this.empName = employee.empName;
	}

}
