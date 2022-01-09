package BackEnd;

import java.util.Scanner;

public class EbobEkok {

	public EbobEkok() {
		// TODO Auto-generated constructor stub
	}
	
	static public void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int n1, n2, ebob = 1;
		
		System.out.print("N1 sayısını giriniz: ");
		n1 = input.nextInt();
		System.out.print("N2 sayısını giriniz: ");
		n2 = input.nextInt();
		
		for(int i = n1; i <= n1; i--) {
			if(n1 % i == 0 && n2 % i == 0) {
				ebob = i;
				System.out.println("EBOB = " + ebob);
				break;
			}
		}
		
		for(int x = 1; x <= (n1 * n2); x++) {
			if(x % n1 == 0 && x % n2 == 0) {
				System.out.println("EKOK = " + x);
				break;
			}
		}
	}
}
