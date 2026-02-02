package ThrowClause;

//Caught exception
class NoMoreMeatException extends Exception{
	
}

//Uncaught Exception
class NoMorePlantException extends RuntimeException{
	
}

interface Omnivore{
	public void meat(int amount)throws NoMoreMeatException;
	public void plant(int amount);
}

class Bear implements Omnivore{

	@Override
	public void meat(int amountOfMeat) throws NoMoreMeatException {

		if(amountOfMeat <=0) {
			throw new NoMoreMeatException();
		}
		System.out.println("More Meat needed");
	}

	@Override
	public void plant(int amountOfPlant) {
		if(amountOfPlant <=0) {
			throw new NoMorePlantException();
		}
		System.out.println("More Plant needed");
	}
	
}
