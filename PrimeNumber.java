package BackEnd;

public class PrimeNumber {

	public PrimeNumber() {
		// TODO Auto-generated constructor stub
	}
	
	static public void main(String[] args) {
	
	for(int i = 2; i < 100; i++) {
		boolean isPrime = true;
		for(int x = 2; x <(i/2); x++) {
			if(i % x == 0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime) {
			System.out.print("-" + i);
		}
		
		}
	}
}
