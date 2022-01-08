package BackEnd;

import java.util.Scanner;

public class ArmstrongSayilari {

	public ArmstrongSayilari() {
		// TODO Auto-generated constructor stub
	}
	
	static public void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int number, counter = 0, baseVal, result = 0, basPow = 1, tempNum;
		
		System.out.print("Bir sayı giriniz: ");
		number = input.nextInt();
		
		tempNum = number;
		
		while (tempNum != 0) {
			tempNum /= 10;
			counter++;
		}
		
		tempNum = number;
		
		while (tempNum != 0) {
			baseVal = tempNum % 10;
			basPow = 1;
			
			for (int i = 1; i <= counter; i++) {
				
				basPow *= baseVal;	
			}
			
			result += basPow;
			tempNum /= 10;
		}
		
		if (result == number) {
			System.out.print(result + " bir Armostrong sayıdır.");
		} else {
			System.out.print(result + " bir Armostrong sayı değildir.");
		}
		
		
		
		
	}

}
