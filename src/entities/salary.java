package entities;

public class Salary {
	public String name;
	public double grossSalary;
	public double tax;

	public double netSalary() {
		double salary = grossSalary - 1000;
		return salary;
	}

	public void increaseSalary(double increase) {
		
		this.grossSalary += (grossSalary * increase) / 100;
	}

	public String toString() {
		return "Employee: " 
				+ name 
				+ ", $ "
				+ String.format("%.2f", netSalary()) 
				+ ", Tax: $ "
				+ String.format("%.2f", tax);

	}
}
