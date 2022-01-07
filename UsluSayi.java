package BackEnd;

import java.util.Scanner;

public class UsluSayi {

	public UsluSayi() {
		// TODO Auto-generated constructor stub
	}
	
	static public void main(String[] args) {
		
		int num1, num2, total = 1;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Lütfen bir sayı giriniz: ");
		num1 = input.nextInt();
		System.out.print("Lütfen üs olmasını istediğiniz sayıyı giriniz: ");
		num2 = input.nextInt();
		
		
		for (int i = 1; i <= num2; i++) {
			
			total = total * num1;
			
		}
		
		System.out.println("Sonuç: " + total);
		
	}

}
