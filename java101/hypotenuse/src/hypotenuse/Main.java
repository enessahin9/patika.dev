package hypotenuse;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Degiskenleri olusturalim.
		int a, b;
		double c;

		// Kullanicidan verileri alalim.
		Scanner girdi = new Scanner(System.in);
		System.out.print("1. Kenari giriniz : ");
		a = girdi.nextInt();
		System.out.print("2. Kenari giriniz : ");
		b = girdi.nextInt();

		c = Math.sqrt((a * a) + (b * b));
		System.out.println("Hipotenus : " + c);
	}

}
