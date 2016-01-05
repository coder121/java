package inheritance;

import static org.junit.Assert.*;

import org.junit.Test;

public class InheritanceTest {

	@Test
	public void inhertianceTest() {
		Employee [] e=new Employee[3];
		Manager boss=new Manager("Raj",9000,2001,12,17);
		boss.setBonus(500);
		e[0]=boss;
		e[1]=new Employee("Rajesg",1000,2002,12,17);
		e[2]=new Employee("karl",5000,2012,1,1);
		for(Employee s:e){
			System.out.println("Name:"+s.getName()+"\nSalary:"+s.getSalary());
		}
	}

}
