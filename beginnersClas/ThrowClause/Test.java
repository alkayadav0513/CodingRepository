package ThrowClause;

public class Test {

	public static void main(String[] args) {

		try {
			Bear b1 = new Bear();
			
			//b1.meat(0);
			//b1.meat(-1);
			b1.meat(1);
			
			//b1.plant(0);
			//b1.plant(-1);
			b1.plant(1);
			
		}catch(NoMoreMeatException n) {
			n.printStackTrace();
		}catch(NoMorePlantException n1) {
			n1.printStackTrace();
		}
			
		
	}

}
