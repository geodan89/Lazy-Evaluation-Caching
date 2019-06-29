package lazyevaluationandcaching;

public class LazyNumberDetails {
	private int number;
	private boolean savedPrime;
	private boolean savedPerfect;
	private boolean savedMagic;
	private int counter1;
	private int counter2;
	private int counter3;
	
	public LazyNumberDetails(int number) {
		this.number = number;
	}
	
	public void updateNumber(int number) {
		this.number = number;
		savedPrime = false;
		savedPerfect = false;
		savedMagic= false;
		counter1 = 0;
		counter2 = 0;
		counter3 = 0;
		System.out.println("Lazy evaluation");
	}
	
	//Determina daca un numar este prim.
	private boolean primeAlgorithm(int number) {
		if(number<2) {
			return false;
		}
		if(number == 2) {
			return true;
		}
		for (int i = 2; i < number/2; i++) {
			if(number % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	//Determina daca un numar este perfect
	private boolean perfectAlgorithm(int number) {
		int sum = 1;
		for (int i = 2; i < (number-1); i++) {
			if (number % i == 0) {
				sum += i;
			}
		}
		if (sum == number) {
			return true;
		}
		return false;
	}
	
	//Determina daca un numar este magic sau nu.
	private static boolean magicAlgorithm(int number) {
		
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
			return true;
		}	
		return false;
	}
	
	public boolean isPrime() {
		if(counter1 == 0) {
			savedPrime = primeAlgorithm(number);
			counter1 = 1;
			System.out.println(number + " is prime: "+ savedPrime);
			return savedPrime;
		}else {
			System.out.println("Cached "+ number +" is prime: " + savedPrime);
		}
		return savedPrime;
	}
	
	public boolean isPerfect() {
		if(counter2 == 0) {
			savedPerfect = perfectAlgorithm(number);
			counter2 = 1;
			System.out.println(number + " is perfect: "+ savedPerfect);
			return savedPerfect;
		}else {
			System.out.println("Cached "+ number +" is perfect: " + savedPerfect);
		}
		return savedPerfect;
	}
	
	public boolean isMagic() {
		if(counter3 == 0) {
			savedMagic = magicAlgorithm(number);
			counter3 = 1;
			System.out.println(number + " is magic: " + savedMagic);
			return savedMagic;
		}else {
			System.out.println("Cached "+ number + " is magic: "  + savedMagic);
		}
		return savedMagic;
	}
}
