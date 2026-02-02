package InputOutputStream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWrite1 {
	
	

	public static void main(String[] args) {
		
		
		try {
			String path = System.getProperty("user.dir");// Current directory path
			System.out.println(path);
		
			//Read the text file - Input  - Output Stream
			//https://docs.oracle.com/javase/8/docs/api/java/io/File.html
			File f = new File(path+"\\src\\checkedException\\Read.txt");
		
			//Reading character by character
			//https://docs.oracle.com/javase/8/docs/api/java/io/FileReader.html
			FileReader fr = new FileReader(f);//Caught exception - FileNotFoundException 
			
			//Create  a cache memory for reading
			BufferedReader br = new BufferedReader(fr);
			
			//Read line by line - readLine()
			//IOException class is the parent of FileNotFoundException class
			//So IOException class can handle itself and its child
			//String str  = br.readLine();//Caught exception - IOException
			//System.out.println(str);
			
			//String str1  = br.readLine();//Caught exception - IOException
			//System.out.println(str1);
			
			//String str2  = br.readLine();//Caught exception - IOException
			//System.out.println(str2);
			
			
			String value = null;
			while (( value = br.readLine()) != null) {
				System.out.println(value);
			}
			
			//Closes the stream and releases any system resources associated withit
			fr.close();
			
			//Write the text file - Input  - Output Stream
			//https://docs.oracle.com/javase/8/docs/api/java/io/File.html
			File f1 = new File(path+"\\src\\checkedException\\write.txt");
			
			//Write character by character
			//https://docs.oracle.com/javase/8/docs/api/java/io/FileWriter.html
			FileWriter fw = new FileWriter(f1);//Caught exception - IOException 
			
			//Create  a cache memory for reading
			BufferedWriter bw = new BufferedWriter(fw);
			
			//Write method to write in a line
			bw.write("Learning to Write.");
			
			bw.append("Please learn.");
			
			//Move to cursor to new line
			bw.newLine();
			
			//Write method to write in a line
			bw.write("Good to learn.");
			
			//Flushes the stream.
			bw.flush();
			
			//Closes the stream and releases any system resources associated withit.
			fr.close();
			
		} catch (IOException e) {
			//The name of exception handled, message of exception and line number which has exception
			e.printStackTrace(); 
			
			//Method which gives only the message of exception
			String msg = e.getMessage();
			System.out.println(msg);
		}
	}
	
	

}

