package controlFlowStatement;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		
		// Program1 - Multiples of 2 and 5 from 50 to 10
		for(int a = 50; a>=10; a--) { //a = 50,  50>=10, a=49, 49>=10,  a = 48, 48>=10,
			if(a%2 ==0 && a%5==0) {
				System.out.println(a+ " is a multiple of 2 and 5");
			}
		}
		
		System.out.println("********break**********");
		//Multiples of 2 and 5 for numbers until 100 staring with 1
		for(int a = 1; true ; a++) {
			if(a==101) {
				break;
			}
			if(a%2 ==0 && a%5==0) {
				System.out.println(a+ " is a multiple of 2 and 5");
			}
		}
		
		System.out.println("*********************");
		// Program2 - License to be provided between the age of 18 and 70 including these numbers
		for(int c = 1; c<=100; c++ ) {
			if(c>=18 && c<=70) {
				System.out.println("Age "+c+" will get a license");
			}else {
				System.out.println("Age "+c+" will not get a license");
			}
		}
		
		System.out.println("***********************");
		for(int c = 1;true; c++ ) {
			
			if(c>=18 && c<=70) {
				System.out.println("Age "+c+" will get a license");
			}
			
			if(c<18 || c>70) {
				continue;
			}
			
			if(c==70) {
				break;
			}
		}
	}

}
