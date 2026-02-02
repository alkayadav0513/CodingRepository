package predicateUnderstanding;

public class WithoutPredicate1 {

	public static void main(String[] args) {
		WithoutPredicate1 p = new WithoutPredicate1();
		System.out.println(p.testValueGreaterTen(20));  //true
		System.out.println(p.testValueGreaterTen(-1)); //false
		boolean val = p.testValueGreaterTen(9);
		System.out.println(val); //false
		

	}
	
	public boolean testValueGreaterTen(Integer i) {
		if(i>10) {
			return true;
		}else {
			return false;
		}
	}

}
