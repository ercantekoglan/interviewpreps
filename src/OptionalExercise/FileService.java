package OptionalExercise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileService {
	
	public List<Suspect> readFiles(String filename) {

		List<Suspect> suspects = new ArrayList<>();

		BufferedReader br = null;

		try {

			br = new BufferedReader(new FileReader(filename));
			String line = null;
			br.readLine();

			while ((line = br.readLine()) != null) {
				String[] array = line.split(",");
				suspects.add(new Suspect(array[1], array[0]));

			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br.readLine() == null) {
					br.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return suspects;

	}

}
