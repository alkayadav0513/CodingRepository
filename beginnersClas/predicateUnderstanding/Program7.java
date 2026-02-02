package predicateUnderstanding;

import java.util.Scanner;
import java.util.function.Predicate;

class User{
	
	String username;
	String password;
	
	//Create constructor to initialize user object
	User(String username, String password){
		this.username = username;
		this.password = password;
	}

}


public class Program7 {

	public static void main(String[] args) {
		//Program for User Authentication by using Predicate
		
		//Predicate of User type object
		Predicate<User> p = user -> user.username.equals("Kaushik" ) && user.password.equals("java");

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter User Name:");
		String username=sc.next(); 
		System.out.println("Enter Password:");
		String password=sc.next(); 
				
		User user=new User(username,password); 
				
				
		if(p.test(user)) {
			System.out.println("Valid user and can avail all services");

		}else{
					
			System.out.println("Invalid user and  you cannot avail services"); 

		}


	}

}




