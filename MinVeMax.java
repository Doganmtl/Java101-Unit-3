package BackEnd;

import java.util.Scanner;

public class MinVeMax {

	public MinVeMax() {
		// TODO Auto-generated constructor stub
	}
	
	static public void main(String[] main) {
		
		Scanner input = new Scanner(System.in);
		
		int n, x, min = 1, max = 1;
		
		System.out.print("Kaç tane sayı gireceksiniz: ");
		n = input.nextInt();
		
		System.out.print("Sayı giriniz: ");
		x = input.nextInt();
		x = min;
		x = max;
		
		for(int i = 1; i < n; i++) {
			System.out.print("Sayı giriniz: " );
			x = input.nextInt();
			if(x < min) {
				min = x; 
			}
			if(x > max) {
				max = x;
			}
		}
		System.out.println("En büyük değer: " + max);
		System.out.println("En küçük değer: " + min);
		}
	}
