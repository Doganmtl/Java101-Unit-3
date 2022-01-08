package BackEnd;

import java.util.Scanner;

public class Elmas {

	public Elmas() {
		// TODO Auto-generated constructor stub
	}
	
	static public void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int n;
		
		System.out.print("N sayısını giriniz: ");
		n = input.nextInt();
		
		for(int i = 1; i <= n; i++) {
			for(int k = 1; k <= (n-i); k++) {
				System.out.print(" ");
				}
			for(int j = 1; j <= (2*i) - 1; j++) {
				System.out.print("*");
				}
			System.out.println(" ");
			}
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
