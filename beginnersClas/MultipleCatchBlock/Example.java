package MultipleCatchBlock;

public class Example {

	public static void main(String[] args) {
		
		try {
			int a = 10;
			System.out.println(a);
			
			Thread.sleep(2000L);
			
			int b = 20;
			System.out.println(b);
			
			System.out.println("************");
			
			int a1[] = null;
			//Developer has forgotten this code as below:
			a1 = new int[3];
			a1[0] = 10;
			a1[1] = 20;
			a1[2] = 30;
				
			for(int b1: a1) {
				System.out.println(b1);
			}
			
			System.out.println("************");
			
			int a2 = 20;
			//int b2 = 0;
			int b2 = 10;
			int c2 = a2/b2;
			System.out.println(c2);
			
			System.out.println("**********");
			String str = "120";
			int i1 = Integer.parseInt(str);
			System.out.println(i1);
			
			String str1 = "#";
			//String str1 = "12";
			int i2 = Integer.parseInt(str1);
			System.out.println(i2);
			
		
		}catch(InterruptedException i) {
			i.printStackTrace();
			System.out.println("This is the interrupted exception catch block.");
			
		}catch(NullPointerException n) {
			n.printStackTrace();
			System.out.println("This is the null pointer catch block.");
		}catch(ArithmeticException a) {
			a.printStackTrace();
			System.out.println("This is the arithmetic exception catch block.");
		}catch(NumberFormatException n) {
			
			n.printStackTrace();
			System.out.println("This is the number format exception catch block.");
		}
		

	}

}
