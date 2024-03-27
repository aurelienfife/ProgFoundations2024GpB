package fileRead;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
//import java.util.Map.Entry;

public class FileReadCode {

	void runCode() {
		
		// Open the file for reading
		// File doesn't open the file, it creates a "virtual path" to the file
		File f = new File("temps.csv");
		
		ArrayList<String> allLines = new ArrayList<String> ();
		
		try {
			// The creation of the scanner object will actually attempt to open the file
			Scanner s = new Scanner(f);
			
			// Check if the file has got text in it after our current
			// Position (if we just opened it, check if it has text
			// at all)
			while(s.hasNextLine()) {
				// If so, take the next available line (i.e. if first time, the first)
				// and return a string (in this case to be added to the array)
				// The iterator (s) will then automatically move its position
				// to the next available line without it needing to be explicitly done
				allLines.add(s.nextLine());
			}
			
			// Do things right, close files when no longer needed
			s.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		HashMap<String, Integer> measurements = new HashMap<String, Integer> ();
		
		// Now let's look at what we got from the file
		for(String line: allLines) {
			// Split current line into an array of elements
			String[] splitString = line.split(","); 
			
			// Print the elements individually
			System.out.println("Element 1: " + splitString[0]);
			System.out.println("Element 2: " + splitString[1]);
			System.out.println();
			
			measurements.put(splitString[0], Integer.parseInt(splitString[1]));
		}
				
		
		// Variations using a HashMap
		System.out.println(measurements.toString());
	}
	
}
