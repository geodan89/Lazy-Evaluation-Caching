package lazyevaluationandcaching;

public class LazyNumberDetailsV2 {
	private int number;
	private String resultPrime;
	private String resultPerfect;
	private String resultMagic;
			
			
			
	public LazyNumberDetailsV2(int number) {
		this.number = number;
	}
	
	public void updateNumber(int number) {
		this.number = number;
		resultPrime = "null";
		resultPerfect = "null";
		resultMagic = "null";
	}
	
	//Algoritmul de determinare a unui numar prim
	private String primeAlgorithm(int number) {
		if(number<2) {
			return"false";
		}
		if(number == 2) {
			return "true";
		}
		for (int i = 2; i < number/2; i++) {
			if(number % i == 0) {	
				return "false";
			}
		}
		return "true";
	}
	
	//Algoritmul de determinare al unui numar perfect
	private String perfectAlgorithm(int number) {
		int sum = 1;
		for (int i = 2; i < (number-1); i++) {
			if (number % i == 0) {
				sum += i;
			}
		}
		if (sum == number) {
			return "true";
		}
		return "false";
	}
	
	//Determina daca un numar este magic sau nu.
	private static String magicAlgorithm(int number) {	
		while (number >= 10) {
			int duplicate = number;
			number = 0;
			while (duplicate != 0) {
				int ld = duplicate % 10;
				number += ld;
				duplicate /= 10;
			}
		}
		if ((number  == 3) || (number == 7) || (number == 9)) {
			return "true";
		}
		
		return "false";
	}

	public boolean isPrime() {
		if(resultPrime.equals("null")) {
			resultPrime = primeAlgorithm(number);
			if (resultPrime.equals("true")) {
				System.out.println("is Prime: " + resultPrime);
				return true;
			}else {
				System.out.println("is Prime: " + resultPrime);
				return false;
			}
		}
		else if (!resultPrime.equals("null") ) {
			System.out.println("Cached result isPrime: " + resultPrime);
		}
		return false;
	}
	
	public boolean isPerfect() {
		if(resultPerfect.equals("null")) {
			resultPerfect = perfectAlgorithm(number);
			if (resultPerfect.equals("true")) {
				System.out.println("is Perfect: " + resultPerfect);
				return true;
			}else {
				System.out.println("is Perfect: " + resultPerfect);
				return false;
			}
		}
		else if (!resultPerfect.equals("null") ) {
			System.out.println("Cached result isPerfect: " + resultPerfect);
		}
		return false;
	}
	
	public boolean isMagic() {
		if(resultMagic.equals("null")) {
			resultMagic = magicAlgorithm(number);
			if (resultMagic.equals("true")) {
				System.out.println("is Magic: " + resultMagic);
				return true;
			}else {
				System.out.println("is Magic: " + resultMagic);
				return false;
			}
		}
		else if (!resultMagic.equals("null") ) {
			System.out.println("Cached result isMagic: " + resultMagic);
		}
		return false;
	}
	
}
