package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class password {

	public static void main(String[] args) {
		
		
		//1.find the file
		String filename = "/Users/Paolo/Documents/JavaCourse/workspace/files/passwords.txt";
		String password= null;
		String[] passwords = new String[14];
				 
		//2. Create a file in java
		File file = new File(filename);
		
		
		//3.. open the file
		try {	
			BufferedReader br = new BufferedReader(new FileReader(file));
			for (int i=0; i<passwords.length; i++){
				passwords[i] = br.readLine();
			}
			br.close();
			} catch (FileNotFoundException e) {
				System.out.println("ERROR could nof find file:" + filename);
			} catch (IOException e) {
				System.out.println("ERROR could not read file:" + filename);
			}
		

		//4. read the file
		for (int i=0; i<passwords.length; i++){
			password = passwords[i];
			try {
				System.out.println("Validating password #" + i);
				if (!hasaDigit(password)){
					throw new noNumerException(password);	
				}
				if (!hasaLetter(password)){
					throw new noLetterException(password);	
				}
				if (!hasaSpecial(password)){
					throw new noSpecialException(password);	
				}
				else {
					System.out.println("Password :" + i + " set correctly" );
				}
				
			} catch (noNumerException e) {
				System.out.println("ERROR in password # "+ i + " it Must have a number");
				System.out.println(e.toString());
			} catch (noLetterException e) {
				System.out.println("ERROR in password # "+ i + " it Must have a Letter");
				System.out.println(e.toString());			
			} catch (noSpecialException e) {
				System.out.println("ERROR in password # "+ i + " it Must #, ! or @ ");
				System.out.println(e.toString());	
			} 
		
		}

		
	}
	
/// Checking chars funcitons	
	public static boolean hasaDigit(String s){
	    if (s != null && !s.isEmpty())
	    {
	        for (char c : s.toCharArray())
	        {
	            if (Character.isDigit(c))
	            {
	                return true;
	            }
	        }
	    }
	    return false;
	}

	public static boolean hasaLetter(String s){
	    if (s != null && !s.isEmpty())
	    {
	        for (char c : s.toCharArray())
	        {
	            if (Character.isLetter(c))
	            {
	                return true;
	            }
	        }
	    }
	    return false;
	}
	
	public static boolean hasaSpecial(String s){
	    if (s != null && !s.isEmpty())
	    {
	        for (char c : s.toCharArray())
	        {
	            if (c=='#' || c=='@' || c=='!')
	            {
	                return true;
	            }
	        }
	    }
	    return false;
	}
	

	
}
/// Exeptions 
		class noNumerException extends Exception {
			String pass;
			noNumerException(String pass){
				this.pass = pass;
			}
			public String toString(){
				return ("NoNumerException:" + pass);
			}
		}
		
		class noLetterException extends Exception {
			String pass;
			noLetterException(String pass){
				this.pass = pass;
			}
			public String toString(){
				return ("NoLetterrException:" + pass);
			}
		}
		
		class noSpecialException extends Exception {
			String pass;
			noSpecialException(String pass){
				this.pass = pass;
			}
			public String toString(){
				return ("NoSpecialException:" + pass);
			}
		}
		