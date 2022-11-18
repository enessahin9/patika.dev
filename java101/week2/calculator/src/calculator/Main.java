package calculator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input1 = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		Scanner x = new Scanner(System.in);
		double sonuc = 0, sayi1, sayi2;
		String islem;
		System.out.print("Bir sayi giriniz : ");
		sayi1 = input1.nextDouble();
		System.out.print("Bir islem giriniz : ");
		islem = x.nextLine();
		System.out.print("Bir sayi giriniz : ");
		sayi2 = input2.nextDouble();

		switch (islem) {
		case "+":
			sonuc = sayi1 + sayi2;
			break;
		case "-":
			sonuc = sayi1 - sayi2;
			break;
		case "/":
			sonuc = sayi1 / sayi2;
			break;
		case "*":
			sonuc = sayi1 * sayi2;
			break;

		default:
			System.out.println("Lütfen Yapılacak işlemi giriniz.");
			break;
		}
		System.out.println("İşlemin sonucu : " + sonuc);
	}
}
