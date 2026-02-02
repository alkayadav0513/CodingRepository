package CollectionsJava.subpackage;

/*1) FULLY QUALIFIED NAME:
 * 
 * If you use fully qualified name then only declared class of this package will be 
 * accessible. Now there is no need to import.

	2)generally used when two packages have same class name 
 */

public class Date {
	
	String day ;
	String month ;
	String year ;
	
	public Date(String day, String month, String year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public static void main(String[] args) {


		Date d1 = new Date("24","04", "2024");
		System.out.println(d1.toString());
		
		System.out.println("*****************");
		//Date class of Java.util package
		//Compiler gets confused and refers to the Data class present in "importPackages"
		//Date d2  = new Date();
		/*To remove confusion of compiler with same class name but belonging to different 
		package use full qualified name.*/
		java.util.Date d3  = new java.util.Date();
		System.out.println("Date Format: "+d3); //Current Timestamp in Date format
		//toString() converts from Date format to String format
		String str = d3.toString();
		System.out.println("String Format: "+str);//Current Timestamp in String format
		//String has a replace(old char, new char) method
		String str1 = str.replace(" ", "_");
		System.out.println(str1);
		String str2 = str1.replace(":", "_");
		System.out.println(str2);
		//Method chaining
		String str3 = d3.toString().replace(" ", "_").replace(":", "_");
		System.out.println(str3);

	}

	@Override
	public String toString() {
		return "Date is: " + day + "/" + month + "/" + year;
	}
	
	

}

