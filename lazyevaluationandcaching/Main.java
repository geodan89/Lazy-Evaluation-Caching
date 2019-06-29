package lazyevaluationandcaching;

public class Main {

	public static void main(String[] args) {
		LazyNumberDetails lnd = new LazyNumberDetails(13);
		
		lnd.updateNumber(22971);
		lnd.isPrime();
		lnd.isPerfect();
		lnd.isPrime();
		lnd.isMagic();
		lnd.isPerfect();
		lnd.isMagic();
		
		lnd.updateNumber(23787);
		lnd.updateNumber(784326);
		lnd.isPrime();
		lnd.isPerfect();
		lnd.isPrime();
		lnd.isMagic();
		lnd.isPerfect();
		lnd.isMagic();
		

	}

}
