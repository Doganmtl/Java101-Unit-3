package BackEnd;

import java.util.Scanner;

public class MukemmelSayi {

	public MukemmelSayi() {
		// TODO Auto-generated constructor stub
	}
	static public void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int n, count = 0;
		
		System.out.print("Lütfen bir sayı giriniz: ");
		n = input.nextInt();
		
		for(int i = 1;i < n; i++) {
			if(n % i == 0) {
				count += i;
			} 
		}	if(count == n) {
			System.out.print(n + " bir mükemmel sayıdır.");
		} else {
			System.out.print(n + " bir mükemmel sayı değildir.");
		}
	}
}
