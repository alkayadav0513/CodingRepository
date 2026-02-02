package predicateUnderstanding;

import java.util.function.Predicate;

public class WithPredicate3 {

	public static void main(String[] args) {


		Predicate<Integer>p = I -> I>10;
		
		//Predicate interface's TEst Method
		System.out.println(p.test(300)); //true
		System.out.println(p.test(-1)); //false

	}

}

