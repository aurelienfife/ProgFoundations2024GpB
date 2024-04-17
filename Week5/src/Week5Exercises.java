import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Week5Exercises {
	File theFile;
	ArrayList<String> fileContents;

	// constructor
	public Week5Exercises() {
		theFile = new File("customers.csv");
		fileContents = new ArrayList<String>();

	}

	// method to run the exercises
	public void runExercises() {
		// All the code requiring the scanner should be in the try
		try {
			Scanner s = new Scanner(theFile);

			while (s.hasNextLine()) {
				fileContents.add(s.nextLine());
			}

			s.close();

		} catch (FileNotFoundException e) {
			// This is the error message you display if the file
			// Doesn't exist
			System.out.println("Stopping. File not found.");
			e.printStackTrace();
		}

		// We no longer require the scanner from this point onwards.
		// Display the lines
		for (String s : fileContents) {
			System.out.println(s);
		}

	}

	// menu method - gets a choice from the user
	private int Menu() {
		Integer result = 0;

		return result;
	}

}
