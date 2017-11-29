package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class read {

	public static void main(String[] args) {
		// 1. find file (path) that we want to read
		String filename = "/Users/Paolo/Documents/JavaCourse/workspace/files/filetoread2.rtf";
		String text = null;
		
		// 2. create the file in java
		File file = new File(filename);
		
		// 3. Open the file
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
		// 4. Read the file
			text = br.readLine();	
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println("Error File not found:" + filename);
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("ERROR could not read the file " + filename);
			e.printStackTrace();
		} finally {
			System.out.println("finished reading the file");
			
		}
		System.out.println(text);
	
	}

}
