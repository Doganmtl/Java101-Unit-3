package BackEnd;

import java.util.Scanner;

public class HarmonikSayi {

	public HarmonikSayi() {
		// TODO Auto-generated constructor stub
	}
	
	static public void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int n;
		double result = 0;
		
		System.out.print("N sayısını giriniz: ");
		n = input.nextInt();
		
		for(double i = 1; i <= n; i++) {
			
			result += (1/i);
			
		}
		
		System.out.print(result);
		
	}

}
