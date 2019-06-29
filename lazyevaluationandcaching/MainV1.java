package lazyevaluationandcaching;

public class MainV1 {

	public static void main(String[] args) {
		LazyNumberDetailsV2 lnd = new LazyNumberDetailsV2(13);
		lnd.updateNumber(17);
		lnd.isPrime();
		lnd.isPrime();
		lnd.isPrime();
		lnd.updateNumber(22);
		lnd.isPrime();
		lnd.isPrime();
		lnd.updateNumber(13);
		lnd.isPrime();
		lnd.isPrime();
	}

}
