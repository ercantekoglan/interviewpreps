package StreamsPractice;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		FileService fileService = new FileService();
		List<Suspect> suspectLineUp = fileService.getSuspectsFromFile();
		
		Map<Integer, List<Suspect>> collect = suspectLineUp.stream().filter(x -> !x.getHairColor().equals("RED"))
													  				.filter(g -> g.getHasGlasses() != true)
													  				.collect(Collectors.groupingBy(Suspect::getBirthYear));
							  
		collect.entrySet().forEach(e -> System.out.println(e));
		// There should only be one person that is returned here...
		// The map listed here is the birth year (Integer) and the List of suspects
		// first filter out all the suspects with red hair...
		// then filter out all the suspects with glasses
		// then group by their birth year (Collectors.groupingBy(Suspect::getBirthYear,
		// Collectors.toList())
		// -> this will return the birth year and a list of suspect obects (if done
		// correctly, there should
		// only be one suspect object.

		

		// APPLY FILTERING LOGIC HERE....

		String guilty = collect.entrySet().stream().map(entry -> entry.getValue().get(0).getName()).findFirst()
				.orElse(null);

		System.out.println(guilty);

	}
}
