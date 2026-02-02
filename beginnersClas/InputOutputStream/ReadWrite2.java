package InputOutputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadWrite2 {

	public static void main(String[] args) throws IOException {
		
		String str = System.getProperty("user.dir");
		System.out.println(str);
		
		
		File file = new File(str+"\\src\\InputOutputStream\\Read.txt");
		
	    FileInputStream fileInputStream = new FileInputStream(file);
			
	    System.out.println("Total size of the stream data is " + fileInputStream.available());
			
	    //int a = fileInputStream.read();
	    
		int content;
		while((content = fileInputStream.read()) != -1) {
			//convert to char and display it
			//System.out.println(content);
				
			System.out.print((char)content);
		}
		
		fileInputStream.close();
		
		System.out.println("****************************");
			
		File file1 = new File(str+"\\src\\InputOutputStream\\write.txt");
		
		FileOutputStream fileOutputStream = new FileOutputStream(file1);
		
		//To write with corresponding decimal value defined in Ascii table
		fileOutputStream.write(97); //corresponding char symbol  for decimal values
		fileOutputStream.write(110);//corresponding char symbol  for decimal values
		fileOutputStream.write(100);//corresponding char symbol  for decimal values
		
		//Flushes this output stream and forces any buffered output bytes to be written out.
		fileOutputStream.flush();
		
		//Closes this file output stream and releases any system resources associated with this stream
		fileOutputStream.close();
		
		


	}

}
