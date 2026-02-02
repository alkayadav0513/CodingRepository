package SDA;

public class MultiDimensionalArray {
	
	//Double Dimensional Array (DDA) is also called as multi-dimensional array or two dimensional array
	//Here the column size needs to be defined even if it is one.
	//Arrays hold homogeneous data.
	//Arrays support primitive type and object type
	
	public static void main(String[] args) {

		//int a[][] = new int[row size][column size];
		
		int a[][] = new int[3][1];
		
		//Row Size
		System.out.println("Row Size is "+a.length); //3
		
		//Column size
		int columnSize = a[0].length; //First row column
		System.out.println("Column Size is "+columnSize); //1
		
		int columnSize1 = a[1].length; //Second row column
		System.out.println("Column Size is "+columnSize1); //1
		
		int columnSize2 = a[2].length; //Third row column
		System.out.println("Column Size is "+columnSize2); //1
		
		//Length/Element size/Number of cells in the array  = Row size * Column size
		int lengthArray = a.length * a[0].length;
		System.out.println("Length/Array Size/ Number of Cells in the array is "+lengthArray);
		
		//Define the data for the array
		//First Row First column data
		a[0][0] = 100;
		
		//Second Row First column data
		a[1][0] = 200;
		
		//Third Row First column data
		//a[2][0] = "Hi";
		a[2][0] = 300;
		
		//Get the data from a specific row and column
		//Get the data from First Row First column
		System.out.println("Data from First Row First column "+ a[0][0]);//100
		
		//Get the data from third Row first column
		System.out.println("Data from third Row first column "+ a[2][0]);//300
		
		System.out.println("*****************For loop********************");
		//Travel through rows - outer for loop to travel through rows
		for(int rowindex = 0;rowindex<a.length; rowindex++ ) { //0<3 , 1<3, 2<3, 3<3
			//Travel through columns of the row - inner for loop to travel through columns of the row
			for(int columnIndex = 0; columnIndex<a[0].length; columnIndex++) { //0<1 , 1<1 , 0<1, 1<1, 0<1, 1<1
				System.out.println(a[rowindex][columnIndex]); //a[0][0] , a[1][0], a[2][0]
			}
		}
		
		System.out.println("*****************For Each loop********************");
		//Travel through rows - outer for each loop to travel through rows
		for(int[]i:a) {
			//Travel through column - inner for each loop to travel through columns
			for(int j:i) {
				System.out.println(j);
			}
		}
		
		System.out.println("*******************Float array - Row size 4 and column size 3*****************************");
		Float [][]b = new Float[4][3];
		
		b[0][0] = 10F;
		b[0][1] = 11F;
		b[0][2] = 12F;
		b[1][0] = 12F;
		b[1][1] = 13F;
		b[1][2] = 13.5F;
		b[2][0] = 13.6F;
		b[2][1] = 13.7F;
		b[2][2] = 13.4F;
		b[3][0] = 13.3F;
		b[3][1] = 13.2F;
		b[3][2] = 13.1F;
		
		
		
		Float b2[][] = {{45.0F, 34.0F}, {24F, 45F}};
		//{45.0F, 34.0F} - first row with two columns
		//{24F, 45F} - second row with two column
		
		Float b1[][] = {{10F, 20F, 30F},{100F, 200F, 300F}, {1000F, 2000F, 3000F}, {10000F, 20000F, 30000F}};
		//{10F, 20F, 30F} - first row with 3 columns
		//{100F, 200F, 300F}-Second  row with 3 columns
		//{1000F, 2000F, 3000F} = third row with 3 columns
		//{10000F, 20000F, 30000F}  -fourth row with 3 columns
		
		//Row Size
		System.out.println("Row Size is "+b1.length); //4
		//Column size
		int columnSize3 = b1[0].length; 
		System.out.println("Column Size is "+columnSize3); //3
		
		//Length/Array size/Number of cells in tthe array
		int lengthArray1 = b1.length * b1[0].length;
		System.out.println("Length/Array Size/ Number of Cells in the array is "+lengthArray1);//12
				
		//Get the data from second row first column
		System.out.println(b1[1][0]);//100.0
		
		//Get the data from first row third column
		System.out.println(b1[0][2]);//30.0
		

		System.out.println("*****************For loop********************");
		//Travel through rows - outer for loop to travel through rows
		for(int row = 0;row<b1.length; row++ ) { 
			//Travel through columns of the row - inner for loop to travel through columns of the row
			for(int column = 0; column<b1[0].length; column++) { 
				System.out.println(b1[row][column]); 
			}
		}
		
		System.out.println("*****************For loop********************");
		//Travel through rows - outer for loop to travel through rows
		for(int row = 0;row<b1.length; row++ ) { 
			//Travel through columns of the row - inner for loop to travel through columns of the row
			for(int column = 0; column<b1[0].length; column++) { 
				System.out.print(b1[row][column]+","); 
			}
			System.out.println();
		}
		
		System.out.println("*****************For Each loop********************");
		//Travel through rows - outer for each loop to travel through rows
		for(Float[]i:b1) {
			//Travel through column - inner for each loop to travel through columns
			for(Float j:i) {
				System.out.print(j+"-");
			}
			System.out.println();
		}
		
		System.out.println("*******************String array - Row size 2 and column size 2*****************************");
		
		String[][] str = {{"Sam", "Mendes"},{"Kaushik", "Mukherjee"}};
		
		//Row Size
		System.out.println("Row Size is "+str.length); //2
		
		//Column size
		int columnSize4 = str[0].length; 
		System.out.println("Column Size is "+columnSize4); //2
				
		//Length/Element size/Number of cells in tthe array
		int lengthArray2 = str.length * str[0].length;
		System.out.println("Length/Array Size/ Number of Cells in the array is "+lengthArray2);//4
						
		System.out.println("*****************For loop********************");
		//Travel through rows - outer for loop to travel through rows
		for(int row = 0;row<str.length; row++ ) { 
			//Travel through columns of the row - inner for loop to travel through columns of the row
			for(int column = 0; column<str[0].length; column++) { 
				System.out.print(str[row][column]+","); 
			}
			System.out.println();
		}
		
		System.out.println("*****************For Each loop********************");
		//Travel through rows - outer for each loop to travel through rows
		for(String[]i:str) {
			//Travel through column - inner for each loop to travel through columns
			for(String j:i) {
				System.out.print(j+"-");
			}
			System.out.println();
		}
		
		
	}

}
