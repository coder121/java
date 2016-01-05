package inheritance;

import java.util.Date;
import java.util.GregorianCalendar;

public class Employee {
	private String name;
	private double salary;
	private Date hireDate;
	
	public Employee(String n,double d,int year,int month,int date) {
		this.name=n;
		this.salary=d;
		GregorianCalendar calendar=new GregorianCalendar(year,month-1,date);
		hireDate=calendar.getTime();
	}
	public String getName() {
	return name;
	}
	public double getSalary() {
		// TODO Auto-generated method stub
		return salary;
	}
}
