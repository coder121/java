package inheritance;

public class Manager extends Employee{
	private double bonus;
	public Manager(String name, double sal, int year, int month, int date) {
		super(name,sal,year,month,date);
	}

	public void setBonus(double bonus) {
		this.bonus=bonus;
		
	}
	@Override
	public double getSalary() {
		// TODO Auto-generated method stub
		double salary= super.getSalary();
	
		return salary+bonus;
	}

}
