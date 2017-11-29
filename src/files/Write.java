package files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Write {

	public static void main(String[] args) {
		// 1 define the path tat we want to weite
		String filename = "/Users/Paolo/Documents/JavaCourse/workspace/files/filetowrite.txt";
		String message = "I'm writing data that will be placed to a this  file";
			
		
		//2 create the file in java
		File file = new File(filename);

		try {
			// 3. Open the file
			FileWriter fw = new FileWriter(file);
			
			// 4. Write to the file
			fw.write(message);
			fw.close();
		} catch (IOException e) {
			System.out.println("Error could not read file:" + filename);
			e.printStackTrace();
		} finally {
			System.out.println("Closing the filewriter");
		}
		

		
		
		// 5. Close the resouces 


	}

}
