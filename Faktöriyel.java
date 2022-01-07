package BackEnd;

import java.util.Scanner;

public class Faktöriyel {

	public Faktöriyel() {
		// TODO Auto-generated constructor stub
	}
	
	static public void main(String[] args) {
		
		int n, r, totala = 1, totalb = 1, totalc = 1, y, z;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("İlk faktöriyel için rakam giriniz: ");
		n = input.nextInt();
		System.out.print("İkinci faktöriyel için rakam giriniz: ");
		r = input.nextInt();
		
		
		z = n - r;
		y = totala / (totalb * (totalc));
		
		for(int i = 1; i <= n; i++) {
			
			totala = totala * i;
			
		}
		
		for(int x = 1; x <= r; x++) {
			
			totalb = totalb * x;

		}
		
		for(int s = 1; s <= z; s++) {
			
			totalc = totalc * s;

		}
		
		System.out.println(totalc + "= son işlem");
		
		System.out.println(n + ". Faktöriyel: " + totala);
		System.out.println(r + ". Faktöriyel: " + totalb);
		System.out.println("C(" + n + "," + r + ") = " + y);
	}

}
