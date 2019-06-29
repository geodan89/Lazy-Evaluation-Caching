package lazyevaluationandcaching;

public class LazyNumberDetailsV1 {
	private int number;
	private int savedResult;
	
	public LazyNumberDetailsV1(int number) {
		this.number = number;
	}
	
	public void updateNumber(int number) {
		this.number = number;
		savedResult = 0;
		System.out.println("Lazy evaluation");
	}
	
	private int primeAlgorithm(int number) {
		//boolean isPrime = true;
		//1 = true; 2 = false;
		int rezultat = 1;
		if(number < 2) {
			rezultat = 2;
			return rezultat;
		}
		if(number == 2) {
			return rezultat;
		}
		for (int i = 2; i < number/2; i++) {
			if(number % i == 0) {
				rezultat = 2;
				return rezultat;
			}
		}
		return rezultat;
	}

	public boolean isPrime() {
		if(savedResult == 0) {
			savedResult = primeAlgorithm(number);
			if (savedResult == 1) {
				System.out.println("is Prime: " + savedResult);
				return true;
			}else {
				System.out.println("is not Prime: " + savedResult);
				return false;
			}
		}
		else if (savedResult != 0) {
			System.out.println("Cached result isPrime: " + savedResult);
		}
		return false;
	}
}
