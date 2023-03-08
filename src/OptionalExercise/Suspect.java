package OptionalExercise;

public class Suspect {

	private String name;
	private String country;

	public Suspect(String name, String country) {

		this.name = name;
		this.country = country;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Suspect [name=" + name + ", country=" + country + "]";
	}
	
	

}
