package EmployeeDesign;

public enum DepartmentBonusRate {
	
	
	IT(0.30), Management(0.50), HR(0.20);
	private double value;

	private DepartmentBonusRate(double d) {
		this.setValue(d);
	}

	public double getValue() {
		return value;
	}

	public void setValue(double d) {
		this.value = d;
	}

}
