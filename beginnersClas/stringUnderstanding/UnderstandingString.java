package stringUnderstanding;

public class UnderstandingString {
	
	public static void main(String[] args) {
		
		
		char [] ch1 = new char[3];
		ch1[0] = 'M';
		ch1[1] = '#';
		ch1[2] = '1';
		
		//Another way to declare array
		char [] ch = {'W', 'e', 'l','c','o', 'm', 'e','-','2'};
		
		//ROw size of char array
		System.out.println("Row size of char array is "+ch.length);//9
				
		//Length/Size of char array  =  Row Size * Column Size
		//FOR SDA, column size is fixed at one and implicitly understood by compiler
		//IN SDA, row size is equal to length /sizw of the array
		System.out.println("Length of char array is "+(ch.length*1));//9*1 = 9
				
		//Data at index 2
		System.out.println(ch[2]);//l
		
		//Data at index 7
		System.out.println(ch[7]);//-
				
		System.out.println("***********");
		//Get all data from the single dimensional array 
		//FOR loop
		for(int indexNumberRow = 0; indexNumberRow<ch.length; indexNumberRow++) {
			System.out.println(ch[indexNumberRow]);
		}
				
		System.out.println("***********");
				
		//Get all data from the single dimensional array 
		//FOR EACH loop
		for(char c: ch) {
			System.out.println(c);
		}
				
		System.out.println("**************");	
		
		//String is a sequence of Characters
		//https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html
		String str = new String(ch);
		System.out.println(str);
		
		
		System.out.println("**********************");
		String str1 [] = new String[3];
		
		str1[0] = "Kaushik"; //First row first column
		str1[1] = "Sam";  //Second row first column
		str1[2] = "Robert"; //Third row first column
		
		//Length of array/Size of the array
		//If the length of array is 3, it has 3 cells and each cell will hold a data
		//For SDA(single dimensional array, row size is the length of the array
		//Length of Array = Row Size * Column Size
		//Column size for SDA is fixed at 1 implicitly
		System.out.println("Length of array is "+(str1.length*1));
		
		//Row size of SDA
		System.out.println("Row size is "+str1.length);
		
		//Get data from First row first column
		System.out.println(str1[0]);//Kaushik
		
		//Get data from Third row first column
		System.out.println(str1[2]);//Robert
		
		System.out.println("***********");
		//Get all data from the single dimensional array 
		//FOR loop
		for(int indexNumberRow = 0; indexNumberRow<str1.length; indexNumberRow++) {
			System.out.println(str1[indexNumberRow]);
		}
		
		System.out.println("***********");
		//Get all data from the single dimensional array 
		//FOR EACH loop
		for(String st: str1) {
			System.out.println(st);
		}
		
	}
	
	
	
}
