package objectArray;

public class Example {

	public static void main(String[] args) {
		//Object arrays needs be defined with row and column size
		//Exception - But Object array an hold homogeneous and heterogeneous data
		
		System.out.println("***************OBJECT ARRAY  - SDA - HOMOGENEOUS********************");
		Object obj1[] = new Object[3];
		
		//Row Size
		int rowSize1 = obj1.length ;
		System.out.println("Row size of the object array is "+rowSize1);//3
		
		//Length of the array / Array size /Number of cells
		int size1 = obj1.length *1;
		System.out.println("Length of the object array is "+size1);//3
		
		//Length of the array / Element size /Number of cells
		int size2 = obj1.length;
		System.out.println("Length of the object array is "+size2);//3
		
		//Define the data for the array
		obj1[0] = 100; //Data for the first row
		obj1[1] = 100; //Data for the second row
		obj1[2] = 200; //Data for the third row
		
		System.out.println("*****FOR LOOP*******");
		//Get all data
		//For loop
		for(int x = 0; x<obj1.length; x++) {
			System.out.println(obj1[x]);
		}
		
		System.out.println("*****FOR Each LOOP*******");
		
		for(Object i1  :obj1) {
			System.out.println(i1);
		}
		
		System.out.println("***************OBJECT ARRAY  - SDA - Heterogeneous********************");
		Object obj2[] = {"Sam Mendes", 32, 67.89,'M'};
		
		//Row Size
		int rowSize2 = obj2.length ;
		System.out.println("Row size of the object array is "+rowSize2);//4
				
		//Length of the array / Element size /Number of cells
		int size3 = obj2.length*1;
		System.out.println("Length of the object array is "+size3);//4
		

		System.out.println("*****FOR LOOP*******");
		//Get all data
		//For loop
		for(int x = 0; x<obj2.length; x++) {
			System.out.println(obj2[x]);
		}
		
		System.out.println("*****FOR Each LOOP*******");
		
		for(Object i1  :obj2) {
			System.out.println(i1);
		}
		
		System.out.println("********************");
		//Get the data from second row of heterogeneous array
		System.out.println(obj2[1]);//32
		
		
		System.out.println("***************OBJECT ARRAY  - DDA - Heterogeneous********************");
		Object obj3[][] = {{"Sam Mendes", 32, 67.89,'M'},{"Kaushik Mukherjee", 50, 72.50,'M'}};
		
		//Row Size
		int rowSize3 = obj3.length ;
		System.out.println("Row size of the object array is "+rowSize3);//2
		
		//Column Size
		int columnSize3 = obj3[0].length ;
		System.out.println("Column size of the object array is "+columnSize3);//4
						
		//Length of the array / Array size /Number of cells
		int size4 = obj3.length*obj3[0].length;
		System.out.println("Length of the object array is "+size4);//8
		
		//Get the data from second row second column
		System.out.println(obj3[1][1]);//50
		
		//Get the data from first row first column
		System.out.println(obj3[0][0]);//Sam Mendes
		
		System.out.println("*****************For loop********************");
		//Travel through rows - outer for loop to travel through rows
		for(int row = 0;row<obj3.length; row++ ) { 
			//Travel through columns of the row - inner for loop to travel through columns of the row
			for(int column = 0; column<obj3[0].length; column++) { 
				System.out.print(obj3[row][column]+","); 
			}
			System.out.println();
		}
		
		System.out.println("*****************For Each loop********************");
		//Travel through rows - outer for each loop to travel through rows
		for(Object[]i:obj3) {
			//Travel through column - inner for each loop to travel through columns
			for(Object j:i) {
				System.out.print(j+"-");
			}
			System.out.println();
		}
	}

}
