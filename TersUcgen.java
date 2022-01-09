package BackEnd;

import java.util.Scanner;

public class TersUcgen {

	public TersUcgen() {
		// TODO Auto-generated constructor stub
	}
	
	static public void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int n;
		
		System.out.print("Bir sayı giriniz: ");
		n = input.nextInt();
		
		for(int x = n; x >= 1; x--) {
			for(int j = 1; j <= (n-x); j++){
	            System.out.print(" ");
	        }
	        for(int k = (2*x) - 1;k >= 1; k--){
	            System.out.print("*");
	        }
	        System.out.println(" ");
		}
	}

}
