package BackEnd;

import java.util.Scanner;

public class Katlar {

	public Katlar() {
		// TODO Auto-generated constructor stub
	}
	
	static public void main(String[] args) {
		
		int n;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Sayı sınırını giriniz: ");
		n = input.nextInt();
		
		for(int i = 1; i <= n; i *= 4) {
			System.out.println("4'ün katları: " + i);
		}
		
		for(int x = 1; x <= n; x *= 5) {
			System.out.println("5'ün katları: " + x);
		}
	}

}
