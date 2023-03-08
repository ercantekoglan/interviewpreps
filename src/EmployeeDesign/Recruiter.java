package EmployeeDesign;

public class Recruiter extends Employee {
	private String name;
	private String department;
	private Integer hoursWorked;

	public Recruiter(String name, Integer hoursWorked) {
		this.name = name;
		this.department = "HR";
		this.hoursWorked = hoursWorked;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Integer getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(Integer hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	@Override
	double basePay() {
		Double basePay = (double) (hoursWorked * Rates.HR.getValue());
		return basePay;
	}

	@Override
	double bonusPay() {
		Double bonus = (double) (this.basePay() * DepartmentBonusRate.HR.getValue());
		return bonus;
	}

	@Override
	public String toString() {
		return "Position : Recruiter / Name = " + name + " / Department = " + department + " / Hours Worked = " + hoursWorked
				+ " / Base Pay=" + basePay() + " / Bonus Pay = " + bonusPay();
	}

}
