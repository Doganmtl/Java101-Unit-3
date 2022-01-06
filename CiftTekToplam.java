package BackEnd;

import java.util.Scanner;

public class CiftTekToplam {

	public CiftTekToplam() {
		// TODO Auto-generated constructor stub
	}
	
	static public void main(String[] args) {
		
	int sayi, i = 0, x = 0, count = 0;
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Lütfen bir sayı giriniz: ");
	sayi = input.nextInt();
	
	
	while (i < sayi) {
		
		i = i + 1;
		
		if (i % 12 == 0) {
			
			x = x + i;
			count++;

			System.out.println(x / count);	
			}
		
		}
	
	}
	

}
