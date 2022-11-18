package login;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);

		String kullanici_adi = "user", parola = "12345";

		System.out.print("Kullanici adi : ");
		String giris = inp.nextLine();
		System.out.print("Parola : ");
		String girisparola = inp.nextLine();

		if (giris.equals(kullanici_adi) && girisparola.equals(parola)) {
			System.out.print("Basarili sekilde giris yapildi.");

		} else {
			System.out.print("Giris bilgileriniz hatali, sifrenizi degistirmek isterseniz evet/hayir yazın.");
			String cevap = inp.next();
			if (cevap.equals("Evet")) {

				System.out.print("Yeni sifre giriniz : ");
				String sifre = inp.next();

				if (sifre.equals(parola)) {
					System.out.print("Sifre eskisi ile aynı!");

				} else {
					System.out.print("Sifre basarili sekilde degistirildi.");
					parola = sifre;
				}
			} else {
				System.out.print("Tekrar deneyin!");
			}
		}

	}

}
