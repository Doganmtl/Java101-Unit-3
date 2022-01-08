package BackEnd;

import java.util.Scanner;

public class ATM {

	public ATM() {
		// TODO Auto-generated constructor stub
	}
	
	static public void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String userName, userPassword;
		int count = 3, select, balance = 1500, money;
		boolean process = true;
		
		while (count > 0) { 
		System.out.print("Lütfen kullanıcı adınızı giriniz: ");
		userName = input.nextLine();
		System.out.print("Lütfen şifrenizi giriniz: ");
		userPassword = input.nextLine();
		
		if (userName.equals("patika") && userPassword.equals("dev123")) {
			
			System.out.println("Merhaba, Kodluyoruz Bankası'na hoşgeldiniz.");
			System.out.println("1)Para Yatırma,\n2)Para Çekme,\n3)Bakiye Sorgula,\n4)Çıkış yap.");
			System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz: ");
			select = input.nextInt();
			
			while (process) {
				switch (select) {
				case 1:
					System.out.print("Para miktarı: ");
					money = input.nextInt();
					balance += money;
					System.out.println("Güncel bakiye: " + balance);
					break;
				case 2:
					System.out.print("Para miktarı: ");
					money = input.nextInt();
					balance -= money;
					if (money > balance) {
						System.out.print("Yetersiz bakiye.");
					}
					break;
				case 3:
					System.out.print("Bakiyeniz: " + balance);
					break;
				case 4:
					System.out.print("Tekrar görüşmek üzere.");
					process = false;
					break;
					
				default:
					System.out.print("Hatalı işlem.");
				break;
				}
			}
			
		} else {
			count--;
			if (count == 0) {
				System.out.println("Hesabınız bloke edilmiştir, lütfen banka ile iletişime geçiniz.");
				break;
			} else {
				System.out.println("Kullanıcı adı veya şifre hatalı, lütfen tekrar deneyiniz.");
				System.out.println("Kalan hakkınız: " + count);
					}
				}
			}
		}
	}