package BackEnd;

import java.util.Scanner;

public class NegatifVeTekSayi {

	public NegatifVeTekSayi() {
		// TODO Auto-generated constructor stub
	}
	
	static public void main(String[] args) {
		
		int n, x = 0;
		
		Scanner input = new Scanner(System.in);
		
		do {
			
			System.out.print("Bir sayı giriniz: ");
			n = input.nextInt();
			
			if (n % 2 == 0 || n % 4 == 0) {
				
				x += n;
				
			}
			
		} while (n % 2 != 1);
	
		System.out.print(x);
		
	}

}
