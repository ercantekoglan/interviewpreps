package EmployeeDesign;

public enum Rates {
	
	Developer(50), Manager(70), HR(40);
	private int value;

	private Rates(int value) {
		this.setValue(value);
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

}
