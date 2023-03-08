package OptionalExercise;

public class Main {

	public static void main(String[] args) {

		FileService fs = new FileService();

		fs.readFiles("InterpolWatchReport-Week1.csv")
				.stream().filter(x -> x.getName().equalsIgnoreCase("CARMEN SANDIEGO"))
				.findAny()
				.ifPresent(location -> System.out.println(location.getName() + " is in " + location.getCountry()));
		System.out.println("=========================");
		
		
		fs.readFiles("InterpolWatchReport-Week2.csv")
				.stream().filter(x -> x.getName().equalsIgnoreCase("CARMEN SANDIEGO"))
				.findAny()
				.ifPresentOrElse(location -> System.out.println(location.getName() + " is in " + location.getCountry()), () -> System.out.println("Galdang, just missed her!"));
		System.out.println("=========================");

		
		fs.readFiles("InterpolWatchReport-Week3.csv")
				.stream().filter(x -> x.getName().equalsIgnoreCase("CARMEN SANDIEGO"))
				.findAny()
				.ifPresent(location -> System.out.println(location.getName() + " is in " + location.getCountry()));

	}

}
