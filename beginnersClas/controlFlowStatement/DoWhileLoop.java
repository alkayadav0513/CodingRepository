package controlFlowStatement;

public class DoWhileLoop {

	public static void main(String[] args) {
		//Program 1 - To print out even number between 1 and 50
		
		
		int a = 1; //Initial Statement
		do {
			if(a%2 == 0) { //1==0, 0==0 , 1==0 , 0==0, 1==0 ,1==0, .... 49%2==0, 50%2==0
				System.out.println(a+" is an even number");
			}
			a++; //2, 3, 4, 5, 6.......49, 50, 51
		}while(a<=50); //2<=50, 3<=50, 4<=50, 5<=50, 6<=50....49<=50, 50<=50, 51<=50
		System.out.println("Final value of a at which do while terminates is "+a);//51
		
		System.out.println("********Infinite Looping********");
		// To print out even number between 1 and 50
		/*
		 * int b = 1; do { if(b%2 == 0) {
		 * System.out.println(b+" is an even number");//2,4,6,8,10..... } b++; //2, 3,
		 * 4, 5, 6........ }while(b>0); //Bad condition
		 */		
		
		System.out.println("********Infinite Looping********");
		
		// To print out even number between 1 and 50
		/*int b = 1; 
		do {
			if(b%2 == 0) { 
				System.out.println(b+" is an even number");
			}else {
				System.out.println(b+" is an odd number");
			}
		}while(b<=50); */ //No increment statement given and the condition is not false
		
		
		System.out.println("********Infinite Looping********");
		
		// To print out even number between 1 and 50
		/*int c = 1; 
		do {
			if(c%2 == 0) { 
				System.out.println(c+" is an even number");
			}
			c--; //Bad decrement statement which is not required
		}while(c<=50); */ //the condition is always remain true
		
		
		System.out.println("********Do while atleast executes one loop*********");
		// To print out even number between 1 and 50
		int d = 1; //Initial Statement
		do {
			System.out.println("Do while loop at least executed once");
			if(d%2 == 0) {  //1%2 == 0
				System.out.println(d+" is an even number");
			}else {
				System.out.println(d+" is an odd number");
			}
			d++; //2
		}while(d>=50); //2>=50
		
		System.out.println("****************************");
		/*Program 2 - To print out numbers which are odd and multiples 
		of three(3) starting from 1 to 100*/
		int e = 1;
		do {
			if(e%2 !=0 && e%3==0) {
				System.out.println(e+" is an odd number and a multiple of three");
			}
			e++;//2, 3, 4...100, 101
		}while(e<101);//2<101, 3<101, 4<101, 100<101, 101<101
		
		System.out.println("************Break****************");
		/*Program 3 - To print out numbers which are odd from 1 to 10 and break the loop 
		 * when the number is five.*/
		int f = 1;
		do {
			if(f%2 !=0) {
				System.out.println(f+" is an odd number.");
			}
			f++; //2, 3, 4, 5
			if(f==5) {
				System.out.println("Before Break");
				break;
				//System.out.println("After Break"); //Unreachable code
			}
			System.out.println("After the if block containing break");
			
		}while(f<=10); //2<=10, 3<=10, 4<=10
		
		
		//1 is an odd number.	
		//After the if block containing break
		
		//After the if block containing break
		
		//3 is an odd number.
		//After the if block containing break
		
		//Before Break
		
		System.out.println("************Continue****************");
		//Continue the loop except for the value for which continue is used
		int g = 1;
		do {
			System.out.println(g); //1, 2, 3, 4, 5, 6, 7, 9, 10
			g++;//2, 3, 4, 5, 6, 7, 8, 9, 10, 11
			System.out.println("Before continue");
			if(g==5) {
				continue;
			}
			System.out.println("After continue");
			
		}while(g<=10);//2<=10, 3<=10, 4<=10, 5<=10, 6<=10, 7<=10, 8<=10 9<=10, 10<=10, 11<=10
		
		//1
		//Before continue
		//After continue
		
		//2
		//Before continue
		//After continue
		
		//3
		//Before continue
		//After continue
		
		//4
		//Before continue
		
		//5
		//Before continue
		//After continue
		
		//6
		//Before continue
		//After continue
		
		//7
		//Before continue
		//After continue
		
		//8
		//Before continue
		//After continue
		
		//9
		//Before continue
		//After continue
		
		//10
		//Before continue
		//After continue
		
	}

}
