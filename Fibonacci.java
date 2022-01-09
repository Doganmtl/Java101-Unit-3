package BackEnd;

public class Fibonacci {

	public Fibonacci() {
		// TODO Auto-generated constructor stub
	}

	static public void main(String[] args) {
		
		int n1 = 0, n2 = 1, n3;
		
		for(int i = 1; i <= 10; i++) {
			
			System.out.print(n1 + ", ");
			
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
		
		}
	}
}
